package X;

import android.content.Context;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinDraftAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditInputAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEditViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OWc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinDraftAssem$initInputContent$1", f = "BulletinDraftAssem.kt", l = {}, m = "invokeSuspend")
public final class C620680OWc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BulletinDraftAssem LLILLJJLI;
    public final /* synthetic */ C0I7D LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C620680OWc(BulletinDraftAssem bulletinDraftAssem, C0I7D c0i7d, String str, InterfaceC1364105Vn<? super C620680OWc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinDraftAssem;
        this.LLILLL = c0i7d;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C620680OWc c620680OWc = new C620680OWc(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c620680OWc.LL = obj;
        return c620680OWc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        C1C7U.LIZ("BulletinDraftAssem@dc79.initInputContent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LLILLJJLI.xD()) {
            this.LLILLJJLI.m247do(this.LLILLL, true);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("BulletinDraftAssem@dc79.initInputContent$1");
            return unit;
        }
        BulletinDraftAssem bulletinDraftAssem = this.LLILLJJLI;
        String str = this.LLILZ;
        Context context = bulletinDraftAssem.getContext();
        if (context == null) {
            pair = new Pair(null, null);
        } else {
            AssemVMLazy assemVMLazy = bulletinDraftAssem.LLILZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BulletinDraftAssem.LLJI;
            String str2 = ((C619990OTl) assemVMLazy.getValue().getState()).LLILZIL.LIZIZ;
            if (str != null && str.length() != 0) {
                pair = new Pair(bulletinDraftAssem.bo(context, str2), str);
            } else {
                pair = new Pair(bulletinDraftAssem.bo(context, str2), null);
            }
        }
        String str3 = (String) pair.getFirst();
        String str4 = (String) pair.getSecond();
        this.LLILLJJLI.LLILZLL = str3;
        BulletinEditInputAbility bulletinEditInputAbility = (BulletinEditInputAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LLILLJJLI), BulletinEditInputAbility.class, null);
        if (bulletinEditInputAbility != null) {
            bulletinEditInputAbility.setHintText(str3);
        } else {
            C0I7D c0i7d = this.LLILLL;
            if (c0i7d != null) {
                c0i7d.setHint(str3);
            }
        }
        if (str4 != null && str4.length() != 0) {
            C0I7D c0i7d2 = this.LLILLL;
            if (c0i7d2 != null) {
                c0i7d2.setText(str4);
            }
            C0I7D c0i7d3 = this.LLILLL;
            if (c0i7d3 != null) {
                c0i7d3.setSelection(str4.length());
            }
        }
        BulletinDraftAssem bulletinDraftAssem2 = this.LLILLJJLI;
        Pair<String, String> pair2 = bulletinDraftAssem2.LLILZIL;
        if (pair2 != null) {
            ((BulletinEditViewModel) bulletinDraftAssem2.LLILLJJLI.getValue()).LLILZIL.put("topic_text", pair2.getFirst());
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BulletinDraftAssem@dc79.initInputContent$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
