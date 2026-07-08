package X;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mUi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1398420mUi extends AbstractC636100OxE {
    public static final C1398430mUj Companion = new Object() { // from class: X.0mUj
    };
    public String LL;
    public WeakReference<C19EG> LLILLJJLI;
    public transient Function0<Pair<Long, String>> LLILLL;
    public Aweme LLILZ;

    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public /* bridge */ /* synthetic */ C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme, int i) {
        return C635990Ox3.LIZ(this, c1398410mUh, aweme, i);
    }

    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public /* bridge */ /* synthetic */ C1255920ims getPresenter(int i, C19EG c19eg, InterfaceC214902198i interfaceC214902198i) {
        return C635990Ox3.LIZJ(this, i, c19eg, interfaceC214902198i);
    }

    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public /* bridge */ /* synthetic */ void interceptSmartRoute(View view, int i, SmartRoute smartRoute, Aweme aweme, C1398410mUh c1398410mUh) {
        C635990Ox3.LIZLLL(this, view, i, smartRoute, aweme, c1398410mUh);
    }

    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public /* bridge */ /* synthetic */ boolean needCallHolderAttached(RecyclerView.ViewHolder viewHolder) {
        return C635990Ox3.LJ(this, viewHolder);
    }

    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public boolean sendCustomRequest(C1255920ims<? extends AbstractC1255880imo<?, ?>> c1255920ims, int i) {
        return false;
    }

    public C1398420mUi() {
        this("");
    }

    public final WeakReference<C19EG> getActivity() {
        return this.LLILLJJLI;
    }

    public final Function0<Pair<Long, String>> getPreloadInfoInvoke() {
        return this.LLILLL;
    }

    public final String getSource() {
        return this.LL;
    }

    public final Aweme getToJumpAweme() {
        return this.LLILZ;
    }

    public C1398420mUi(String str) {
        this.LL = str;
    }

    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public void onJumpToDetail(String str) {
        super.onJumpToDetail(str);
    }

    public final void setActivity(WeakReference<C19EG> weakReference) {
        this.LLILLJJLI = weakReference;
    }

    public final void setPreloadInfoInvoke(Function0<Pair<Long, String>> function0) {
        this.LLILLL = function0;
    }

    public final void setSource(String str) {
        this.LL = str;
    }

    public final void setToJumpAweme(Aweme aweme) {
        this.LLILZ = aweme;
    }

    @Override // X.AbstractC636100OxE
    public int getDetailAwemeViewType(int i, Aweme aweme) {
        if (aweme != null && AwemeExtKt.getNewLiveRoomDataExt(aweme) != null) {
            return 1;
        }
        return 0;
    }

    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "challenge");
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        c2344009Gk.LJIIIIZZ("tag_id", c1398410mUh.LIZLLL);
        c2344009Gk.LJIIIIZZ("search_id", C194457115z.LLIZ.get(aweme.getAid()));
        c2344009Gk.LJIIIIZZ("rank_index", String.valueOf(c1398410mUh.LJFF));
        c2344009Gk.LJIIIIZZ("process_id", c1398410mUh.LJ);
        C20684815ws.LJIILLIIL("feed_enter", c2344009Gk.LIZ);
        this.LLILZ = aweme;
        c1398410mUh.LIZ = "from_challenge";
        c1398410mUh.LIZIZ = "challenge_id";
        return c1398410mUh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, X.115z, java.lang.Object] */
    @Override // X.AbstractC636100OxE, X.InterfaceC1400710mYP
    public C1255920ims<? extends AbstractC1255880imo<?, ?>> getPresenter(int i, C19EG c19eg) {
        final C259800zU c259800zU = new C259800zU();
        ?? c194457115z = new C194457115z();
        if (c19eg != null) {
            ((ChallengeDetailViewModel) ViewModelProviders.of(c19eg).get(ChallengeDetailViewModel.class)).LLILLJJLI.setValue(new Pair<>(Integer.valueOf(i), c194457115z));
        }
        c259800zU.element = c194457115z;
        String str = this.LL;
        if (!TextUtils.isEmpty(str)) {
            c194457115z.LLILLL = str;
        }
        C1255920ims<C194457115z> c1255920ims = new C1255920ims<C194457115z>() { // from class: X.116Z
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
            public final void onSuccess() {
                K k;
                Pair<Long, String> pair;
                T t = this.LL;
                if (t == 0 || (k = this.LLILLJJLI) == 0) {
                    return;
                }
                AbstractC1255880imo abstractC1255880imo = (AbstractC1255880imo) t;
                int i2 = abstractC1255880imo.mListQueryType;
                if (i2 != 1) {
                    if (i2 == 2) {
                        InterfaceC1212360hec interfaceC1212360hec = (InterfaceC1212360hec) k;
                        T t2 = abstractC1255880imo.mData;
                        interfaceC1212360hec.mE(t2 != 0 ? ((ChallengeAwemeList) t2).items : null, !((AbstractC1255880imo) t).isNewDataEmpty());
                        return;
                    } else {
                        if (i2 == 4) {
                            InterfaceC1212360hec interfaceC1212360hec2 = (InterfaceC1212360hec) k;
                            T t3 = abstractC1255880imo.mData;
                            interfaceC1212360hec2.Pj(t3 != 0 ? ((ChallengeAwemeList) t3).items : null, ((AbstractC1255880imo) t).isHasMore() && !((AbstractC1255880imo) this.LL).isNewDataEmpty());
                            return;
                        }
                        return;
                    }
                }
                if (abstractC1255880imo.isDataEmpty()) {
                    ((InterfaceC1212360hec) this.LLILLJJLI).Ng1();
                    return;
                }
                InterfaceC1212360hec interfaceC1212360hec3 = (InterfaceC1212360hec) this.LLILLJJLI;
                T t4 = this.LL;
                T t6 = t4.mData;
                interfaceC1212360hec3.LLJJJIL(t6 != 0 ? ((ChallengeAwemeList) t6).items : null, ((AbstractC1255880imo) t4).isHasMore());
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Function0<Pair<Long, String>> preloadInfoInvoke = this.LLILZIL.getPreloadInfoInvoke();
                if (preloadInfoInvoke == null || (pair = preloadInfoInvoke.invoke()) == null) {
                    pair = new Pair<>(0L, "");
                }
                C1202980hPU.LIZ(pair.getSecond(), "Challenge Detail Aweme", pair.getFirst().longValue(), c259800zU.element.LLILZLL, jElapsedRealtime, C297190Bkr.LIZ(), new InterfaceC1164020gOe() { // from class: X.116a
                    @Override // X.InterfaceC1164020gOe
                    public final void onEvent(Map map) {
                        C20684815ws.LJIILLIIL("power_preload_duration_key", map);
                    }
                });
            }
        };
        c1255920ims.LJIIJ((AbstractC666100QAu) c259800zU.element);
        return c1255920ims;
    }

    @Override // X.AbstractC636100OxE
    public AbstractC1261240ivS onCreateDetailAwemeViewHolder(ViewGroup viewGroup, int i, String str, InterfaceC1260110itd interfaceC1260110itd) {
        return new C1398630mV3(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bk3, viewGroup, false), str, interfaceC1260110itd) { // from class: X.0mUz
            {
                h6();
            }

            @Override // X.C1398630mV3
            public final void b6(Aweme aweme, int i2, boolean z, Bundle bundle) {
                super.b6(aweme, i2, z, bundle);
                if (aweme.isPgcShow()) {
                    if (aweme.getTextTopLabels() != null && aweme.getTextTopLabels().size() > 0) {
                        C786410Ut5.LLIL(this.LLJIJIL, 0);
                        C786410Ut5.l(this.LLJI, 8);
                        C1398630mV3.r6(this.LLJIJIL, (AwemeTextLabelModel) ListProtector.get(aweme.getTextTopLabels(), 0));
                        return;
                    }
                    return;
                }
                if (aweme.getOriginAuthor() != null || aweme.getMusicStarter() != null || aweme.getOriginAuthor() != null || !TextUtils.equals(this.LLIZLLLIL, "challenge") || aweme.getIsTop() != 1) {
                    return;
                }
                if (aweme.getTextTopLabels() != null && aweme.getTextTopLabels().size() > 0) {
                    C786410Ut5.LLIL(this.LLJIJIL, 0);
                    C786410Ut5.l(this.LLJI, 8);
                    C1398630mV3.r6(this.LLJIJIL, (AwemeTextLabelModel) ListProtector.get(aweme.getTextTopLabels(), 0));
                } else {
                    C786410Ut5.LLIL(this.LLJIJIL, 8);
                    C786410Ut5.l(this.LLJI, 0);
                    C1324840ka2.LJI(this.LLJI, aweme.getLabelTop(), (int) C12ES.LIZJ(6.0f, this.LLIZ), (int) C12ES.LIZJ(6.0f, this.LLIZ), null);
                }
            }
        };
    }
}
