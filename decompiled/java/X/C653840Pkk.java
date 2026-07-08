package X;

import Y.ACListenerS114S0200000_10;
import Y.ACListenerS145S0100000_10;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.discover.model.UserEntityInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchMixUserCell;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchRefreshPredictMobCanShowVM;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0Pkk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C653840Pkk extends AbstractViewOnAttachStateChangeListenerC654600Ply implements C0PUC, InterfaceC648130PbX, InterfaceC648310Pbp {
    public static final /* synthetic */ int LLJJI = 0;
    public final C652630Pin LLIZ;
    public boolean LLIZLLLIL;
    public SearchResultParam LLJ;
    public final SearchMixUserCell LLJI;
    public C645320PSw LLJIJIL;
    public SearchRefreshPredictMobCanShowVM LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public final C653890Pkp LLJJ;

    @Override // X.InterfaceC648310Pbp
    public final boolean K4() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean L0() {
        return true;
    }

    @Override // X.C0PUC
    public final Aweme LJIIIIZZ() {
        return null;
    }

    @Override // X.InterfaceC648270Pbl
    public final void LJJJJ() {
    }

    @Override // X.InterfaceC648130PbX
    public final C0PUC LJJZZI() {
        return this;
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLJJJ() {
    }

    @Override // X.C0PUC
    public final void LLLILZLLLI(int i) {
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean LLLLIIIILLL() {
        return true;
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLLLLIL() {
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLLLLILLIL() {
    }

    @Override // X.InterfaceC648130PbX
    public final InterfaceC648270Pbl LLLLLLLZIL() {
        return null;
    }

    @Override // X.C0PUC
    public final void LLLLLZ() {
    }

    @Override // X.C0PUC
    public final void LLZZ() {
    }

    @Override // X.InterfaceC648350Pbt
    public final void LLZZZIL(C587060N0u c587060N0u) {
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean N1() {
        SearchMixUserCell searchMixUserCell;
        return C0PNW.LIZ() && (searchMixUserCell = this.LLJI) != null && searchMixUserCell.LIZIZ();
    }

    @Override // X.InterfaceC648270Pbl
    public final void O4() {
    }

    @Override // X.InterfaceC648350Pbt
    public final InterfaceC584630MwP getPreload() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final C0PCQ getPriority() {
        return null;
    }

    @Override // X.C0PUC
    public final int getViewType() {
        return 2;
    }

    @Override // X.C0PUC
    public final int k2() {
        return -1;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean l2() {
        return true;
    }

    @Override // X.C0PUC
    public final void n4(MotionEvent motionEvent) {
    }

    @C14EU
    public final void onEvent(C737030Svd c737030Svd) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void release() {
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayableLifecycleListener(InterfaceC659190PtN interfaceC659190PtN) {
    }

    @Override // X.InterfaceC648350Pbt
    public final Boolean z3() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJJLIIL() {
        InterfaceC648720PcU interfaceC648720PcU = this.LLIZ.LL;
        if (interfaceC648720PcU != null) {
            interfaceC648720PcU.LJFF();
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJLIIIJLLLLLLLZ() {
        InterfaceC648720PcU interfaceC648720PcU = this.LLIZ.LL;
        if (interfaceC648720PcU != null) {
            interfaceC648720PcU.LJJLIIIJLLLLLLLZ();
        }
    }

    @Override // X.InterfaceC648310Pbp
    public final InterfaceC648720PcU LLL() {
        return new C648730PcV(new AwS554S0100000_10(this, 1161));
    }

    @Override // X.AbstractViewOnAttachStateChangeListenerC654600Ply
    public final View getView() {
        View view;
        SearchMixUserCell searchMixUserCell = this.LLJI;
        return (searchMixUserCell == null || (view = searchMixUserCell.LLILLJJLI) == null) ? this.itemView : view;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean isPlaying() {
        C013C c013c = new C013C();
        InterfaceC641090PCp interfaceC641090PCpLIZ = C642600PIk.LIZ(this.itemView);
        C1440005kM.LIZ(new C653360Pjy(interfaceC641090PCpLIZ != null ? Integer.valueOf(interfaceC641090PCpLIZ.hashCode()) : null, new AwS589S0100000_10(c013c, 552)));
        return c013c.element;
    }

    @Override // X.InterfaceC648310Pbp
    public final InterfaceC648720PcU n5() {
        return new C648730PcV(new AwS554S0100000_10(this, 1162));
    }

    @Override // X.InterfaceC648350Pbt
    public final String getDebugId() {
        return C655580PnY.LIZ(this);
    }

    @Override // X.InterfaceC648350Pbt
    public final View getDetectView() {
        return C659230PtR.LIZIZ(this);
    }

    @Override // X.InterfaceC648350Pbt
    @InterfaceC1294060jmO
    public final View p0() {
        return C655580PnY.LIZIZ(this);
    }

    @Override // X.InterfaceC648310Pbp
    public final int y1() {
        return hashCode();
    }

    @Override // X.C0PUC
    public final SearchResultParam I() {
        return this.LLJ;
    }

    @Override // X.C0PUC
    public final boolean LIZLLL() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC648270Pbl
    public final View LJJIIJ() {
        return this.itemView;
    }

    @Override // X.C0PUC
    public final boolean LLLZZIL() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC648310Pbp
    public final View d5() {
        return this.itemView;
    }

    @Override // X.C0PUC
    public final View getItemView() {
        return this.itemView;
    }

    @Override // X.InterfaceC648350Pbt
    public final void Mu(C650630PfZ c650630PfZ) {
        C659230PtR.LIZJ(this, c650630PfZ);
    }

    public final void R5(C653660PkS c653660PkS) {
        String docId;
        String alasrc;
        SearchCardInfo searchCardInfo;
        if (((Number) AnonymousClass0796.LIZ.getValue()).intValue() == 0) {
            return;
        }
        C645320PSw c645320PSw = this.LLJIJIL;
        if (c645320PSw == null || (searchCardInfo = c645320PSw.LLILZ) == null || (docId = searchCardInfo.getDocId()) == null) {
            C645320PSw c645320PSw2 = this.LLJIJIL;
            if (c645320PSw2 != null) {
                docId = c645320PSw2.LLILZIL;
            } else {
                docId = null;
            }
        }
        C645320PSw c645320PSw3 = this.LLJIJIL;
        if (c645320PSw3 != null) {
            C654760PmE c654760PmELIZIZ = C645940PVg.LIZIZ(c653660PkS);
            c654760PmELIZIZ.LJIJI("search_result_id", docId);
            c654760PmELIZIZ.LJJIIZ(Integer.valueOf(getAdapterPosition()));
            c654760PmELIZIZ.LJIIZILJ("is_aladdin", CardStruct.IStatusCode.DEFAULT);
            SearchCardInfo searchCardInfo2 = c645320PSw3.LLILZ;
            if (searchCardInfo2 == null || (alasrc = searchCardInfo2.getAlasrc()) == null) {
                alasrc = "person";
            }
            c654760PmELIZIZ.LJIIZILJ("token_type", alasrc);
            c654760PmELIZIZ.LJIIZILJ("search_type", c653660PkS.LIZLLL);
            c654760PmELIZIZ.LJIILJJIL();
        }
    }

    @Override // X.AbstractViewOnAttachStateChangeListenerC654600Ply, android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        super.onViewAttachedToWindow(view);
        EventBus.LIZLLL().LJIJJ(this);
        if (this.LLJILJIL == null) {
            this.LLJILJIL = C0P72.LIZ(C946803n0.LIZ(this.itemView));
        }
    }

    @Override // X.AbstractViewOnAttachStateChangeListenerC654600Ply, android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        super.onViewDetachedFromWindow(view);
        EventBus.LIZLLL().LJJI(this);
        this.LLIZLLLIL = false;
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayMetrics(C664400Q4g c664400Q4g) {
        InterfaceC648720PcU interfaceC648720PcU = this.LLIZ.LL;
        if (interfaceC648720PcU != null) {
            interfaceC648720PcU.setPlayMetrics(c664400Q4g);
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final void wp(C650630PfZ c650630PfZ) {
        C659230PtR.LIZ(this, c650630PfZ);
    }

    @Override // X.InterfaceC648310Pbp
    public final void LJJLL(Aweme aweme, C0PBW c0pbw) {
        C648300Pbo.LIZIZ(this, aweme, c0pbw);
    }

    @Override // X.InterfaceC648350Pbt
    public final void W0(long j, C587060N0u c587060N0u) {
        InterfaceC648720PcU interfaceC648720PcU = this.LLIZ.LL;
        if (interfaceC648720PcU != null) {
            interfaceC648720PcU.LJ();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0Pkp] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0Pkm] */
    public C653840Pkk(Fragment fragment, View view, Context context, Fragment fragment2) {
        super(view);
        C652630Pin c652630Pin = new C652630Pin(this, 1);
        C653830Pkj.LIZ(this.itemView, c652630Pin);
        this.LLIZ = c652630Pin;
        this.LLJJ = new InterfaceC662610Pyt() { // from class: X.0Pkp
            @Override // X.InterfaceC662610Pyt
            public final void LIZ() {
            }

            @Override // X.InterfaceC662610Pyt
            public final void LIZIZ() {
            }
        };
        this.LLJI = new SearchMixUserCell(fragment, view, context, new InterfaceC653880Pko() { // from class: X.0Pkm
            @Override // X.InterfaceC653880Pko
            public final void LIZ() {
                String docId;
                String alasrc;
                SearchCardInfo searchCardInfo;
                MobClick mobClickObtain = MobClick.obtain();
                mobClickObtain.setEventName("check_more_result");
                mobClickObtain.setLabelName("general_search");
                C2241008qG c2241008qG = new C2241008qG();
                c2241008qG.LIZ.put("search_type", "user");
                mobClickObtain.setJsonObject(c2241008qG.LJ());
                C20684815ws.onEvent(mobClickObtain);
                C653840Pkk c653840Pkk = this.LIZ;
                C653660PkS c653660PkSL3 = c653840Pkk.l3();
                C645320PSw c645320PSw = c653840Pkk.LLJIJIL;
                if (c645320PSw == null || (searchCardInfo = c645320PSw.LLILZ) == null || (docId = searchCardInfo.getDocId()) == null) {
                    C645320PSw c645320PSw2 = c653840Pkk.LLJIJIL;
                    docId = c645320PSw2 != null ? c645320PSw2.LLILZIL : null;
                }
                C645320PSw c645320PSw3 = c653840Pkk.LLJIJIL;
                if (c645320PSw3 != null) {
                    C654740PmC c654740PmCLIZ = C645940PVg.LIZ(c653660PkSL3);
                    c654740PmCLIZ.LJIJI("search_result_id", docId);
                    c654740PmCLIZ.LJJIIZ(Integer.valueOf(c653840Pkk.getAdapterPosition()));
                    c654740PmCLIZ.LJIIZILJ("is_aladdin", CardStruct.IStatusCode.DEFAULT);
                    SearchCardInfo searchCardInfo2 = c645320PSw3.LLILZ;
                    if (searchCardInfo2 == null || (alasrc = searchCardInfo2.getAlasrc()) == null) {
                        alasrc = "person";
                    }
                    c654740PmCLIZ.LJIIZILJ("token_type", alasrc);
                    c654740PmCLIZ.LJIIZILJ("aladdin_button_type", "click_more_button");
                    c654740PmCLIZ.LJIILJJIL();
                }
                C644560PPy.LIZ.getClass();
                C1440005kM.LIZ(new C649960PeU(C644560PPy.LJIL()));
            }
        }, fragment2);
    }

    public final void P5(C645320PSw c645320PSw, SearchResultParam searchResultParam, boolean z, boolean z2) {
        int i;
        String uid;
        String uid2;
        User user;
        int iIntValue;
        boolean z3;
        this.LLJ = searchResultParam;
        this.LLJIJIL = c645320PSw;
        C653660PkS c653660PkSL3 = l3();
        final SearchMixUserCell searchMixUserCell = this.LLJI;
        if (searchMixUserCell != null) {
            searchMixUserCell.LLJJJJ = this.LLILZ;
            searchMixUserCell.LLJILJIL = c653660PkSL3;
            searchMixUserCell.LLJJJIL = getAdapterPosition();
            searchMixUserCell.LLJJJ = this.LLJJ;
            searchMixUserCell.LLJJIJIL = c645320PSw;
            if (!C086I.LIZIZ(c645320PSw.LLILLJJLI)) {
                searchMixUserCell.LLJJIII = searchResultParam;
                C662380PyW c662380PyW = searchMixUserCell.LLJJI;
                c662380PyW.LLJIJIL = searchMixUserCell.LLJJJJ;
                c662380PyW.LLILLL = searchResultParam;
                c662380PyW.LLJ = searchMixUserCell.LLJILJIL;
                c662380PyW.LLJILJIL = searchMixUserCell.LLJJJ;
                c662380PyW.setShowFooter(false);
                searchMixUserCell.LLJJI.LLJILLL = c645320PSw.LLILZLL;
                View view = searchMixUserCell.LLJILLL;
                if (searchMixUserCell.LLJJJIL == 0) {
                    i = 8;
                } else {
                    i = 0;
                }
                C786410Ut5.LJLLLLLL(i, view);
                String strLIZ = null;
                if (!c645320PSw.LLILLJJLI.isEmpty() && ((SearchUser) ListProtector.get(c645320PSw.LLILLJJLI, 0)).userEntityInfo != null) {
                    searchMixUserCell.LLJILJIL.LJJJJLL = "hot_user_with_wiki";
                    C786410Ut5.LJLLLLLL(0, searchMixUserCell.LLILZIL);
                    UserEntityInfo userEntityInfo = ((SearchUser) ListProtector.get(c645320PSw.LLILLJJLI, 0)).userEntityInfo;
                    searchMixUserCell.LLILZIL.setLongClickable(true);
                    C786410Ut5.I7(new ACListenerS114S0200000_10(userEntityInfo, searchMixUserCell, 24), searchMixUserCell.LLILZIL);
                    searchMixUserCell.LLILZIL.setLayoutDirection(userEntityInfo.isRtl ? 1 : 0);
                    if (C2093608Ic.LJ(userEntityInfo.image)) {
                        C786410Ut5.LLZZ(searchMixUserCell.LLIZ, 8);
                        SearchMixUserCell.LIZJ(0, searchMixUserCell.LLJ);
                        SearchMixUserCell.LIZJ(0, searchMixUserCell.LLJI);
                    } else {
                        C786410Ut5.LLZZ(searchMixUserCell.LLIZ, 0);
                        C1331660kl2.LJIIIZ(userEntityInfo.image).LJJIIJ(new AbstractC468201s0() { // from class: X.0Pku
                            @Override // X.InterfaceC1331910klR
                            public final void LIZ(Bitmap bitmap) {
                                if (bitmap != null && bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
                                    if (bitmap.getWidth() > bitmap.getHeight()) {
                                        searchMixUserCell.LLIZLLLIL.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                    } else {
                                        searchMixUserCell.LLIZLLLIL.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    }
                                    searchMixUserCell.LLIZLLLIL.setImageBitmap(bitmap);
                                }
                            }

                            @Override // X.InterfaceC1331910klR
                            public final void onFailed(Throwable th) {
                                searchMixUserCell.LLIZLLLIL.setImageBitmap(null);
                            }
                        });
                        TuxTextView tuxTextView = searchMixUserCell.LLJ;
                        int i2 = SearchMixUserCell.LLJJJJLIIL;
                        SearchMixUserCell.LIZJ(i2, tuxTextView);
                        SearchMixUserCell.LIZJ(i2, searchMixUserCell.LLJI);
                    }
                    if (TextUtils.isEmpty(userEntityInfo.title)) {
                        C786410Ut5.LLLLZLL(searchMixUserCell.LLILZLL, 8);
                    } else {
                        C786410Ut5.LLLLZLL(searchMixUserCell.LLILZLL, 0);
                        searchMixUserCell.LLILZLL.setText(userEntityInfo.title);
                    }
                    if (TextUtils.isEmpty(userEntityInfo.subTitle)) {
                        C786410Ut5.LLLLZLL(searchMixUserCell.LLJ, 8);
                        searchMixUserCell.LLJI.setFoldShowMaxLines(3);
                        searchMixUserCell.LLJI.setExpandShowMaxLine(3);
                    } else {
                        C786410Ut5.LLLLZLL(searchMixUserCell.LLJ, 0);
                        searchMixUserCell.LLJI.setFoldShowMaxLines(2);
                        searchMixUserCell.LLJI.setExpandShowMaxLine(2);
                        searchMixUserCell.LLJ.setText(userEntityInfo.subTitle);
                    }
                    if (TextUtils.isEmpty(userEntityInfo.f54abstract)) {
                        C430890Gv1 c430890Gv1 = searchMixUserCell.LLJI;
                        int visibility = c430890Gv1.getVisibility();
                        c430890Gv1.setVisibility(8);
                        C1602160rnK.LIZIZ(visibility, 8, c430890Gv1);
                    } else {
                        C430890Gv1 c430890Gv12 = searchMixUserCell.LLJI;
                        int visibility2 = c430890Gv12.getVisibility();
                        c430890Gv12.setVisibility(0);
                        C1602160rnK.LIZIZ(visibility2, 0, c430890Gv12);
                        searchMixUserCell.LLJI.LJJJJLI();
                        searchMixUserCell.LLJI.setEndAppendText(userEntityInfo.linkStr);
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = R.raw.icon_chevron_right_fill_ltr;
                        c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
                        int i3 = SearchMixUserCell.LLJJL;
                        c419910GdJ.LIZIZ = i3;
                        c419910GdJ.LIZJ = i3;
                        C430890Gv1 c430890Gv13 = searchMixUserCell.LLJI;
                        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(c430890Gv13.getContext());
                        int i4 = SearchMixUserCell.LLJJLIIIJLLLLLLLZ;
                        int i5 = SearchMixUserCell.LLJL;
                        if (searchMixUserCell.LLILZIL.getLayoutDirection() == 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c430890Gv13.LJJJJLL(tuxIconDrawableLIZ, i4, i5, Boolean.valueOf(z3));
                        searchMixUserCell.LLJI.setText(userEntityInfo.f54abstract);
                    }
                } else {
                    C786410Ut5.LJLLLLLL(8, searchMixUserCell.LLILZIL);
                    searchMixUserCell.LLJJI.LLIZ = null;
                    searchMixUserCell.LLJILJIL.LJJJJLL = "";
                }
                ISearchContextAbility iSearchContextAbilityLIZ = C0Q3E.LIZ(searchMixUserCell.LLILLJJLI);
                if (iSearchContextAbilityLIZ != null) {
                    if (C07DY.LIZ()) {
                        Fragment fragment = searchMixUserCell.LLJJIJIIJIL;
                        if (fragment instanceof SearchFragment) {
                            iIntValue = ((SearchFragment) fragment).yS();
                            if (iIntValue > 0 && searchMixUserCell.LLJJJIL == iIntValue) {
                                C786410Ut5.LJLLLLLL(8, searchMixUserCell.LLJILLL);
                            }
                        }
                    } else if (((C0PRC) iSearchContextAbilityLIZ.Ph1().LIZJ()).LLJJIII != null) {
                        iIntValue = ((C0PRC) iSearchContextAbilityLIZ.Ph1().LIZJ()).LLJJIII.invoke().intValue();
                        if (iIntValue > 0) {
                            C786410Ut5.LJLLLLLL(8, searchMixUserCell.LLJILLL);
                        }
                    }
                }
                if (!TextUtils.isEmpty(c645320PSw.LLILLL)) {
                    searchMixUserCell.LLILLL.setText(c645320PSw.LLILLL);
                }
                SearchCardInfo searchCardInfo = c645320PSw.LLILZ;
                if (searchCardInfo != null && TextUtils.equals(searchCardInfo.getAlasrc(), "tt_user")) {
                    searchMixUserCell.LLJJIJI.setPadding(0, C418440Gaw.LIZ(8), 0, 0);
                } else {
                    searchMixUserCell.LLJJIJI.setPadding(0, C418440Gaw.LIZ(8), 0, C418440Gaw.LIZ(8));
                }
                if (!z2) {
                    C662390PyX c662390PyX = C662390PyX.LIZ;
                    List<SearchUser> list = c645320PSw.LLILLJJLI;
                    c662390PyX.getClass();
                    if (C662390PyX.LIZ(list) && c645320PSw.LLILLJJLI.size() == 1) {
                        C786410Ut5.LLIL(searchMixUserCell.LLILLL, 8);
                    } else {
                        C786410Ut5.LLIL(searchMixUserCell.LLILLL, 0);
                    }
                }
                if (c645320PSw.LL) {
                    SearchUser searchUser = (SearchUser) ListProtector.get(c645320PSw.LLILLJJLI, 0);
                    if (searchUser != null && (user = searchUser.user) != null) {
                        searchMixUserCell.LLJILJIL.LJIL = user.getUid();
                        C653660PkS c653660PkS = searchMixUserCell.LLJILJIL;
                        User user2 = searchUser.user;
                        if (user2 != null) {
                            strLIZ = C662620Pyu.LIZ(user2);
                        }
                        c653660PkS.LJJ = strLIZ;
                    }
                    searchMixUserCell.LLJJI.setData(Collections.singletonList(searchUser));
                    C786410Ut5.LJLZ(8, searchMixUserCell.LLILZ);
                } else {
                    C653660PkS c653660PkS2 = searchMixUserCell.LLJILJIL;
                    List<SearchUser> list2 = c645320PSw.LLILLJJLI;
                    c653660PkS2.getClass();
                    StringBuilder sb = new StringBuilder();
                    if (list2 != null) {
                        int i6 = 0;
                        for (SearchUser searchUser2 : list2) {
                            int i7 = i6 + 1;
                            if (i6 >= 0) {
                                SearchUser searchUser3 = searchUser2;
                                if (i6 != list2.size() - 1) {
                                    User user3 = searchUser3.user;
                                    if (user3 != null) {
                                        uid2 = user3.getUid();
                                    } else {
                                        uid2 = null;
                                    }
                                    sb.append(uid2);
                                    sb.append(",");
                                } else {
                                    User user4 = searchUser3.user;
                                    if (user4 != null) {
                                        uid = user4.getUid();
                                    } else {
                                        uid = null;
                                    }
                                    sb.append(uid);
                                }
                                i6 = i7;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }
                    c653660PkS2.LJIL = sb.toString();
                    searchMixUserCell.LLJJI.setData(c645320PSw.LLILLJJLI);
                    C662390PyX c662390PyX2 = C662390PyX.LIZ;
                    List<SearchUser> list3 = c645320PSw.LLILLJJLI;
                    c662390PyX2.getClass();
                    if (C662390PyX.LIZ(list3) && c645320PSw.LLILLJJLI.size() <= 1) {
                        searchMixUserCell.LIZ(false);
                        View view2 = searchMixUserCell.LLJILJILJ;
                        if (view2 != null) {
                            C786410Ut5.I7(new ACListenerS145S0100000_10((Object) searchMixUserCell, 72), view2);
                        }
                    } else {
                        searchMixUserCell.LIZ(z);
                    }
                }
            }
        }
        if (!this.LLJILLL) {
            this.LLJILLL = true;
            C1524805y2.LIZIZ(0L, new AwS554S0100000_10(this, 1160));
        }
        if (!C0PPZ.LIZ()) {
            R5(c653660PkSL3);
        }
        C648300Pbo.LIZJ(this, this.itemView);
        this.LLIZLLLIL = true;
        this.LLJILJILJ = true;
    }
}
