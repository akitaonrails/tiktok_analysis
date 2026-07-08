package X;

import android.graphics.Bitmap;
import android.graphics.NinePatch;
import android.graphics.Rect;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextBgConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Xmo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editSticker.text.effect.EffectEditText$initBgRes$2$2", f = "EffectEditText.kt", l = {}, m = "invokeSuspend")
public final class C858960Xmo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InnerEffectTextConfig LL;
    public final /* synthetic */ C12K3 LLILLJJLI;
    public final /* synthetic */ ArrayList<C1644460stY<InnerEffectTextBgConfig, Bitmap, NinePatch, Rect>> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C858960Xmo(InnerEffectTextConfig innerEffectTextConfig, C12K3 c12k3, ArrayList<C1644460stY<InnerEffectTextBgConfig, Bitmap, NinePatch, Rect>> arrayList, InterfaceC1364105Vn<? super C858960Xmo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = innerEffectTextConfig;
        this.LLILLJJLI = c12k3;
        this.LLILLL = arrayList;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C858960Xmo(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectEditText@7b22.initBgRes$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (Intrinsics.LJFF(this.LL, this.LLILLJJLI.getInnerTextConfig())) {
            ((ArrayList) this.LLILLJJLI.LLJIJIL).clear();
            ((ArrayList) this.LLILLJJLI.LLJIJIL).addAll(this.LLILLL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectEditText@7b22.initBgRes$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
