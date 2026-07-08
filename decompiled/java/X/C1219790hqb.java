package X;

import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hqb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoCutter$1$getAFileInfoTask$1", f = "CutOptimizedVideoCutter.kt", l = {}, m = "invokeSuspend")
public final class C1219790hqb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1462980oAq LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219790hqb(C1462980oAq c1462980oAq, InterfaceC1364105Vn<? super C1219790hqb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1462980oAq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1219790hqb(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CutOptimizedVideoCutter@5478.<init>$1$getAFileInfoTask$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<MultiEditVideoSegmentRecordData> list = this.LL.LIZLLL().segmentDataList;
        C1462980oAq c1462980oAq = this.LL;
        int i = 0;
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
            int i2 = i + 1;
            if (i >= 0) {
                String str = multiEditVideoSegmentRecordData.audioPath;
                if (str != null && ((LinkedHashMap) c1462980oAq.LJ).get(str) == null) {
                    String strOf = c1462980oAq.LIZ.Of(1, c1462980oAq.LIZ.Qf(), i, str);
                    if (strOf == null) {
                        strOf = "";
                    }
                    c1462980oAq.LJ.put(str, strOf);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CutOptimizedVideoCutter@5478.<init>$1$getAFileInfoTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
