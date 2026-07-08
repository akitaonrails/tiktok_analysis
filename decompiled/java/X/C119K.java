package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.119K, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C119K extends AbstractC21673619ry<RecyclerView.ViewHolder> implements InterfaceC19351710nL {
    public final C19GS LL;
    public final InterfaceC1452170ntP LLILLJJLI;
    public final VideoPublishEditModel LLILLL;
    public final AudioEffectParam LLILZ;
    public final InterfaceC1455860nzM LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public CategoryPageModel LLIZLLLIL;
    public List<? extends Effect> LLJ;
    public RecyclerView LLJI;
    public final C119L LLJIJIL = new C119L(this);
    public C119X LLJILJIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        CategoryEffectModel categoryEffects;
        List<Effect> effects;
        CategoryPageModel categoryPageModel = this.LLIZLLLIL;
        return ((categoryPageModel == null || (categoryEffects = categoryPageModel.getCategoryEffects()) == null || (effects = categoryEffects.getEffects()) == null) ? 0 : effects.size()) + 1;
    }

    public final void LLLII(int i) {
        boolean z;
        C19470511Fn c19470511Fn;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        int itemCount = getItemCount();
        int i2 = this.LLIZ;
        if (i2 >= 0 && i2 < itemCount) {
            z = true;
        } else {
            z = false;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = null;
        if (z) {
            RecyclerView recyclerView = this.LLJI;
            if (recyclerView != null) {
                viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i2);
            } else {
                viewHolderFindViewHolderForAdapterPosition = null;
            }
            if (viewHolderFindViewHolderForAdapterPosition instanceof C19351510nJ) {
                C19470511Fn c19470511Fn2 = ((C19351510nJ) viewHolderFindViewHolderForAdapterPosition).LLILZ;
                if (c19470511Fn2 != null) {
                    c19470511Fn2.LJFF(false);
                }
            } else {
                notifyItemChanged(this.LLIZ);
            }
        }
        this.LLIZ = i;
        if (i < getItemCount()) {
            RecyclerView recyclerView2 = this.LLJI;
            if (recyclerView2 != null) {
                viewHolderFindViewHolderForAdapterPosition2 = recyclerView2.findViewHolderForAdapterPosition(this.LLIZ);
            }
            if ((viewHolderFindViewHolderForAdapterPosition2 instanceof C19351510nJ) && (c19470511Fn = ((C19351510nJ) viewHolderFindViewHolderForAdapterPosition2).LLILZ) != null) {
                c19470511Fn.LJFF(true);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LLJI = recyclerView;
    }

    @Override // X.InterfaceC19351710nL
    public final void LIZ(int i, View view) {
        C119L c119l = this.LLJIJIL;
        if (c119l != null) {
            c119l.LIZ(i, view);
        }
    }

    public final void LLLI(int i, int i2) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        if (i >= 0 && i < getItemCount()) {
            RecyclerView recyclerView = this.LLJI;
            if (recyclerView != null) {
                viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            } else {
                viewHolderFindViewHolderForAdapterPosition = null;
            }
            if (viewHolderFindViewHolderForAdapterPosition instanceof C19351510nJ) {
                ((C19351510nJ) viewHolderFindViewHolderForAdapterPosition).L5(i2);
            } else {
                notifyItemChanged(i);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Effect effect;
        List<String> urlList;
        int iIntValue;
        Resources resources;
        Integer numLJIIJJI;
        Resources resources2;
        String string;
        if (viewHolder instanceof C19351510nJ) {
            Drawable drawable = null;
            if (i > 0) {
                effect = (Effect) ListProtector.get(this.LLJ, i - 1);
            } else {
                effect = null;
            }
            C19351510nJ c19351510nJ = (C19351510nJ) viewHolder;
            boolean z = true;
            if (c19351510nJ.getAdapterPosition() == 0) {
                C19470511Fn c19470511Fn = c19351510nJ.LLILZ;
                if (c19470511Fn != null) {
                    Context context = c19470511Fn.getContext();
                    if (context != null) {
                        string = context.getString(R.string.m8s);
                    } else {
                        string = null;
                    }
                    c19470511Fn.setText(string);
                }
                C19470511Fn c19470511Fn2 = c19351510nJ.LLILZ;
                if (c19470511Fn2 != null) {
                    Context context2 = c19470511Fn2.getContext();
                    if (context2 != null && (resources2 = context2.getResources()) != null) {
                        drawable = resources2.getDrawable(R.drawable.c49);
                    }
                    c19470511Fn2.LIZIZ(drawable);
                }
                ImageView imageView = c19351510nJ.LLILLL;
                if (imageView != null) {
                    C786410Ut5.LJZI(8, imageView);
                }
                C19470511Fn c19470511Fn3 = c19351510nJ.LLILZ;
                if (c19470511Fn3 != null) {
                    c19470511Fn3.LJFF(false);
                }
                c19351510nJ.L5(1);
                C19470511Fn c19470511Fn4 = c19351510nJ.LLILZ;
                if (c19470511Fn4 != null) {
                    c19470511Fn4.setIconImagePadding(10);
                }
            } else {
                if (effect != null) {
                    C19470511Fn c19470511Fn5 = c19351510nJ.LLILZ;
                    if (c19470511Fn5 != null) {
                        c19470511Fn5.setText(effect.getName());
                    }
                    UrlModel iconUrl = effect.getIconUrl();
                    if (iconUrl != null && (urlList = iconUrl.getUrlList()) != null && !urlList.isEmpty()) {
                        String effectId = effect.getEffectId();
                        if (effectId != null && (numLJIIJJI = C2095008Iq.LJIIJJI(effectId)) != null && numLJIIJJI.intValue() >= 0) {
                            C19470511Fn c19470511Fn6 = c19351510nJ.LLILZ;
                            if (c19470511Fn6 != null) {
                                c19470511Fn6.LJ((String) ListProtector.get(urlList, 0));
                            }
                        } else {
                            Integer numLJIIJJI2 = C2095008Iq.LJIIJJI((String) ListProtector.get(urlList, 0));
                            if (numLJIIJJI2 != null) {
                                iIntValue = numLJIIJJI2.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            C19470511Fn c19470511Fn7 = c19351510nJ.LLILZ;
                            if (c19470511Fn7 != null) {
                                Context context3 = c19470511Fn7.getContext();
                                if (context3 != null && (resources = context3.getResources()) != null) {
                                    drawable = resources.getDrawable(iIntValue);
                                }
                                c19470511Fn7.LIZIZ(drawable);
                            }
                        }
                    }
                    C19470511Fn c19470511Fn8 = c19351510nJ.LLILZ;
                    if (c19470511Fn8 != null) {
                        c19470511Fn8.LJFF(false);
                    }
                    C119R.LIZ().getClass();
                    c19351510nJ.L5(C119S.LIZ(effect) ? 1 : 0);
                }
                C19470511Fn c19470511Fn9 = c19351510nJ.LLILZ;
                if (c19470511Fn9 != null) {
                    c19470511Fn9.setIconImagePadding(0);
                }
            }
            if (i != this.LLIZ) {
                z = false;
            }
            C19470511Fn c19470511Fn10 = c19351510nJ.LLILZ;
            if (c19470511Fn10 != null) {
                c19470511Fn10.LJFF(z);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19351510nJ c19351510nJ = new C19351510nJ((FrameLayout) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ue, viewGroup, false), this);
        try {
            View view = c19351510nJ.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c19351510nJ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c19351510nJ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C19351510nJ.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c19351510nJ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c19351510nJ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C19351510nJ.class.getName();
        return c19351510nJ;
    }

    public final void LLLFZ(String str, String str2, String str3) {
        String str4 = str2;
        if (this.LLILLJJLI != null && str3 != null && str3.length() > 0) {
            if (str4 == null) {
                str4 = "";
            }
            int duration = this.LLILLJJLI.getDuration();
            C119R.LIZ().getClass();
            AudioEffectParam audioEffectParam = new AudioEffectParam(str, 0, 0, str3, str4, 0, duration, C119S.LIZJ.getValue().LIZ.LIZJ(str3), null, new ArrayList());
            audioEffectParam.setShowErrorToast(true);
            this.LLILZIL.tH1(C364410EQl.LIZ(true, audioEffectParam));
        }
    }

    public C119K(C19GS c19gs, InterfaceC1452170ntP interfaceC1452170ntP, VideoPublishEditModel videoPublishEditModel, AudioEffectParam audioEffectParam, InterfaceC1455860nzM interfaceC1455860nzM) {
        this.LL = c19gs;
        this.LLILLJJLI = interfaceC1452170ntP;
        this.LLILLL = videoPublishEditModel;
        this.LLILZ = audioEffectParam;
        this.LLILZIL = interfaceC1455860nzM;
    }
}
