package X;

import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05yz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inboxentrance.InboxGroupChatIconEventDelegate$trackClickCreateGroup$1", f = "InboxGroupChatIconEventDelegate.kt", l = {}, m = "invokeSuspend")
public final class C1530705yz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1493105sv LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1530705yz(InterfaceC1493105sv interfaceC1493105sv, boolean z, int i, InterfaceC1364105Vn<? super C1530705yz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1493105sv;
        this.LLILLJJLI = z;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1530705yz(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("InboxGroupChatIconEventDelegate@2fb1.trackClickCreateGroup$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1493105sv interfaceC1493105sv = this.LL;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("has_menu", C1529305yl.LIZ(Boolean.valueOf(this.LLILLJJLI)));
        pairArr[1] = new Pair("enter_from", "notification_page");
        pairArr[2] = new Pair("enter_method", "inbox_top_left");
        C1530805z0 c1530805z0 = C1530805z0.LIZ;
        int i = this.LLILLL;
        c1530805z0.getClass();
        if (i == R.raw.icon_two_person_plus) {
            str = "4";
        } else if (i == R.raw.icon_person_plus) {
            str = "5";
        } else {
            str = "3";
        }
        pairArr[3] = new Pair("icon_version", str);
        pairArr[4] = new Pair("group_owner_account_type", C1528505yd.LIZ(C461720I8s.LIZIZ()));
        interfaceC1493105sv.sendEvent("click_create_group", C2097608Jq.LJIIIIZZ(pairArr));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxGroupChatIconEventDelegate@2fb1.trackClickCreateGroup$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
