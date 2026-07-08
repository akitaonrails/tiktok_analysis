package X;

import com.ss.android.ugc.aweme.friendstab.ui.input.viewmodel.FriendsTextPublishViewModel;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mPk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.ui.input.viewmodel.FriendsTextPublishViewModel$mobExit$1", f = "FriendsTextPublishViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1395340mPk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FriendsTextPublishViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1395340mPk(FriendsTextPublishViewModel friendsTextPublishViewModel, InterfaceC1364105Vn<? super C1395340mPk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = friendsTextPublishViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1395340mPk(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("FriendsTextPublishViewModel@58e.mobExit$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C109100bB c109100bB = C109100bB.LIZ;
        Pair[] pairArr = new Pair[4];
        C1395350mPl c1395350mPl = this.LL.getState().LLIZ;
        String str3 = null;
        if (c1395350mPl != null) {
            str = c1395350mPl.LIZ;
        } else {
            str = null;
        }
        pairArr[0] = new Pair("enter_from", str);
        C1395350mPl c1395350mPl2 = this.LL.getState().LLIZ;
        if (c1395350mPl2 != null) {
            str2 = c1395350mPl2.LIZIZ;
        } else {
            str2 = null;
        }
        pairArr[1] = new Pair("enter_method", str2);
        C1395350mPl c1395350mPl3 = this.LL.getState().LLIZ;
        if (c1395350mPl3 != null) {
            str3 = c1395350mPl3.LIZ;
        }
        pairArr[2] = new Pair("shoot_enter_from", str3);
        pairArr[3] = new Pair("is_has_last_content", C2286608xc.LJ(this.LL.getState().LLILZ ? 1 : 0));
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        c109100bB.getClass();
        C109100bB.LIZ("ttsocial_friend_tab_text_publish_cell_exit", mapLJIIIIZZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FriendsTextPublishViewModel@58e.mobExit$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
