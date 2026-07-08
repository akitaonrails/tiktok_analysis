package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ktm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.node.DownloadTemplateZipNodeKt$downloadTemplateZipNode$1", f = "DownloadTemplateZipNode.kt", l = {29}, m = "invokeSuspend")
public final class C532040Ktm extends C09AX implements Function2<C532050Ktn, InterfaceC1364105Vn<? super C189200o6<? extends NLETemplateModel>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C532040Ktm(InterfaceC1364105Vn<? super C532040Ktm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C532040Ktm c532040Ktm = new C532040Ktm(interfaceC1364105Vn);
        c532040Ktm.LLILLJJLI = obj;
        return c532040Ktm;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C532050Ktn c532050Ktn, InterfaceC1364105Vn<? super C189200o6<? extends NLETemplateModel>> interfaceC1364105Vn) {
        return ((a) create(c532050Ktn, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C532050Ktn c532050Ktn;
        C1C7U.LIZ("DownloadTemplateZipNodeKt@1c17.downloadTemplateZipNode$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                c532050Ktn = (C532050Ktn) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c532050Ktn = (C532050Ktn) this.LLILLJJLI;
            C532310KuD c532310KuD = C532310KuD.LIZ;
            Context contextN3 = C786410Ut5.N3(c532050Ktn.LIZ);
            String str = c532050Ktn.LIZIZ;
            String str2 = c532050Ktn.LIZJ;
            String str3 = c532050Ktn.LIZLLL;
            boolean z = c532050Ktn.LJ;
            this.LLILLJJLI = c532050Ktn;
            this.LL = 1;
            obj = c532310KuD.LIZIZ(contextN3, str, str2, str3, z, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DownloadTemplateZipNodeKt@1c17.downloadTemplateZipNode$1");
                return objLJFF;
            }
        }
        if (obj == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("download template zip failed, id=");
            sbLIZ.append(c532050Ktn.LIZIZ);
            obj = C0FQL.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            C189200o6.m2constructorimpl(obj);
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(obj);
        C1C7U.LIZIZ("DownloadTemplateZipNodeKt@1c17.downloadTemplateZipNode$1");
        return c189200o6M1boximpl;
    }
}
