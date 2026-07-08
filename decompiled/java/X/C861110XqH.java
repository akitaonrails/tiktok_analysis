package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS547S0100000_3;
import njp.a;

/* JADX INFO: renamed from: X.0XqH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.toolbar.impl.EditToolbarStickerHandler$showDMGroupChatPromote$1$1", f = "Sticker.kt", l = {}, m = "invokeSuspend")
public final class C861110XqH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1462880oAg LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861110XqH(C1462880oAg c1462880oAg, boolean z, Function0<Unit> function0, InterfaceC1364105Vn<? super C861110XqH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1462880oAg;
        this.LLILLJJLI = z;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C861110XqH(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        LiveData<Void> liveDataWw2;
        C1C7U.LIZ("EditToolbarStickerHandler@e7af.showDMGroupChatPromote$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1462880oAg c1462880oAg = this.LL;
        C1664740tQG c1664740tQG = c1462880oAg.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1462880oAg.LLIZLLLIL;
        InterfaceC1455860nzM interfaceC1455860nzM = (InterfaceC1455860nzM) c1664740tQG.getValue(c1462880oAg, interfaceC2217461BqaArr[0]);
        if (interfaceC1455860nzM != null && (liveDataWw2 = interfaceC1455860nzM.ww2()) != null) {
            C1462880oAg c1462880oAg2 = this.LL;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) c1462880oAg2.LLILZLL.getValue(c1462880oAg2, interfaceC2217461BqaArr[2]);
            final boolean z = this.LLILLJJLI;
            final Function0<Unit> function0 = this.LLILLL;
            final C1462880oAg c1462880oAg3 = this.LL;
            liveDataWw2.observe(lifecycleOwner, new Observer() { // from class: X.0Xsj
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj2) {
                    if (z) {
                        C862640Xsk c862640Xsk = C1459970o5z.LLJLLL;
                        AwS430S0200000_29 awS430S0200000_29 = new AwS430S0200000_29((Function0) function0, (Function0<Unit>) c1462880oAg3, (C1462880oAg) 131);
                        c862640Xsk.getClass();
                        C862640Xsk.LIZIZ(awS430S0200000_29);
                        return;
                    }
                    C862640Xsk c862640Xsk2 = C1459970o5z.LLJLLL;
                    AwS547S0100000_3 awS547S0100000_3 = new AwS547S0100000_3(function0, (Function0<Unit>) 174);
                    c862640Xsk2.getClass();
                    C862640Xsk.LIZ("keva_repo_send_to_dm", "key_group_chat_sticker_guide", awS547S0100000_3);
                }
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditToolbarStickerHandler@e7af.showDMGroupChatPromote$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
