package X;

import android.text.Editable;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.TrendingPanelStickerChannel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UAh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.search.SearchStickerDialogView$fetchData$1", f = "SearchStickerDialogView.kt", l = {422, 428}, m = "invokeSuspend")
public final class C767890UAh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C767880UAg LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C767890UAh(C767880UAg c767880UAg, InterfaceC1364105Vn<? super C767890UAh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c767880UAg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C767890UAh(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Boolean boolValueOf;
        String string;
        AnonymousClass0956 anonymousClass0956;
        C1C7U.LIZ("SearchStickerDialogView@2b0d.fetchData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0956 anonymousClass09562 = this.LLILLJJLI.LLJILLL;
            if (anonymousClass09562 != null) {
                boolValueOf = Boolean.valueOf(anonymousClass09562.isActive());
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf) && (anonymousClass0956 = this.LLILLJJLI.LLJILLL) != null) {
                anonymousClass0956.LIZIZ(null);
            }
            Editable editableLLLFZ = C2204961BRm.LLLFZ(this.LLILLJJLI.LLILZLL, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYGZ1t7inJsr/5RQ7WLyU9ynfGA6SmPKpoHTd7sy7lqv8br2Vn5r0vmBlz7sbO", null));
            if (editableLLLFZ != null) {
                string = editableLLLFZ.toString();
            } else {
                string = null;
            }
            if (string != null && string.length() != 0) {
                C1DEK c1dek = this.LLILLJJLI.LLJILJIL.LLILLJJLI;
                C204500qZ c204500qZ = new C204500qZ(string);
                this.LL = 2;
                if (c1dek.LJIJI(c204500qZ, this) == objLJFF) {
                    C1C7U.LIZIZ("SearchStickerDialogView@2b0d.fetchData$1");
                    return objLJFF;
                }
            } else {
                List<LiveEffect> arrayList = (List) this.LLILLJJLI.LLILLJJLI.gg0(TrendingPanelStickerChannel.class);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                this.LLILLJJLI.LLJI = false;
                if (arrayList.isEmpty()) {
                    C767880UAg c767880UAg = this.LLILLJJLI;
                    c767880UAg.LLJJ = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(c767880UAg.LLJILJIL), null, null, new C767920UAk(c767880UAg, null), 3);
                    C1DEK c1dek2 = this.LLILLJJLI.LLJILJIL.LLILLJJLI;
                    C395501gH c395501gH = new C395501gH("trending");
                    this.LL = 1;
                    if (c1dek2.LJIJI(c395501gH, this) == objLJFF) {
                        C1C7U.LIZIZ("SearchStickerDialogView@2b0d.fetchData$1");
                        return objLJFF;
                    }
                } else {
                    C767880UAg c767880UAg2 = this.LLILLJJLI;
                    c767880UAg2.LJIILIIL(c767880UAg2.LLJILJILJ.LLILZ, arrayList);
                    this.LLILLJJLI.LLILZIL.scrollToPosition(0);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchStickerDialogView@2b0d.fetchData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
