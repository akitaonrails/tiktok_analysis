package X;

import Y.AObjectS385S0100000_10;
import Y.ARunnableS110S0100000_10;
import Y.ARunnableS73S0200000_4;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.common.viewmodel.KeyboardModel;
import com.ss.android.ugc.aweme.search.middle.AbstractSearchIntermediateFragmentNew;
import com.ss.android.ugc.aweme.search.model.RichSugInfo;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.viewmodel.SearchIntermediateViewModelNew;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: renamed from: X.0QMf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C669070QMf extends AbstractC21673619ry<RecyclerView.ViewHolder> implements C0QN0 {
    public String LLILLJJLI;
    public String LLILLL;
    public AbstractSearchIntermediateFragmentNew LLILZ;
    public String LLILZIL;
    public final KeyboardModel LLILZLL;
    public final SearchIntermediateViewModelNew LLIZ;
    public InterfaceC668720QKw LLIZLLLIL;
    public final C669210QMt LLJ;
    public final C19EG LLJI;
    public final RecyclerView LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public SearchSugEntity LLJILLL;
    public final C669200QMs LLJJ;
    public List<SearchSugEntity> LL = new ArrayList();
    public boolean LLJJI = false;
    public boolean LLJJIII = false;

    public final List<SearchSugEntity> LLLFZ() {
        if (this.LL == null) {
            this.LL = new ArrayList();
        }
        return new ArrayList(this.LL);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        SearchSugEntity searchSugEntity;
        if (!C086I.LIZIZ(this.LL) && (searchSugEntity = (SearchSugEntity) ListProtector.get(this.LL, i)) != null) {
            if (searchSugEntity.LIZ == 3) {
                return 3;
            }
            if (TextUtils.equals(searchSugEntity.sugType, "tako")) {
                return 10;
            }
            return 9;
        }
        return 9;
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.getRecycledViewPool().setMaxRecycledViews(9, 10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof InterfaceC669260QMy) {
            ((InterfaceC669260QMy) viewHolder).onViewAttachedToWindow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof InterfaceC669260QMy) {
            ((InterfaceC669260QMy) viewHolder).onViewDetachedFromWindow();
        }
    }

    public C669070QMf(C19EG c19eg, RecyclerView recyclerView) {
        this.LLJI = c19eg;
        this.LLJIJIL = recyclerView;
        this.LLJJ = new C669200QMs(recyclerView, this);
        if (c19eg != null) {
            this.LLIZ = (SearchIntermediateViewModelNew) C679340Qkm.LIZ(recyclerView, c19eg).get(SearchIntermediateViewModelNew.class);
            this.LLILZLL = (KeyboardModel) C679340Qkm.LIZ(recyclerView, c19eg).get(KeyboardModel.class);
        }
        this.LLJ = new C669210QMt(this);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        SugExtraInfo sugExtraInfo;
        String takoDesc;
        C430210Gtv avatarImageView;
        C430210Gtv avatarImageView2;
        boolean zLJI = MethodIDManager.LJI(71813);
        getItemViewType(i);
        String str2 = "";
        if (viewHolder instanceof C669080QMg) {
            C669080QMg c669080QMg = (C669080QMg) viewHolder;
            SearchSugEntity searchSugEntity = (SearchSugEntity) ListProtector.get(this.LL, i);
            String str3 = this.LLILLJJLI;
            String str4 = this.LLJILJILJ;
            C669230QMv c669230QMv = new C669230QMv(this);
            if (searchSugEntity == null) {
                c669080QMg.getClass();
            } else {
                c669080QMg.LLJJLIIIJLLLLLLLZ = c669230QMv;
                c669080QMg.LLJJJIL = str4;
                int i2 = searchSugEntity.LIZJ;
                if (i2 < 0) {
                    i2 = i;
                }
                c669080QMg.LLJJJJJIL = i2;
                c669080QMg.LLJJIJI = searchSugEntity;
                c669080QMg.LLJJJJ = C668470QJx.LIZ(searchSugEntity);
                c669080QMg.LLJJIJIL = i;
                c669080QMg.LLJJJJLIIL = str3;
                c669080QMg.LLJJJ = c669080QMg.LL;
                c669080QMg.LLJJIJIIJIL = null;
                c669080QMg.itemView.setTag(c669080QMg);
                if (searchSugEntity.LIZJ()) {
                    C0QEE c0qee = C0QEE.LIZ;
                    String str5 = searchSugEntity.content;
                    c0qee.getClass();
                    SearchHistory searchHistoryLJ = C0QEE.LJ(str5);
                    c669080QMg.LLJJIJIIJIL = searchHistoryLJ;
                    if (searchHistoryLJ == null) {
                        TuxIconView tuxIconView = c669080QMg.LLJ;
                        if (tuxIconView != null) {
                            tuxIconView.setImageDrawable(c669080QMg.LLJLLL);
                        }
                        FrameLayout frameLayout = c669080QMg.LLJJI;
                        if (frameLayout != null) {
                            C786410Ut5.LJLLLLLL(8, frameLayout);
                        }
                        SmartImageView smartImageView = c669080QMg.LLJJIII;
                        if (smartImageView != null) {
                            C786410Ut5.LJLLLLLL(8, smartImageView);
                        }
                    } else {
                        TuxIconView tuxIconView2 = c669080QMg.LLJ;
                        if (tuxIconView2 != null) {
                            tuxIconView2.setImageDrawable((Drawable) c669080QMg.LLJZ.getValue());
                        }
                        FrameLayout frameLayout2 = c669080QMg.LLJJI;
                        if (frameLayout2 != null) {
                            C786410Ut5.LJLLLLLL(0, frameLayout2);
                        }
                        SmartImageView smartImageView2 = c669080QMg.LLJJIII;
                        if (smartImageView2 != null) {
                            C786410Ut5.LJLLLLLL(0, smartImageView2);
                        }
                        String str6 = searchHistoryLJ.coverImageUrl;
                        if (str6 == null) {
                            str6 = "";
                        }
                        SmartImageView smartImageView3 = c669080QMg.LLJJIII;
                        if (smartImageView3 != null) {
                            smartImageView3.LIZ(C1331660kl2.LJIIIZ(str6).LIZJ());
                        }
                    }
                    TuxIconView tuxIconView3 = c669080QMg.LLIZLLLIL;
                    if (tuxIconView3 != null) {
                        tuxIconView3.setImageDrawable(c669080QMg.LLJLLIL);
                    }
                    TuxIconView tuxIconView4 = c669080QMg.LLIZLLLIL;
                    if (tuxIconView4 != null) {
                        tuxIconView4.setContentDescription(c669080QMg.itemView.getContext().getString(2131823323));
                    }
                } else {
                    TuxIconView tuxIconView5 = c669080QMg.LLJ;
                    if (tuxIconView5 != null) {
                        tuxIconView5.setImageDrawable(c669080QMg.LLJZIJLIL);
                    }
                    TuxIconView tuxIconView6 = c669080QMg.LLIZLLLIL;
                    if (tuxIconView6 != null) {
                        tuxIconView6.setImageDrawable(c669080QMg.LLL);
                    }
                    TuxIconView tuxIconView7 = c669080QMg.LLIZLLLIL;
                    if (tuxIconView7 != null) {
                        tuxIconView7.setContentDescription(c669080QMg.itemView.getContext().getString(2131823322));
                    }
                    FrameLayout frameLayout3 = c669080QMg.LLJJI;
                    if (frameLayout3 != null) {
                        C786410Ut5.LJLLLLLL(8, frameLayout3);
                    }
                    SmartImageView smartImageView4 = c669080QMg.LLJJIII;
                    if (smartImageView4 != null) {
                        C786410Ut5.LJLLLLLL(8, smartImageView4);
                    }
                }
                if (C0QNF.LIZJ(searchSugEntity)) {
                    SugExtraInfo sugExtraInfo2 = searchSugEntity.sugExtraInfo;
                    if (sugExtraInfo2 != null) {
                        String userAvatarUri = sugExtraInfo2.getUserAvatarUri();
                        if (userAvatarUri != null && userAvatarUri.length() != 0) {
                            C1610670s13 c1610670s13 = c669080QMg.LLJI;
                            if (c1610670s13 != null && (avatarImageView2 = c1610670s13.getAvatarImageView()) != null) {
                                FrameLayout frameLayout4 = c669080QMg.LLJILJILJ;
                                if (frameLayout4 != null) {
                                    C786410Ut5.LJZ(0, frameLayout4);
                                }
                                C823050WQl.LIZJ().execute(new ARunnableS73S0200000_4(sugExtraInfo2, avatarImageView2, 28));
                            }
                        } else {
                            C1610670s13 c1610670s132 = c669080QMg.LLJI;
                            if (c1610670s132 != null && (avatarImageView = c1610670s132.getAvatarImageView()) != null) {
                                avatarImageView.setController(null);
                            }
                        }
                        if (sugExtraInfo2.isLiveQuery() && C1828607Ee.LIZ()) {
                            C1610770s1D c1610770s1D = c669080QMg.LLJIJIL;
                            if (c1610770s1D != null) {
                                C786410Ut5.Y(c1610770s1D, 0);
                            }
                            C1610670s13 c1610670s133 = c669080QMg.LLJI;
                            C1608510rxZ c1608510rxZ = new C1608510rxZ(c1610670s133, c1610670s133, c669080QMg.LLJIJIL);
                            c1608510rxZ.LJIIIIZZ = false;
                            c669080QMg.LLJILLL = c1608510rxZ;
                            C1610670s13 c1610670s134 = c669080QMg.LLJI;
                            if (c1610670s134 != null) {
                                c1610670s134.LJFF(true);
                            }
                            C1610670s13 c1610670s135 = c669080QMg.LLJI;
                            if (c1610670s135 != null) {
                                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
                                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                                if (c1610670s135.getLiveTagView() != null) {
                                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iLIZIZ, iLIZIZ2);
                                    layoutParams.addRule(10);
                                    layoutParams.addRule(14);
                                    C786410Ut5.R6(c1610670s135.getLiveTagView(), layoutParams);
                                }
                            }
                        }
                    }
                } else {
                    FrameLayout frameLayout5 = c669080QMg.LLJILJILJ;
                    if (frameLayout5 != null) {
                        C786410Ut5.LJZ(8, frameLayout5);
                    }
                }
                c669080QMg.I5(searchSugEntity);
                if (!c669080QMg.LLJJL) {
                    c669080QMg.LLJJL = true;
                    HandlerHook.viewPost(c669080QMg.itemView, new ARunnableS110S0100000_10(c669080QMg, 115));
                }
            }
        }
        if (viewHolder instanceof C669110QMj) {
            C669110QMj c669110QMj = (C669110QMj) viewHolder;
            SearchSugEntity searchSugEntity2 = (SearchSugEntity) ListProtector.get(this.LL, i);
            String str7 = this.LLILLJJLI;
            String str8 = this.LLJILJILJ;
            c669110QMj.LLIZ = searchSugEntity2;
            c669110QMj.LLIZLLLIL = i;
            c669110QMj.LLJ = str7;
            c669110QMj.LLJI = str8;
            if (searchSugEntity2 == null || (str = searchSugEntity2.content) == null) {
                str = "";
            }
            TuxTextView tuxTextView = c669110QMj.LLILZIL;
            if (tuxTextView != null) {
                tuxTextView.setText(str);
            }
            int i3 = C20094413jq.LJIIZILJ;
            View view = c669110QMj.itemView;
            C1397760mTe c1397760mTe = new C1397760mTe();
            c1397760mTe.LIZIZ = EnumC1397840mTm.BUTTON;
            c1397760mTe.LIZJ = null;
            c1397760mTe.LIZ = str;
            C20094813ju.LIZ(view, c1397760mTe.LIZ());
            TuxTextView tuxTextView2 = c669110QMj.LLILZLL;
            if (tuxTextView2 != null) {
                if (searchSugEntity2 != null && (sugExtraInfo = searchSugEntity2.sugExtraInfo) != null && (takoDesc = sugExtraInfo.getTakoDesc()) != null) {
                    str2 = takoDesc;
                }
                tuxTextView2.setText(str2);
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderLIZIZ;
        if (C1839207Ig.LIZ()) {
            ((ExecutorService) C1516330pYt.LIZIZ.getValue()).execute(new ARunnableS110S0100000_10(this, 114));
        } else {
            new C667750QHd(this.LLJI, C651580Ph6.LIZLLL(this.LLJIJIL)).LIZ(new C0Q3J("sug"));
        }
        boolean zLIZ = true;
        int i2 = 0;
        if (i == 9) {
            C669200QMs c669200QMs = this.LLJJ;
            c669200QMs.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            viewHolderLIZIZ = ((AbstractC669180QMq) c669200QMs.LIZLLL.getValue()).LIZIZ();
            if (viewHolderLIZIZ == null) {
                viewHolderLIZIZ = ((AbstractC669180QMq) c669200QMs.LIZLLL.getValue()).LIZ();
            } else {
                i2 = 1;
            }
            C01V2.LIZ(i2, "viewholder", System.currentTimeMillis() - jCurrentTimeMillis, "sugUnifiedViewHolder");
        } else if (i == 10) {
            C669200QMs c669200QMs2 = this.LLJJ;
            c669200QMs2.getClass();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            viewHolderLIZIZ = ((AbstractC669180QMq) c669200QMs2.LJ.getValue()).LIZIZ();
            if (viewHolderLIZIZ == null) {
                viewHolderLIZIZ = ((AbstractC669180QMq) c669200QMs2.LJ.getValue()).LIZ();
            } else {
                i2 = 1;
            }
            C01V2.LIZ(i2, "viewholder", System.currentTimeMillis() - jCurrentTimeMillis2, "sugTakoViewHolder");
        } else if (i == 3) {
            C669200QMs c669200QMs3 = this.LLJJ;
            c669200QMs3.getClass();
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            viewHolderLIZIZ = c669200QMs3.LIZJ.LIZIZ();
            if (viewHolderLIZIZ == null) {
                viewHolderLIZIZ = c669200QMs3.LIZJ.LIZ();
            } else {
                i2 = 1;
            }
            C01V2.LIZ(i2, "viewholder", System.currentTimeMillis() - jCurrentTimeMillis3, "sugReportViewHolder");
        } else {
            viewHolderLIZIZ = null;
        }
        if (viewHolderLIZIZ != null) {
            try {
                View view = viewHolderLIZIZ.itemView;
                if (view != null) {
                    view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        viewHolderLIZIZ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolderLIZIZ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    zLIZ = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (zLIZ) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolderLIZIZ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolderLIZIZ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolderLIZIZ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewHolderLIZIZ.getClass().getName();
        return viewHolderLIZIZ;
    }

    public final void LLLI(int i, SearchSugEntity searchSugEntity, String str, String str2, AwS589S0100000_10 awS589S0100000_10) throws Throwable {
        Word word;
        String wordSource;
        String penetrateInfo;
        SugExtraInfo sugExtraInfo;
        if (this.LLJI == null || searchSugEntity.LIZJ() || (word = searchSugEntity.mWord) == null) {
            return;
        }
        word.setWordPosition(i);
        C653660PkS c653660PkS = new C653660PkS();
        c653660PkS.LJFF = this.LLJILJIL;
        c653660PkS.LJIIJJI = this.LLILLJJLI;
        c653660PkS.LJI = this.LLILZIL;
        c653660PkS.LJII = str;
        RichSugInfo richSugInfo = searchSugEntity.richSugInfo;
        if (richSugInfo != null) {
            c653660PkS.LJJJZ = richSugInfo.sugReason;
        }
        if (word.getWordSource() != null) {
            wordSource = word.getWordSource();
        } else {
            wordSource = "sug";
        }
        AObjectS385S0100000_10 aObjectS385S0100000_10 = new AObjectS385S0100000_10(this, 0);
        try {
            sugExtraInfo = searchSugEntity.sugExtraInfo;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (sugExtraInfo != null && sugExtraInfo.getPenetrateInfo() != null) {
            penetrateInfo = searchSugEntity.sugExtraInfo.getPenetrateInfo();
        } else {
            penetrateInfo = null;
        }
        C670730QSp.LIZIZ(this.LLJIJIL, this.LLJI, c653660PkS, word, wordSource, aObjectS385S0100000_10, C0QN9.SUG, str2, penetrateInfo, awS589S0100000_10);
    }
}
