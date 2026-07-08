package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoListViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hu2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoListViewModel$loadVideos$1", f = "ProfileBgVideoListViewModel.kt", l = {47}, m = "invokeSuspend")
public final class C455760Hu2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ProfileBgVideoListViewModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C455760Hu2(ProfileBgVideoListViewModel profileBgVideoListViewModel, boolean z, String str, String str2, InterfaceC1364105Vn<? super C455760Hu2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = profileBgVideoListViewModel;
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C455760Hu2(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        EnumC455750Hu1 enumC455750Hu1;
        C1C7U.LIZ("ProfileBgVideoListViewModel@a3c4.loadVideos$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z2 = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1DFB c1dfb = C0PEM.LIZJ;
            C455770Hu3 c455770Hu3 = new C455770Hu3(this.LLILZ, this.LLILZIL, this.LLILLJJLI, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c455770Hu3);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ProfileBgVideoListViewModel@a3c4.loadVideos$1");
                return objLJFF;
            }
        }
        FeedItemList feedItemList = (FeedItemList) obj;
        if (feedItemList == null) {
            this.LLILLJJLI.LLILLL.setValue(EnumC455750Hu1.ERROR);
            ProfileBgVideoListViewModel profileBgVideoListViewModel = this.LLILLJJLI;
            profileBgVideoListViewModel.LLJ = false;
            if (((ArrayList) profileBgVideoListViewModel.LLJI).isEmpty()) {
                this.LLILLJJLI.LLILZIL.setValue(true);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ProfileBgVideoListViewModel@a3c4.loadVideos$1");
            return unit;
        }
        List<Aweme> awemeList = feedItemList.getAwemeList();
        if (awemeList == null && (awemeList = feedItemList.getItems()) == null) {
            awemeList = C13BV.INSTANCE;
        }
        ProfileBgVideoListViewModel profileBgVideoListViewModel2 = this.LLILLJJLI;
        profileBgVideoListViewModel2.LLIZ = feedItemList.maxCursor;
        if (feedItemList.hasMore == 1) {
            z = true;
        } else {
            z = false;
        }
        profileBgVideoListViewModel2.LLIZLLLIL = z;
        ((ArrayList) profileBgVideoListViewModel2.LLJI).addAll(awemeList);
        this.LLILLJJLI.LL.setValue(new ArrayList(this.LLILLJJLI.LLJI));
        ProfileBgVideoListViewModel profileBgVideoListViewModel3 = this.LLILLJJLI;
        MutableLiveData<Boolean> mutableLiveData = profileBgVideoListViewModel3.LLILZIL;
        if (!((ArrayList) profileBgVideoListViewModel3.LLJI).isEmpty() || this.LLILLJJLI.LLIZLLLIL) {
            z2 = false;
        }
        mutableLiveData.setValue(Boolean.valueOf(z2));
        MutableLiveData<EnumC455750Hu1> mutableLiveData2 = this.LLILLJJLI.LLILLL;
        if (this.LLILLL) {
            enumC455750Hu1 = EnumC455750Hu1.REFRESH_SUCCESS;
        } else {
            enumC455750Hu1 = EnumC455750Hu1.LOAD_MORE_SUCCESS;
        }
        mutableLiveData2.setValue(enumC455750Hu1);
        this.LLILLJJLI.LLJ = false;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadVideos: count=");
        sbLIZ.append(awemeList.size());
        sbLIZ.append(", total=");
        sbLIZ.append(((ArrayList) this.LLILLJJLI.LLJI).size());
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LLILLJJLI.LLIZLLLIL);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.LLILLJJLI.LLIZ);
        C1720106oR.LJI("ProfileBackground", C2188811AlT.LIZIZ(sbLIZ));
        ProfileBgVideoListViewModel profileBgVideoListViewModel4 = this.LLILLJJLI;
        if (profileBgVideoListViewModel4.LLIZLLLIL && ((ArrayList) profileBgVideoListViewModel4.LLJI).size() < 15) {
            this.LLILLJJLI.vQ2(this.LLILZ, this.LLILZIL, false);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ProfileBgVideoListViewModel@a3c4.loadVideos$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
