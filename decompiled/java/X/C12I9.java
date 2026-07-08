package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfo;
import com.ss.android.ugc.aweme.dependence.beauty.data.MBeautyStateInfo;
import com.ss.android.ugc.aweme.dependence.beauty.utils.SafeMutableLiveData;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautifyUsedInfo;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.12I9, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public interface C12I9 {
    String Ae();

    void Be();

    void Ce();

    void De(boolean z, EnumC19731112Ht enumC19731112Ht);

    SafeMutableLiveData<List<ComposerBeauty>> Ee();

    BeautifyUsedInfo Fe(boolean z, boolean z2, Function1 function1);

    void Ge(BeautyCategory beautyCategory);

    SafeMutableLiveData<Map<String, Integer>> He();

    void Ie();

    boolean Je(ComposerBeauty composerBeauty);

    @InterfaceC1294060jmO
    MBeautyStateInfo Ke();

    List<BeautyCategory> LIZ();

    boolean LIZIZ();

    BeautyCategory LIZJ();

    void LIZLLL(boolean z);

    SafeMutableLiveData<List<BeautyComposerInfo>> LJ();

    boolean Le();

    Map<String, C12HU<BeautyComposerInfo>> Me();

    @InterfaceC1294060jmO
    ComposerBeautyBuriedInfo Ne();

    void Oe();

    C12HU Pe();

    ComposerBeauty Qe();

    void Re();

    EnumC19731112Ht Se();

    SafeMutableLiveData<C1499920p8Q<ComposerBeauty>> Te();

    void Ue();

    C560530Lyd<ArrayList<BeautyComposerInfo>> Ve();

    List<ComposerBeauty> We();

    List<BeautyComposerInfo> Xe(ComposerBeauty composerBeauty, boolean z, boolean z2, boolean z3);

    C19570611hY Ye();

    void Ze(boolean z);

    void af(boolean z, boolean z2);

    void bf(AwS573S0100000_29 awS573S0100000_29, C12IE c12ie);

    void cf(ComposerBeauty composerBeauty);

    BeautyFilterConfig df();

    boolean ef();

    void ff(C787110UuD c787110UuD);

    float gf(ComposerBeauty composerBeauty, String str, float f);

    void hf(ComposerBeauty composerBeauty);

    /* JADX INFO: renamed from: if */
    SafeMutableLiveData<List<BeautyComposerInfo>> mo73if();

    void jf(ComposerBeauty composerBeauty);

    void kf();

    BeautyMetadata le();

    String lf(ComposerBeauty composerBeauty);

    void me(String str, boolean z);

    SafeMutableLiveData<Integer> mf();

    List<BeautyCategory> ne();

    boolean nf(ComposerBeauty composerBeauty);

    boolean oe(String str, boolean z);

    void pe();

    void qe();

    void re(C19729512Hd c19729512Hd, C12IG c12ig);

    void release();

    void se(ComposerBeauty composerBeauty, String str, float f);

    void te(ComposerBeauty composerBeauty);

    C12HU<BeautyComposerInfo> ue();

    void ve(ComposerBeauty composerBeauty, InterfaceC19729612He interfaceC19729612He);

    SafeMutableLiveData<Boolean> we();

    void xe();

    void ye(C787110UuD c787110UuD);

    void ze();
}
