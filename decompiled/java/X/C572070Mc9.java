package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Mc9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.editcontainer.TextToImageEditContainerScene$onSoftKeyBoardChangeListener$1$keyBoardHide$1", f = "TextToImageEditContainerScene.kt", l = {151}, m = "invokeSuspend")
public final class C572070Mc9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C572260McS LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C572070Mc9(C572260McS c572260McS, InterfaceC1364105Vn<? super C572070Mc9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c572260McS;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C572070Mc9(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextToImageEditContainerScene@c934.onSoftKeyBoardChangeListener$1$keyBoardHide$1");
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
            String str = this.LLILLJJLI.LLLILZ().creativeModel.text2ImageModel.text;
            if (str != null && str.length() != 0) {
                C572260McS c572260McS = this.LLILLJJLI;
                C1664750tQH c1664750tQH = c572260McS.LLJJJJLIIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C572260McS.LLJZIJLIL;
                if (((InterfaceC572090McB) c1664750tQH.getValue(c572260McS, interfaceC2217461BqaArr[4])).WE()) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TextToImageEditContainerScene@c934.onSoftKeyBoardChangeListener$1$keyBoardHide$1");
                    return unit;
                }
                C572260McS c572260McS2 = this.LLILLJJLI;
                C0CSH c0csh = (C0CSH) c572260McS2.LLJJJIL.getValue(c572260McS2, interfaceC2217461BqaArr[1]);
                C1313705Cd c1313705Cd = new C1313705Cd(null);
                this.LL = 1;
                if (c0csh.LIZ(this, c1313705Cd) == objLJFF) {
                    C1C7U.LIZIZ("TextToImageEditContainerScene@c934.onSoftKeyBoardChangeListener$1$keyBoardHide$1");
                    return objLJFF;
                }
            } else {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("TextToImageEditContainerScene@c934.onSoftKeyBoardChangeListener$1$keyBoardHide$1");
                return unit2;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("TextToImageEditContainerScene@c934.onSoftKeyBoardChangeListener$1$keyBoardHide$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
