package X;

import Y.ACListenerS145S0100000_10;
import Y.ACListenerS77S0300000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.UserVideoHolderAssemSupport;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.photo.UserPhotoHolder;
import com.ss.android.ugc.aweme.search.performance.core.config.UserHorizontalVideoPreloadConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS659S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C658220Pro extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public static String LLJIJIL;
    public final InterfaceC656470Poz LL;
    public C653660PkS LLILLJJLI;
    public final RecyclerView LLILLL;
    public final LifecycleOwner LLILZ;
    public final Function0<InterfaceC665370Q7z> LLILZIL;
    public C658370Ps3 LLIZ;
    public InterfaceC641090PCp LLJ;
    public List<? extends Aweme> LLILZLL = new ArrayList();
    public final C653450Pk7<Aweme> LLIZLLLIL = new C653450Pk7<>(this);
    public final C0SZT<C0SMO<?, ?>, InterfaceC1587906Jp> LLJI = new C0SZT<>(this);

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZLL.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        Object obj;
        Aweme aweme = (Aweme) ListProtector.get(this.LLILZLL, i);
        if (AwemeSaaSExtKt.isLive(aweme)) {
            return 3;
        }
        if (AwemeExtKt.isPhotoMode(aweme)) {
            return 4;
        }
        C658370Ps3 c658370Ps3 = this.LLIZ;
        if (c658370Ps3 == null || (obj = c658370Ps3.LIZ) == null) {
            obj = C653580PkK.LIZJ;
        }
        if (Intrinsics.LJFF(obj, C653580PkK.LIZJ)) {
            return 1;
        }
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (viewHolder instanceof InterfaceC658400Ps6) {
            InterfaceC641090PCp interfaceC641090PCpLIZ = this.LLJ;
            if (interfaceC641090PCpLIZ == null) {
                interfaceC641090PCpLIZ = C642600PIk.LIZ(viewHolder.itemView);
                this.LLJ = interfaceC641090PCpLIZ;
                if (interfaceC641090PCpLIZ == null) {
                    throw new NullPointerException("Cannot find ContainerStatusProvider");
                }
            }
            ((InterfaceC658400Ps6) viewHolder).A5(interfaceC641090PCpLIZ);
        }
        if (bindingAdapterPosition != -1 && !C0PPZ.LIZ()) {
            this.LL.LIZ(bindingAdapterPosition, (Aweme) ListProtector.get(this.LLILZLL, bindingAdapterPosition));
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        if (viewHolder instanceof UserPhotoHolder) {
            ((UserPhotoHolder) viewHolder).wY0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02c2  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 1318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C658220Pro.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c658230Prp;
        C658280Pru c658280Pru;
        C658280Pru c658280Pru2;
        int iIntValue;
        C644160POk.LIZ.getClass();
        C645280PSs c645280PSs = C644160POk.LIZIZ;
        if (c645280PSs != null) {
            c645280PSs.LJ = i;
        }
        if (i != 1) {
            int iIntValue2 = 2;
            C585710My9 c585710My9 = null;
            C658370Ps3 c658370Ps3 = null;
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        Fragment fragmentLIZ = C946803n0.LIZ(viewGroup);
                        C658370Ps3 c658370Ps32 = UserPhotoHolder.LLJJJJ;
                        C658370Ps3 c658370Ps33 = this.LLIZ;
                        C0SZT<C0SMO<?, ?>, InterfaceC1587906Jp> c0szt = this.LLJI;
                        InterfaceC656470Poz interfaceC656470Poz = this.LL;
                        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(fragmentLIZ, 545);
                        AwS659S0100000_10 awS659S0100000_10 = new AwS659S0100000_10(this, 6);
                        C650520PfO.LIZ.getClass();
                        View viewLIZ = C650520PfO.LIZ(R.layout.f3p, viewGroup);
                        UserPhotoHolder userPhotoHolder = new UserPhotoHolder(viewLIZ, c0szt, fragmentLIZ, interfaceC656470Poz, awS554S0100000_10);
                        if (c658370Ps33 == null) {
                            c658370Ps33 = UserPhotoHolder.LLJJJJ;
                        }
                        userPhotoHolder.LLJ = c658370Ps33;
                        userPhotoHolder.LLJILJILJ = awS659S0100000_10;
                        userPhotoHolder.LLJI = (C661460Px2) viewLIZ.findViewById(R.id.user_photo_view);
                        userPhotoHolder.LLJIJIL = (ConstraintLayout) viewLIZ.findViewById(R.id.user_photo_container_layout);
                        Integer numValueOf = Integer.valueOf(C1913107eT.LJ());
                        if (numValueOf.intValue() > 0) {
                            int iIntValue3 = numValueOf.intValue();
                            ConstraintLayout constraintLayout = userPhotoHolder.LLJIJIL;
                            if (constraintLayout != null) {
                                C0HXV.LIZIZ((int) C418040GaI.LIZ(iIntValue3), constraintLayout);
                            }
                        }
                        C657990PrR.LIZJ(viewLIZ, new AwS589S0100000_10(userPhotoHolder, 579));
                        Context context = viewLIZ.getContext();
                        Integer num = (Integer) userPhotoHolder.LLJJIII.getValue();
                        if (num != null) {
                            iIntValue2 = num.intValue();
                        }
                        viewLIZ.setOutlineProvider(new C663220Pzs((int) C661350Pwr.LIZ(iIntValue2, context)));
                        viewLIZ.setClipToOutline(true);
                        if (!C18127078b.LIZIZ()) {
                            if (C07P0.LIZIZ()) {
                                userPhotoHolder.LLJILLL = (C1012300cRw) viewLIZ.findViewById(R.id.vqk);
                            }
                            C1012300cRw c1012300cRw = userPhotoHolder.LLJILLL;
                            if (c1012300cRw != null) {
                                C786410Ut5.Ja(c1012300cRw, new ACListenerS145S0100000_10(userPhotoHolder, 84));
                            }
                            TuxIconView tuxIconView = (TuxIconView) viewLIZ.findViewById(R.id.ey7);
                            userPhotoHolder.LLJJ = tuxIconView;
                            if (tuxIconView != null) {
                                C786410Ut5.a9(tuxIconView, new ACListenerS145S0100000_10(userPhotoHolder, 85));
                            }
                        }
                        C661460Px2 c661460Px2 = userPhotoHolder.LLJI;
                        c658230Prp = userPhotoHolder;
                        if (c661460Px2 != null) {
                            C661350Pwr.LJIIL(c661460Px2);
                            c661460Px2.setEnableLifecycleObserver(true);
                            c661460Px2.setEnableHideCoverAnim(true);
                            c661460Px2.setMCoverView(null);
                            c661460Px2.setPhotoSoundIcon(userPhotoHolder.LLJILLL);
                            c661460Px2.setPhotoMuteNoteIcon(userPhotoHolder.LLJJ);
                            Integer num2 = (Integer) userPhotoHolder.LLJJIII.getValue();
                            if (num2 != null) {
                                iIntValue = num2.intValue();
                            } else {
                                iIntValue = 4;
                            }
                            c661460Px2.setOutlineProvider(new C663220Pzs((int) C418040GaI.LIZ(iIntValue)));
                            c661460Px2.setClipToOutline(true);
                            c661460Px2.setImportantForAccessibility(4);
                            AwS376S0200000_10 awS376S0200000_10 = new AwS376S0200000_10(c661460Px2, userPhotoHolder, 126);
                            C658630PsT c658630PsT = new C658630PsT();
                            awS376S0200000_10.invoke(c658630PsT);
                            c661460Px2.setMScrollStateObserver(c658630PsT);
                            C658370Ps3 c658370Ps34 = userPhotoHolder.LLJ;
                            if (c658370Ps34 != null) {
                                c658370Ps3 = c658370Ps34;
                            }
                            c661460Px2.setMScrollStateManager(c658370Ps3.LIZJ);
                            ConstraintLayout constraintLayout2 = userPhotoHolder.LLJIJIL;
                            if (constraintLayout2 != null) {
                                C786410Ut5.Y7(constraintLayout2, new ACListenerS77S0300000_10((Object) userPhotoHolder, (View) c661460Px2, (Map<String, String>) c661460Px2, (View) 13));
                            }
                            C661490Px5 dataProvider = c661460Px2.getDataProvider();
                            c658230Prp = userPhotoHolder;
                            if (dataProvider != null) {
                                dataProvider.LIZ = userPhotoHolder.itemView;
                                c658230Prp = userPhotoHolder;
                            }
                        }
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Unknown Aweme view type ");
                        sbLIZ.append(i);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else if (C301500Bro.LIZ()) {
                    C658370Ps3 c658370Ps35 = C658270Prt.LLJJJJ;
                    C658370Ps3 c658370Ps36 = this.LLIZ;
                    InterfaceC656470Poz interfaceC656470Poz2 = this.LL;
                    AwS659S0100000_10 awS659S0100000_102 = new AwS659S0100000_10(this, 4);
                    C650520PfO.LIZ.getClass();
                    View viewLIZ2 = C650520PfO.LIZ(R.layout.f3t, viewGroup);
                    if (c658370Ps36 == null) {
                        c658370Ps36 = C658270Prt.LLJJJJ;
                    }
                    c658230Prp = new C658270Prt(viewLIZ2, c658370Ps36, awS659S0100000_102, interfaceC656470Poz2);
                } else {
                    C650520PfO.LIZ.getClass();
                    c658230Prp = new C658240Prq(C650520PfO.LIZ(R.layout.eyg, viewGroup), this.LL, new AwS659S0100000_10(this, 5));
                }
            } else {
                C584670MwT.LIZ.getClass();
                if (((UserHorizontalVideoPreloadConfig) C584670MwT.LIZJ.getValue()).enableUserVideoOpt) {
                    c585710My9 = new C585710My9(this.LLILLL);
                }
                C658370Ps3 c658370Ps37 = C658280Pru.LLLI;
                C658370Ps3 c658370Ps38 = this.LLIZ;
                C0R4R c0r4r = new C0R4R(this, 0);
                InterfaceC656470Poz interfaceC656470Poz3 = this.LL;
                C0SZT<C0SMO<?, ?>, InterfaceC1587906Jp> c0szt2 = this.LLJI;
                LifecycleOwner lifecycleOwner = this.LLILZ;
                Function0<InterfaceC665370Q7z> function0 = this.LLILZIL;
                C650520PfO.LIZ.getClass();
                View viewLIZ3 = C650520PfO.LIZ(R.layout.f3r, viewGroup);
                if (C07GK.LIZ()) {
                    c658280Pru = new UserVideoHolderAssemSupport(viewLIZ3, c585710My9, interfaceC656470Poz3, c0szt2, lifecycleOwner, function0);
                    c658280Pru2 = c658280Pru;
                } else {
                    c658280Pru = new C658280Pru(viewLIZ3, c585710My9, interfaceC656470Poz3);
                    c658280Pru2 = c658280Pru;
                }
                if (c658370Ps38 == null) {
                    c658370Ps38 = C658280Pru.LLLI;
                }
                c658280Pru.LLJIJIL = c658370Ps38;
                c658280Pru.LLJJJJ = c0r4r;
                c658280Pru.T5(viewLIZ3);
                C1524805y2.LIZIZ(0L, new AwS554S0100000_10(c658280Pru, 1152));
                c658230Prp = c658280Pru2;
            }
        } else {
            C650520PfO.LIZ.getClass();
            c658230Prp = new C658230Prp(C650520PfO.LIZ(R.layout.ey1, viewGroup), this.LL, new AwS659S0100000_10(this, 7));
        }
        try {
            View view = c658230Prp.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c658230Prp.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c658230Prp.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c658230Prp.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c658230Prp.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c658230Prp.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c658230Prp.getClass().getName();
        return c658230Prp;
    }

    public C658220Pro(SearchAwemeCardViewHolder searchAwemeCardViewHolder, C653660PkS c653660PkS, RecyclerView recyclerView, LifecycleOwner lifecycleOwner, Function0 function0) {
        this.LL = searchAwemeCardViewHolder;
        this.LLILLJJLI = c653660PkS;
        this.LLILLL = recyclerView;
        this.LLILZ = lifecycleOwner;
        this.LLILZIL = function0;
    }
}
