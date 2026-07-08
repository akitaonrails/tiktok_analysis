package X;

import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08zL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AutoPickFrameUploadTask$run$uploadResult$1", f = "AutoPickFrameUploadTask.kt", l = {198}, m = "invokeSuspend")
public final class C2297308zL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends String, ? extends String>>, Object> {
    public int LL;
    public final /* synthetic */ C0LKL LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ UploadImageConfig LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2297308zL(C0LKL c0lkl, String str, UploadImageConfig uploadImageConfig, InterfaceC1364105Vn<? super C2297308zL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0lkl;
        this.LLILLL = str;
        this.LLILZ = uploadImageConfig;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2297308zL(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoPickFrameUploadTask@d4a9.run$uploadResult$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0LKL c0lkl = this.LLILLJJLI;
            String str = this.LLILLL;
            UploadImageConfig uploadImageConfig = this.LLILZ;
            this.LL = 1;
            c0lkl.getClass();
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            if (!C2286708xd.LIZJ(str)) {
                Pair pair = new Pair(null, "zipPath not exists");
                C189200o6.m2constructorimpl(pair);
                c23260099m.resumeWith(pair);
            } else {
                final C2207811Bb1 c2207811Bb1 = new C2207811Bb1(uploadImageConfig);
                c2207811Bb1.LJIIIZ(1, new String[]{str});
                c2207811Bb1.LJIIJ(new InterfaceC2207871Bb7() { // from class: X.08zK
                    @Override // X.InterfaceC2207871Bb7
                    public final void LIZ(int i2, long j, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
                        Long lValueOf;
                        String str2;
                        String str3;
                        c2207811Bb1.getClass();
                        if (i2 == 6) {
                            if (imageUploadInfo == null || (str3 = imageUploadInfo.mImageToskey) == null) {
                                str3 = "";
                            }
                            C0LKH c0lkh = C0LKH.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("upload success, tosKey=");
                            sbLIZ.append(str3);
                            C201955140j.LIZLLL(c0lkh, "AutoPickFrameUpload", C2188811AlT.LIZIZ(sbLIZ));
                            c2207811Bb1.LIZJ();
                            InterfaceC1364105Vn<Pair<String, String>> interfaceC1364105Vn = c23260099m;
                            Pair pair2 = new Pair(str3, "");
                            C189200o6.m2constructorimpl(pair2);
                            interfaceC1364105Vn.resumeWith(pair2);
                            return;
                        }
                        c2207811Bb1.getClass();
                        if (i2 != 7) {
                            return;
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("upload failed: ");
                        if (imageUploadInfo != null) {
                            lValueOf = Long.valueOf(imageUploadInfo.mErrorCode);
                        } else {
                            lValueOf = null;
                        }
                        sbLIZ2.append(lValueOf);
                        sbLIZ2.append(':');
                        if (imageUploadInfo != null) {
                            str2 = imageUploadInfo.mErrorMsg;
                        } else {
                            str2 = null;
                        }
                        sbLIZ2.append(str2);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        C201955140j.LJFF("AutoPickFrameUpload", strLIZIZ);
                        c2207811Bb1.LIZJ();
                        InterfaceC1364105Vn<Pair<String, String>> interfaceC1364105Vn2 = c23260099m;
                        Pair pair3 = new Pair(null, strLIZIZ);
                        C189200o6.m2constructorimpl(pair3);
                        interfaceC1364105Vn2.resumeWith(pair3);
                    }

                    @Override // X.InterfaceC2207871Bb7
                    public final void onLog(int i2, int i3, String str2) {
                        C0LKH c0lkh = C0LKH.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("upload log: ");
                        sbLIZ.append(i2);
                        sbLIZ.append(", ");
                        sbLIZ.append(i3);
                        sbLIZ.append(", ");
                        sbLIZ.append(str2);
                        C201955140j.LIZLLL(c0lkh, "AutoPickFrameUpload", C2188811AlT.LIZIZ(sbLIZ));
                    }
                });
                c2207811Bb1.LJIILIIL();
            }
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AutoPickFrameUploadTask@d4a9.run$uploadResult$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AutoPickFrameUploadTask@d4a9.run$uploadResult$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends String, ? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
