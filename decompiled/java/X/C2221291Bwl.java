package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.1Bwl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2221291Bwl implements InterfaceC2221401Bww {
    public final int LIZ;
    public volatile long LIZIZ;
    public volatile int LIZJ;
    public Exception LIZLLL;
    public final byte[] LJ;
    public volatile EnumC2221351Bwr LJFF;
    public final /* synthetic */ C2221281Bwk LJI;

    @Override // X.InterfaceC2221401Bww
    public final void execute() {
        C2221381Bwu c2221381Bwu;
        long j;
        Iterator<C2221381Bwu> it2 = this.LJI.LJIIL.iterator();
        do {
            c2221381Bwu = null;
            if (!it2.hasNext()) {
                break;
            } else {
                c2221381Bwu = it2.next();
            }
        } while (this.LIZ != c2221381Bwu.LIZ);
        if (c2221381Bwu == null) {
            if (this.LJI.LJIIL.isEmpty()) {
                C2221281Bwk c2221281Bwk = this.LJI;
                c2221281Bwk.LJII(true, "[SliceConsume] createSliceIfNeed mMp4HeaderSize:%d", Long.valueOf(c2221281Bwk.LJI));
                if (this.LJI.LJI <= 0) {
                    this.LJI.LJII(true, "[SliceConsume] sliceModel=null consume wait", new Object[0]);
                    this.LJFF = EnumC2221351Bwr.CONSUME_WAIT_DATA;
                    return;
                }
                j = this.LJI.LJI;
            } else {
                C2221381Bwu last = this.LJI.LJIIL.getLast();
                j = ((long) last.LIZJ) + last.LIZIZ;
                if (this.LJI.LJII) {
                    if (this.LIZ == 0) {
                        this.LIZIZ = this.LJI.LJI;
                    } else if (j >= this.LJI.LJIILJJIL.length()) {
                        this.LIZIZ = 0L;
                    }
                    j = 0;
                }
            }
            c2221381Bwu = new C2221381Bwu(this.LIZ, j, (int) this.LIZIZ);
        }
        long length = this.LJI.LJIILJJIL.length();
        if (length == 0) {
            C2221281Bwk c2221281Bwk2 = this.LJI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parallel_upload_file_delete_on_consume OutputFileLength:");
            sbLIZ.append(length);
            sbLIZ.append(" UploadStatus:");
            sbLIZ.append(this.LJI.LJIIIIZZ);
            c2221281Bwk2.LJII(true, C2188811AlT.LIZIZ(sbLIZ), new Object[0]);
            C543670LTx c543670LTx = new C543670LTx();
            c543670LTx.LIZ.put("OutputFileLength", Long.valueOf(length));
            c543670LTx.LIZ.put("UploadStatus", this.LJI.LJIIIIZZ == null ? "null" : this.LJI.LJIIIIZZ.toString());
            C1637890six.LIZIZ("parallel_upload_file_delete_on_consume", c543670LTx.LJ());
        }
        try {
            if (c2221381Bwu.LIZIZ + ((long) c2221381Bwu.LIZJ) > this.LJI.LJIILJJIL.length()) {
                if (!this.LJI.LJII) {
                    this.LJFF = EnumC2221351Bwr.CONSUME_WAIT_DATA;
                    return;
                }
                c2221381Bwu.LIZJ = (int) (this.LJI.LJIILJJIL.length() - c2221381Bwu.LIZIZ);
            }
            this.LIZJ = c2221381Bwu.LIZJ;
            seek(c2221381Bwu.LIZIZ);
            int i = c2221381Bwu.LIZJ;
            if (i < 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ArrayIndexOutOfBoundsException sliceModel.getOffset():");
                sbLIZ2.append(c2221381Bwu.LIZIZ);
                sbLIZ2.append("  mOutputFile.length():");
                sbLIZ2.append(this.LJI.LJIILJJIL.length());
                C2344809Gs.LJI(new Exception(C2188811AlT.LIZIZ(sbLIZ2)));
                LIZ(EnumC2221351Bwr.CONSUME_FAIL);
                return;
            }
            read(this.LJ, 0, i);
            this.LJI.LJIIL.add(c2221381Bwu);
            if (c2221381Bwu.LIZIZ == 0 && c2221381Bwu.LIZJ == 0) {
                LIZ(EnumC2221351Bwr.CONSUME_END);
            } else {
                LIZ(EnumC2221351Bwr.CONSUME_DONE);
            }
            this.LJI.LJII(false, "consume execute %d-%d", Long.valueOf(c2221381Bwu.LIZIZ), Long.valueOf(c2221381Bwu.LIZIZ + ((long) c2221381Bwu.LIZJ)));
            this.LJI.LJII(true, "consume execute %d-%d", Long.valueOf(c2221381Bwu.LIZIZ), Long.valueOf(c2221381Bwu.LIZIZ + ((long) c2221381Bwu.LIZJ)));
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZLLL = e;
            LIZ(EnumC2221351Bwr.CONSUME_FAIL);
        }
    }

    public final void LIZ(EnumC2221351Bwr enumC2221351Bwr) {
        ((ReentrantLock) this.LJI.LIZJ).lock();
        this.LJFF = enumC2221351Bwr;
        this.LJI.LIZLLL.signalAll();
        ((ReentrantLock) this.LJI.LIZJ).unlock();
    }

    public C2221291Bwl(C2221281Bwk c2221281Bwk, int i, byte[] bArr, int i2) {
        this.LJI = c2221281Bwk;
        this.LIZ = i;
        this.LJ = bArr;
        this.LIZIZ = i2;
    }
}
