package X;

import Y.AfS181S0100000_12;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedString;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0UH1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UH1 implements InterfaceC1267390j5N {
    public final InterfaceC769940UIe LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(473));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(472));
    public final C01GW LJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(471));

    @Override // X.InterfaceC1267390j5N
    public final void onComplete() {
        C20441214yg.LIZIZ("CaptureVideoUploadController", "onComplete");
        LIZJ(new C0VSJ((String) this.LJ.getValue()), "1", new AwS556S0100000_12(this, 873));
    }

    @Override // X.InterfaceC1267390j5N
    public final void onError(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error code:");
        sbLIZ.append(i);
        sbLIZ.append(" error msg:");
        sbLIZ.append(str);
        C20441214yg.LJ("CaptureVideoUploadController", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZJ(C0VSJ c0vsj, String str, Function0 function0) {
        if (c0vsj.exists() && c0vsj.isFile()) {
            MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
            multipartTypedOutput.addPart("video_type", new TypedString(str));
            multipartTypedOutput.addPart("file_type", new TypedString("4"));
            multipartTypedOutput.addPart("pixel_x", new TypedString(String.valueOf(this.LIZIZ)));
            multipartTypedOutput.addPart("pixel_y", new TypedString(String.valueOf(this.LIZJ)));
            multipartTypedOutput.addPart("data_size", new TypedString(String.valueOf(c0vsj.length())));
            multipartTypedOutput.addPart("data", new TypedFile("multipart/form-data", c0vsj));
            C11NJ c11nj = (C11NJ) this.LJI.getValue();
            C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
            c11nj.LIZ(C01QD.LIZ().LIZ().updateCaptureVideo(multipartTypedOutput).LJIILIIL(new C0UO0()).LJJLL(new C515801zg(function0, c0vsj, 55), new AfS181S0100000_12(c0vsj, 248)));
        }
    }

    public C0UH1(InterfaceC769940UIe interfaceC769940UIe, int i, int i2, boolean z) {
        this.LIZ = interfaceC769940UIe;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = z;
    }
}
