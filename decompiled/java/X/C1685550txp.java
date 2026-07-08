package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.relation.ffp.nearby.ui.UserMatchedAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS132S1100000_18;
import kotlin.jvm.internal.AwS58S0500000_25;

/* JADX INFO: renamed from: X.0txp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685550txp extends C09AY implements Function1<C1378605aS, Unit> {
    public final /* synthetic */ UserMatchedAssem LL;
    public final /* synthetic */ C1687730u1L LLILLJJLI;
    public final /* synthetic */ FragmentManager LLILLL;
    public final /* synthetic */ LifecycleOwner LLILZ;
    public final /* synthetic */ C1685510txl LLILZIL;
    public final /* synthetic */ C1687630u1B LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1685550txp(UserMatchedAssem userMatchedAssem, C1687730u1L c1687730u1L, FragmentManager fragmentManager, LifecycleOwner lifecycleOwner, C1685510txl c1685510txl, C1687630u1B c1687630u1B, String str) {
        super(1);
        this.LL = userMatchedAssem;
        this.LLILLJJLI = c1687730u1L;
        this.LLILLL = fragmentManager;
        this.LLILZ = lifecycleOwner;
        this.LLILZIL = c1685510txl;
        this.LLILZLL = c1687630u1B;
        this.LLIZ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1378605aS c1378605aS) {
        UserMatchedAssem userMatchedAssem = this.LL;
        C1687730u1L c1687730u1L = this.LLILLJJLI;
        FragmentManager fragmentManager = this.LLILLL;
        LifecycleOwner lifecycleOwner = this.LLILZ;
        final C1685510txl c1685510txl = this.LLILZIL;
        AwS132S1100000_18 awS132S1100000_18 = new AwS132S1100000_18(this.LLILZLL, this.LLIZ, 11);
        userMatchedAssem.getClass();
        C1685530txn c1685530txn = C1685530txn.LIZ;
        String str = c1685510txl.LIZIZ;
        c1685530txn.getClass();
        C1685530txn.LIZ(str, "show");
        C1390850mIV c1390850mIV = new C1390850mIV();
        String nickname = c1687730u1L.LIZ.getNickname();
        if (nickname == null) {
            nickname = "";
        }
        c1390850mIV.LIZ.LLJJIJI = nickname;
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZ = C1383370m6R.LJIIJ(R.string.eh0);
        c1247510iZJ.LIZJ = 1;
        c1247510iZJ.LIZ(new AwS58S0500000_25(userMatchedAssem, lifecycleOwner, c1687730u1L, awS132S1100000_18, c1685510txl, 10));
        c1390850mIV.LIZIZ(c1247510iZJ);
        c1390850mIV.LIZ.LL = new DialogInterface.OnCancelListener() { // from class: X.0txo
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C1685530txn c1685530txn2 = C1685530txn.LIZ;
                String str2 = c1685510txl.LIZIZ;
                c1685530txn2.getClass();
                C1685530txn.LIZ(str2, "cancel");
            }
        };
        c1390850mIV.LIZJ().show(fragmentManager, "UserMatchedAssem");
        return Unit.LIZ;
    }
}
