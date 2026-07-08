package X;

import android.text.Editable;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MDY, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.ailive.AILivePhotoScene$showKeyBoard$1", f = "AILivePhotoScene.kt", l = {475}, m = "invokeSuspend")
public final class C0MDY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0MDX LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MDY(C0MDX c0mdx, InterfaceC1364105Vn<? super C0MDY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0mdx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MDY(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int length;
        C1C7U.LIZ("AILivePhotoScene@4ddd.showKeyBoard$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(48L, this) == objLJFF) {
                C1C7U.LIZIZ("AILivePhotoScene@4ddd.showKeyBoard$1");
                return objLJFF;
            }
        }
        ((SoftKeyBoardListener) this.LLILLJJLI.LLJLILLLLZIIL.getValue()).LIZIZ(this.LLILLJJLI);
        this.LLILLJJLI.LLLLLJIL().requestFocus();
        C0I7D c0i7dLLLLLJIL = this.LLILLJJLI.LLLLLJIL();
        Editable editableLLLLJI = C2204961BRm.LLLLJI(this.LLILLJJLI.LLLLLJIL(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yD0HZ4QeWTB9SdOOpmZTFjztWs4BJQP1JU=", null));
        if (editableLLLLJI != null) {
            length = editableLLLLJI.length();
        } else {
            length = 0;
        }
        c0i7dLLLLLJIL.setSelection(length);
        KeyboardUtils.LIZIZ(this.LLILLJJLI.requireSceneContext(), this.LLILLJJLI.LLLLLJIL());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AILivePhotoScene@4ddd.showKeyBoard$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
