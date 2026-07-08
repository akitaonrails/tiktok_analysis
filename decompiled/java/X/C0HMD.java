package X;

import android.view.View;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.socialavatar.viewmodel.v2.SocialAvatarCreationViewModelV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0HMD, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HMD extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ LiveData<C535700Kzg> LLILLJJLI;
    public final /* synthetic */ SocialAvatarCreationViewModelV2 LLILLL;
    public final /* synthetic */ InterfaceC439650HLv LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ C0HM3 LLILZLL;
    public final /* synthetic */ View LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;
    public final /* synthetic */ Function0<Unit> LLJ;
    public final /* synthetic */ Function0<Unit> LLJI;
    public final /* synthetic */ int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HMD(boolean z, LiveData<C535700Kzg> liveData, SocialAvatarCreationViewModelV2 socialAvatarCreationViewModelV2, InterfaceC439650HLv interfaceC439650HLv, int i, C0HM3 c0hm3, View view, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i2) {
        super(2);
        this.LL = z;
        this.LLILLJJLI = liveData;
        this.LLILLL = socialAvatarCreationViewModelV2;
        this.LLILZ = interfaceC439650HLv;
        this.LLILZIL = i;
        this.LLILZLL = c0hm3;
        this.LLIZ = view;
        this.LLIZLLLIL = function0;
        this.LLJ = function02;
        this.LLJI = function03;
        this.LLJIJIL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1666000tSI.LIZLLL(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJIJIL | 1));
        return Unit.LIZ;
    }
}
