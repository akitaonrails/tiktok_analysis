package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import com.ss.android.ugc.aweme.relation.usercard.ability.RecUserCellTrackAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0iva, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1261320iva extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;
    public final /* synthetic */ IUserCardListAbility LLILLL;
    public final /* synthetic */ RecUserCellTrackAbility LLILZ;
    public final /* synthetic */ C1261270ivV LLILZIL;
    public final /* synthetic */ C1261860iwS LLILZLL;
    public final /* synthetic */ Integer LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1261320iva(Context context, LifecycleOwner lifecycleOwner, IUserCardListAbility iUserCardListAbility, RecUserCellTrackAbility recUserCellTrackAbility, C1261270ivV c1261270ivV, C1261860iwS c1261860iwS, Integer num) {
        super(1);
        this.LL = context;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = iUserCardListAbility;
        this.LLILZ = recUserCellTrackAbility;
        this.LLILZIL = c1261270ivV;
        this.LLILZLL = c1261860iwS;
        this.LLIZ = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        Context context = this.LL;
        LifecycleOwner lifecycleOwner = this.LLILLJJLI;
        IUserCardListAbility iUserCardListAbility = this.LLILLL;
        RecUserCellTrackAbility recUserCellTrackAbility = this.LLILZ;
        C1261860iwS c1261860iwS = this.LLILZLL;
        C1261270ivV c1261270ivV = this.LLILZIL;
        if (context != null && lifecycleOwner != null && iUserCardListAbility != null && recUserCellTrackAbility != null) {
            C1261250ivT.LIZ.getClass();
            C1261250ivT.LJ(context, lifecycleOwner, c1261860iwS, iUserCardListAbility, recUserCellTrackAbility, c1261270ivV);
        }
        C1261270ivV c1261270ivV2 = this.LLILZIL;
        if (c1261270ivV2 != null) {
            Integer num = this.LLIZ;
            C1261250ivT c1261250ivT = C1261250ivT.LIZ;
            EnumC1261310ivZ enumC1261310ivZ = EnumC1261310ivZ.SHARE_PROFILE;
            c1261250ivT.getClass();
            C1261250ivT.LIZIZ(enumC1261310ivZ, c1261270ivV2, num);
        }
        return Unit.LIZ;
    }
}
