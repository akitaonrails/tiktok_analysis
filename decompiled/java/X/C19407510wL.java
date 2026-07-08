package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.panel.EditTTSPanelFragment;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.VoiceCloneReadTextEffectBean;
import com.zhiliaoapp.musically.R;
import irm.AkS32S0300000_29;
import irm.AkS66S0200000_29;
import irm.AkS95S0100000_29;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.10wL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19407510wL extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final /* synthetic */ EditTTSPanelFragment LL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LL.LLILLJJLI).size();
    }

    public C19407510wL(EditTTSPanelFragment editTTSPanelFragment) {
        this.LL = editTTSPanelFragment;
    }

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        return ((ReadTextEffectBean) ListProtector.get(this.LL.LLILLJJLI, i)).hashCode();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (((ReadTextEffectBean) ListProtector.get(this.LL.LLILLJJLI, i)).instantClonePlaceHolder) {
            return 2;
        }
        if (((ReadTextEffectBean) ListProtector.get(this.LL.LLILLJJLI, i)).voiceClonePlaceHolder) {
            return 1;
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String string;
        String string2;
        boolean z;
        int i2;
        boolean z2;
        RelativeLayout.LayoutParams layoutParams;
        int iIntValue = -7829368;
        if (viewHolder instanceof C19407110wH) {
            C19407110wH c19407110wH = (C19407110wH) viewHolder;
            ReadTextEffectBean readTextEffectBean = (ReadTextEffectBean) ListProtector.get(this.LL.LLILLJJLI, i);
            c19407110wH.LLILZ.setText(readTextEffectBean.effect.getName());
            if (readTextEffectBean.mSpeaker.voiceDescriptions.length() > 0) {
                c19407110wH.LLILZIL.setText(readTextEffectBean.mSpeaker.voiceDescriptions);
                C786410Ut5.LLLLZLL(c19407110wH.LLILZIL, 0);
            } else {
                C786410Ut5.LLLLZLL(c19407110wH.LLILZIL, 8);
            }
            if (readTextEffectBean.mSpeaker.isFake) {
                C1331670kl3 c1331670kl3LJFF = C1331660kl2.LJFF(R.drawable.c8q);
                c1331670kl3LJFF.LJJ(c19407110wH.LL);
                C786410Ut5.h3(c1331670kl3LJFF);
            } else {
                List<String> urlList = readTextEffectBean.effect.getIcon_url().getUrlList();
                if (urlList != null && !urlList.isEmpty()) {
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ((String) ListProtector.get(urlList, 0));
                    c1331670kl3LJIIIZ.LJJ(c19407110wH.LL);
                    C786410Ut5.h3(c1331670kl3LJIIIZ);
                }
            }
            if (c19407110wH.LLJI.LL.LLILZLL) {
                C19670811xi c19670811xi = c19407110wH.LLIZLLLIL;
                c19670811xi.getLayoutParams().width = c19407110wH.LL.getWidth();
                c19670811xi.getLayoutParams().height = c19407110wH.LL.getHeight();
                c19670811xi.setCircleRadius(c19407110wH.LL.getWidth() / 2);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e4, c19670811xi.getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                }
                c19670811xi.setProgressColor(iIntValue);
                c19670811xi.setUseCenterIfNeed(true);
                c19670811xi.setMaxProgress(100);
                C786410Ut5.G1(c19670811xi, 8);
            }
            c19407110wH.N5(readTextEffectBean.selected);
            C786410Ut5.I7(new AkS32S0300000_29(c19407110wH, c19407110wH.LLJI.LL, readTextEffectBean, 1), c19407110wH.itemView);
            InterfaceC19407610wM interfaceC19407610wM = c19407110wH.LLJI.LL.LLILLL;
            if (interfaceC19407610wM != null && interfaceC19407610wM.LLJLILLLLZIIL(readTextEffectBean.mSpeaker.speakreID)) {
                C19407110wH.L5(c19407110wH, 1);
            } else if (readTextEffectBean.selected) {
                C19407110wH.L5(c19407110wH, 2);
            } else {
                C19407110wH.L5(c19407110wH, 0);
            }
            if (!C19407210wI.LIZ()) {
                try {
                    if (c19407110wH.LLIZ.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                        ViewGroup.LayoutParams layoutParams2 = c19407110wH.LLIZ.getLayoutParams();
                        if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                            layoutParams = (RelativeLayout.LayoutParams) layoutParams2;
                            if (layoutParams != null) {
                                layoutParams.setMarginEnd(0);
                            }
                        } else {
                            layoutParams = null;
                        }
                        C786410Ut5.d6(c19407110wH.LLIZ, layoutParams);
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                    return;
                }
            }
            return;
        }
        if (viewHolder instanceof C19407410wK) {
            C19407410wK c19407410wK = (C19407410wK) viewHolder;
            ReadTextEffectBean readTextEffectBean2 = (ReadTextEffectBean) ListProtector.get(this.LL.LLILLJJLI, i);
            c19407410wK.getClass();
            if (readTextEffectBean2 instanceof VoiceCloneReadTextEffectBean) {
                UrlModel urlModel = ((VoiceCloneReadTextEffectBean) readTextEffectBean2).userAvatar;
                if (urlModel != null) {
                    C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(urlModel.getUrlList()));
                    c1331670kl3LJIIJ.LJJ(c19407410wK.LL);
                    C786410Ut5.h3(c1331670kl3LJIIJ);
                }
                if (C123100dR.LIZ(readTextEffectBean2.mSpeaker.speakerName)) {
                    c19407410wK.LLILZ.setText(readTextEffectBean2.mSpeaker.speakerName);
                } else {
                    c19407410wK.LLILZ.setText(c19407410wK.itemView.getResources().getString(2131858294));
                }
                C786410Ut5.LLLLZLL(c19407410wK.LLIZLLLIL, 0);
                C786410Ut5.LLIIJLIL(c19407410wK.LLIZ, 0);
                C786410Ut5.LLLLLLZZ(c19407410wK.LLILZIL, 0);
                if (c19407410wK.LLJILJIL.LL.LLILZLL) {
                    C19670811xi c19670811xi2 = c19407410wK.LLJI;
                    c19670811xi2.getLayoutParams().width = c19407410wK.LL.getWidth();
                    c19670811xi2.getLayoutParams().height = c19407410wK.LL.getHeight();
                    c19670811xi2.setCircleRadius(c19407410wK.LL.getWidth() / 2);
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.e4, c19670811xi2.getContext());
                    if (numLIZJ2 != null) {
                        iIntValue = numLIZJ2.intValue();
                    }
                    c19670811xi2.setProgressColor(iIntValue);
                    c19670811xi2.setUseCenterIfNeed(true);
                    c19670811xi2.setMaxProgress(100);
                    C786410Ut5.G1(c19670811xi2, 8);
                }
                VoiceCloneReadTextEffectBean voiceCloneReadTextEffectBean = (VoiceCloneReadTextEffectBean) readTextEffectBean2;
                if (voiceCloneReadTextEffectBean.isRecordCompleted && C123100dR.LIZ(readTextEffectBean2.mSpeaker.speakreID)) {
                    z = true;
                } else {
                    z = false;
                }
                int i3 = voiceCloneReadTextEffectBean.requiredCount;
                if (i3 > 0 && !z) {
                    int i4 = (int) (((double) (voiceCloneReadTextEffectBean.succeedCount / i3)) * 0.9d * ((double) 100));
                    c19407410wK.LLIZ.setProgress(i4);
                    TuxTextView tuxTextView = c19407410wK.LLIZLLLIL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(i4);
                    sbLIZ.append('%');
                    tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
                    C786410Ut5.I7(new AkS66S0200000_29(c19407410wK, readTextEffectBean2, 2), c19407410wK.itemView);
                } else if (voiceCloneReadTextEffectBean.succeedCount > 0 && z) {
                    C786410Ut5.LLLLZLL(c19407410wK.LLIZLLLIL, 8);
                    C786410Ut5.LLIIJLIL(c19407410wK.LLIZ, 8);
                    C786410Ut5.LLLLLLZZ(c19407410wK.LLILZIL, 8);
                    C786410Ut5.I7(new AkS32S0300000_29(c19407410wK, readTextEffectBean2, c19407410wK.LLJILJIL.LL, 2), c19407410wK.itemView);
                } else {
                    c19407410wK.LLIZ.setProgress(0);
                    c19407410wK.LLIZLLLIL.setText("0%");
                    C786410Ut5.I7(new AkS66S0200000_29(c19407410wK, readTextEffectBean2, 3), c19407410wK.itemView);
                }
                TuxIconView tuxIconView = c19407410wK.LLILZLL;
                if (voiceCloneReadTextEffectBean.isPrivate) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                C786410Ut5.LLLLLLZZ(tuxIconView, i2);
                if (readTextEffectBean2.selected && z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c19407410wK.N5(z2);
                if (z) {
                    InterfaceC19407610wM interfaceC19407610wM2 = c19407410wK.LLJILJIL.LL.LLILLL;
                    if (interfaceC19407610wM2 != null && interfaceC19407610wM2.LLJLILLLLZIIL(readTextEffectBean2.mSpeaker.speakreID)) {
                        C19407410wK.L5(c19407410wK, 1);
                        return;
                    } else if (readTextEffectBean2.selected) {
                        C19407410wK.L5(c19407410wK, 2);
                        return;
                    } else {
                        C19407410wK.L5(c19407410wK, 0);
                        return;
                    }
                }
                C786410Ut5.LJZI(8, c19407410wK.LLILLL);
                return;
            }
            return;
        }
        if (viewHolder instanceof C19407310wJ) {
            C19407310wJ c19407310wJ = (C19407310wJ) viewHolder;
            ReadTextEffectBean readTextEffectBean3 = (ReadTextEffectBean) ListProtector.get(this.LL.LLILLJJLI, i);
            c19407310wJ.getClass();
            if (readTextEffectBean3 instanceof VoiceCloneReadTextEffectBean) {
                String str = "";
                if (C123100dR.LIZ(readTextEffectBean3.mSpeaker.speakreID)) {
                    C786410Ut5.I7(new AkS32S0300000_29(c19407310wJ, c19407310wJ.LLJILLL.LL, readTextEffectBean3, 0), c19407310wJ.itemView);
                    C786410Ut5.I7(new AkS66S0200000_29(c19407310wJ.LLJILLL.LL, readTextEffectBean3, 1), c19407310wJ.LLJIJIL);
                    if (C123100dR.LIZ(readTextEffectBean3.mSpeaker.speakerName)) {
                        c19407310wJ.LLILZ.setText(c19407310wJ.LLJILLL.LL.getString(2131858315, readTextEffectBean3.mSpeaker.speakerName));
                    } else {
                        TuxTextView tuxTextView2 = c19407310wJ.LLILZ;
                        Context context = c19407310wJ.LLJILLL.LL.getContext();
                        if (context != null && (string2 = context.getString(2131858294)) != null) {
                            str = string2;
                        }
                        tuxTextView2.setText(str);
                    }
                    VoiceCloneReadTextEffectBean voiceCloneReadTextEffectBean2 = (VoiceCloneReadTextEffectBean) readTextEffectBean3;
                    UrlModel urlModel2 = voiceCloneReadTextEffectBean2.userAvatar;
                    if (urlModel2 != null) {
                        C1331670kl3 c1331670kl3LJIIJ2 = C1331660kl2.LJIIJ(new C03IT(urlModel2.getUrlList()));
                        c1331670kl3LJIIJ2.LJJ(c19407310wJ.LL);
                        C786410Ut5.h3(c1331670kl3LJIIJ2);
                    }
                    C786410Ut5.LLLLLLZZ(c19407310wJ.LLIZLLLIL, 8);
                    C786410Ut5.LLLLLLZZ(c19407310wJ.LLJ, 8);
                    C786410Ut5.LLFF(0, c19407310wJ.LL);
                    C786410Ut5.LLLLLLZZ(c19407310wJ.LLJIJIL, 0);
                    if (voiceCloneReadTextEffectBean2.isPrivate) {
                        C786410Ut5.LLLLLLZZ(c19407310wJ.LLJI, 0);
                    } else {
                        C786410Ut5.LLLLLLZZ(c19407310wJ.LLJI, 8);
                    }
                    InterfaceC19407610wM interfaceC19407610wM3 = c19407310wJ.LLJILLL.LL.LLILLL;
                    if (interfaceC19407610wM3 != null && interfaceC19407610wM3.LLJLILLLLZIIL(readTextEffectBean3.mSpeaker.speakreID)) {
                        C19407310wJ.L5(c19407310wJ, 1);
                    } else if (readTextEffectBean3.selected) {
                        C19407310wJ.L5(c19407310wJ, 2);
                    } else {
                        C19407310wJ.L5(c19407310wJ, 0);
                    }
                    if (c19407310wJ.LLJILLL.LL.LLILZLL) {
                        C19670811xi c19670811xi3 = c19407310wJ.LLIZ;
                        c19670811xi3.getLayoutParams().width = c19407310wJ.LL.getWidth();
                        c19670811xi3.getLayoutParams().height = c19407310wJ.LL.getHeight();
                        c19670811xi3.setCircleRadius(c19407310wJ.LL.getWidth() / 2);
                        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.e4, c19670811xi3.getContext());
                        if (numLIZJ3 != null) {
                            iIntValue = numLIZJ3.intValue();
                        }
                        c19670811xi3.setProgressColor(iIntValue);
                        c19670811xi3.setUseCenterIfNeed(true);
                        c19670811xi3.setMaxProgress(100);
                        C786410Ut5.G1(c19670811xi3, 8);
                    }
                    c19407310wJ.N5(readTextEffectBean3.selected);
                    return;
                }
                c19407310wJ.N5(false);
                if (!c19407310wJ.LLJILJILJ) {
                    C11VK.LIZ.getClass();
                    C11VK.LJ("voice_panel", "show", false);
                    c19407310wJ.LLJILJILJ = true;
                }
                C786410Ut5.I7(new AkS95S0100000_29(c19407310wJ.LLJILLL.LL, 54), c19407310wJ.itemView);
                TuxTextView tuxTextView3 = c19407310wJ.LLILZ;
                Context context2 = c19407310wJ.LLJILLL.LL.getContext();
                if (context2 != null && (string = context2.getString(2131858350)) != null) {
                    str = string;
                }
                tuxTextView3.setText(str);
                C786410Ut5.LLFF(8, c19407310wJ.LL);
                C786410Ut5.LLLLLLZZ(c19407310wJ.LLJIJIL, 8);
                C786410Ut5.LLLLLLZZ(c19407310wJ.LLIZLLLIL, 0);
                C786410Ut5.LLLLLLZZ(c19407310wJ.LLJ, 0);
                C786410Ut5.LLLLLLZZ(c19407310wJ.LLJI, 8);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c19407110wH;
        if (i == 0) {
            if (C19407210wI.LIZ()) {
                c19407110wH = new C19407110wH(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.epb, viewGroup, false));
            } else {
                c19407110wH = new C19407110wH(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.epa, viewGroup, false));
            }
        } else if (i == 1) {
            if (C19407210wI.LIZ()) {
                c19407110wH = new C19407410wK(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.epd, viewGroup, false));
            } else {
                c19407110wH = new C19407410wK(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.epc, viewGroup, false));
            }
        } else if (i == 2) {
            if (C19407210wI.LIZ()) {
                c19407110wH = new C19407310wJ(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ep_, viewGroup, false));
            } else {
                c19407110wH = new C19407310wJ(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ep9, viewGroup, false));
            }
        } else {
            c19407110wH = new C19407110wH(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.epa, viewGroup, false));
        }
        try {
            View view = c19407110wH.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c19407110wH.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c19407110wH.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c19407110wH.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c19407110wH.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c19407110wH.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c19407110wH.getClass().getName();
        return c19407110wH;
    }
}
