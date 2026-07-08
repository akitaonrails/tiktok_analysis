package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DrB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.sdk.smartmovie.network.NetRequest$restoreNLEModel$2", f = "NetRequest.kt", l = {}, m = "invokeSuspend")
public final class C352070DrB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super NLEModel>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C23186096q LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C352070DrB(String str, C23186096q c23186096q, InterfaceC1364105Vn<? super C352070DrB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c23186096q;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C352070DrB c352070DrB = new C352070DrB(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c352070DrB.LL = obj;
        return c352070DrB;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        NLETrack next;
        C1C7U.LIZ("NetRequest@98a9.restoreNLEModel$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LLILLJJLI;
        C23186096q c23186096q = this.LLILLL;
        Object obj3 = null;
        try {
            NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
            NLEError nLEErrorRestore = nLEEditorLIZ.restore(str);
            nLEEditorLIZ.commit();
            nLEEditorLIZ.done();
            NLEModel model = nLEEditorLIZ.getModel();
            C1419410n2Z.LIZ.getClass();
            C1419410n2Z.LIZJ("restoreNLEModel", model, str, c23186096q, "", nLEErrorRestore);
            Iterator<NLETrack> it2 = model.getTracks().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getTrackType() == NLETrackType.AUDIO) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NLETrack nLETrack = next;
            if (nLETrack != null) {
                model.removeTrack(nLETrack);
            }
            C189200o6.m2constructorimpl(model);
            obj2 = model;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj2 = c098200Yq;
        }
        if (!C189200o6.m7isFailureimpl(obj2)) {
            obj3 = obj2;
        }
        C1C7U.LIZIZ("NetRequest@98a9.restoreNLEModel$2");
        return obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super NLEModel> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
