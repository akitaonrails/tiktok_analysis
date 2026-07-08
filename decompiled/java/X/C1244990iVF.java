package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestData;
import com.ss.android.ugc.aweme.notification.v2.cell.FollowRequestCell;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0iVF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.v2.cell.FollowRequestCell$showFollowBtn$1", f = "FollowRequestCell.kt", l = {}, m = "invokeSuspend")
public final class C1244990iVF extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ User LL;
    public final /* synthetic */ FollowRequestCell LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1244990iVF(User user, FollowRequestCell followRequestCell, InterfaceC1364105Vn<? super C1244990iVF> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = user;
        this.LLILLJJLI = followRequestCell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1244990iVF(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        FollowRequestData followRequestData;
        Bundle arguments;
        Object obj2;
        Object obj3;
        EnumC1260930iux enumC1260930iux;
        C1C7U.LIZ("FollowRequestCell@3cad.showFollowBtn$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C01GW c01gw = C1245020iVI.LIZ;
        if (C1245020iVI.LIZJ(this.LL)) {
            if (this.LL.getFollowStatus() == C0SY7.UNFOLLOW.ordinal()) {
                enumC1260930iux = EnumC1260930iux.FOLLOW;
            } else {
                enumC1260930iux = EnumC1260930iux.ENTER_CHAT;
            }
            C1260910iuv c1260910iuv = new C1260910iuv(0);
            c1260910iuv.LJJJJZI(this.LL);
            c1260910iuv.LJJIJLIJ("notification_page");
            c1260910iuv.LJJJJIZL("follow_request");
            c1260910iuv.LJJLIIIJJI = enumC1260930iux;
            c1260910iuv.LJJLIIIJILLIZJL = EnumC1260920iuw.RELATION_LABEL;
            c1260910iuv.LJJJJLL();
            c1260910iuv.LJIILJJIL();
        }
        FollowRequestCell followRequestCell = this.LLILLJJLI;
        C1900990zZJ c1900990zZJ = (C1900990zZJ) followRequestCell.getItem();
        Object obj4 = null;
        if (c1900990zZJ != null) {
            followRequestData = c1900990zZJ.LL;
        } else {
            followRequestData = null;
        }
        followRequestCell.N5(followRequestData);
        C1252240igw c1252240igw = C1252240igw.LIZ;
        Context context = this.LLILLJJLI.itemView.getContext();
        FollowRequestCell followRequestCell2 = this.LLILLJJLI;
        User user = followRequestCell2.LLJ;
        String str = followRequestCell2.LLJI;
        boolean z = !C1336205Ku.LIZJ().LIZJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Fragment fragmentLIZ = C946803n0.LIZ(this.LLILLJJLI.itemView);
        if (fragmentLIZ != null && (arguments = fragmentLIZ.getArguments()) != null) {
            try {
                obj2 = arguments.get("is_from_push");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj2 = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj2 = null;
            }
            if (!Intrinsics.LJFF(obj2, C2286608xc.LJ(1))) {
                arguments = null;
            }
            if (arguments != null) {
                linkedHashMap.put("is_from_push", "1");
                try {
                    obj3 = arguments.get("push_type");
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    obj3 = null;
                } catch (OutOfMemoryError e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    obj3 = null;
                }
                linkedHashMap.put("push_type", String.valueOf(obj3));
                try {
                    obj4 = arguments.get("push_id");
                } catch (Exception e5) {
                    TryCatchGuardChecker.doCheck(e5);
                } catch (OutOfMemoryError e6) {
                    TryCatchGuardChecker.doCheck(e6);
                }
                linkedHashMap.put("push_id", String.valueOf(obj4));
            }
        }
        Boolean boolValueOf = Boolean.valueOf(C1252240igw.LIZ(c1252240igw, context, user, str, z, linkedHashMap, 248));
        C1C7U.LIZIZ("FollowRequestCell@3cad.showFollowBtn$1");
        return boolValueOf;
    }
}
