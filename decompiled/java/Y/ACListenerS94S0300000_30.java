package Y;

import X.AbstractC20303614cU;
import X.C1233040iBy;
import X.C1390920mIc;
import X.C1796580wqu;
import X.C1862330yYx;
import X.C19EG;
import X.C20230914Dz;
import X.C20271714Tr;
import X.C20272014Tu;
import X.C20272214Tw;
import X.C20303114cP;
import X.C20303414cS;
import X.C2137908Zd;
import X.C244200wy;
import X.C2471909mP;
import X.C460020I2e;
import X.C786410Ut5;
import X.C946803n0;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.tako.botpage.components.feedback.TakoCSIFeedbackSheetFragment;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.otherpage.third.ThirdPartyTitleAssem;
import com.ss.android.ugc.aweme.tako.router.model.CsiBotData;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public class ACListenerS94S0300000_30 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS94S0300000_30 aCListenerS94S0300000_30, View view) {
        C20303114cP.LJIIZILJ((C20303414cS) aCListenerS94S0300000_30.l0, (Context) aCListenerS94S0300000_30.l1, (AbstractC20303614cU) aCListenerS94S0300000_30.l2, false, true, 4);
    }

    public static final void onClick$1(ACListenerS94S0300000_30 aCListenerS94S0300000_30, View view) {
        String str;
        String str2;
        C19EG activity;
        CsiBotData csiBotData;
        CsiBotData csiBotData2;
        C1862330yYx.LJJIJL(C1862330yYx.LIZ, (Map) aCListenerS94S0300000_30.l0);
        View view2 = (View) aCListenerS94S0300000_30.l1;
        Map<String, String> map = (Map) aCListenerS94S0300000_30.l0;
        AssemVMLazy assemVMLazy = ((ThirdPartyTitleAssem) aCListenerS94S0300000_30.l2).LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ThirdPartyTitleAssem.LLJJIJIIJIL;
        TakoEnterParams takoEnterParams = ((MessageViewModel) assemVMLazy.getValue()).LLILLL;
        if (takoEnterParams == null || (csiBotData2 = takoEnterParams.csiBotData) == null || (str = csiBotData2.feedbackSchema) == null) {
            str = "";
        }
        TakoEnterParams takoEnterParams2 = ((MessageViewModel) ((ThirdPartyTitleAssem) aCListenerS94S0300000_30.l2).LLJJIJI.getValue()).LLILLL;
        if (takoEnterParams2 == null || (csiBotData = takoEnterParams2.csiBotData) == null || (str2 = csiBotData.aboutSchema) == null) {
            str2 = "";
        }
        Fragment fragmentLIZ = C946803n0.LIZ(view2);
        if (fragmentLIZ != null) {
            activity = fragmentLIZ.getActivity();
        } else {
            activity = null;
        }
        FragmentManager fragmentManagerLIZ = C20230914Dz.LIZ(view2, activity);
        if (fragmentManagerLIZ != null) {
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TakoCSIFeedbackSheetFragment takoCSIFeedbackSheetFragment = new TakoCSIFeedbackSheetFragment();
            takoCSIFeedbackSheetFragment.LLILLL = map;
            takoCSIFeedbackSheetFragment.LL = str;
            takoCSIFeedbackSheetFragment.LLILLJJLI = str2;
            c1390920mIc.LIZ.LLJJIJI = takoCSIFeedbackSheetFragment;
            c1390920mIc.LJIIIIZZ(4);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.show(fragmentManagerLIZ, "");
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [X.09AY, kotlin.jvm.functions.Function1] */
    public static final void onClick$2(ACListenerS94S0300000_30 aCListenerS94S0300000_30, View view) {
        List<Integer> list;
        final C20271714Tr c20271714Tr = (C20271714Tr) aCListenerS94S0300000_30.l0;
        if (c20271714Tr.LLJIJIL) {
            return;
        }
        C20272014Tu c20272014Tu = (C20272014Tu) aCListenerS94S0300000_30.l1;
        final int adapterPosition = c20272014Tu.getAdapterPosition();
        MediaModel mediaModel = (MediaModel) aCListenerS94S0300000_30.l2;
        if (adapterPosition >= 0 && c20271714Tr.LLIZLLLIL != null && (list = c20271714Tr.LLIZ) != null && adapterPosition < ((ArrayList) list).size()) {
            int iIndexOf = ((ArrayList) c20271714Tr.LLIZLLLIL).indexOf(Integer.valueOf(adapterPosition));
            String strLIZ = "";
            if (iIndexOf >= 0) {
                ListProtector.set(c20271714Tr.LLIZ, adapterPosition, -1);
                TextView textView = c20272014Tu.LLILLJJLI;
                if (textView != null) {
                    textView.setText("");
                }
                TextView textView2 = c20272014Tu.LLILLJJLI;
                if (textView2 != null) {
                    textView2.setBackgroundResource(R.drawable.cf5);
                }
                View view2 = c20272014Tu.LLILZ;
                if (view2 != null) {
                    view2.animate().alpha(0.0f).setDuration(300L).withEndAction(new ARunnableS13S0201000_6(view2, adapterPosition, c20271714Tr, 7)).start();
                }
                RemoteImageView remoteImageView = c20272014Tu.LL;
                if (remoteImageView != null) {
                    remoteImageView.animate().scaleY(1.0f).scaleX(1.0f).setDuration(300L).start();
                }
                List<C20272214Tw> list2 = c20271714Tr.LLJ;
                if (list2 != null) {
                    ListProtector.remove(list2, iIndexOf);
                }
                List<Integer> list3 = c20271714Tr.LLIZLLLIL;
                if (list3 != null) {
                    ((ArrayList) list3).remove(Integer.valueOf(adapterPosition));
                }
                int size = ((ArrayList) c20271714Tr.LLIZLLLIL).size();
                while (iIndexOf < size) {
                    int iIntValue = ((Number) ListProtector.get(c20271714Tr.LLIZLLLIL, iIndexOf)).intValue();
                    if (iIntValue >= 0 && iIntValue < ((ArrayList) c20271714Tr.LLIZ).size()) {
                        ListProtector.set(c20271714Tr.LLIZ, iIntValue, Integer.valueOf(iIndexOf));
                    }
                    if (size != c20271714Tr.LLILLJJLI - 1) {
                        c20271714Tr.notifyItemChanged(iIntValue);
                    }
                    iIndexOf++;
                }
                if (size == c20271714Tr.LLILLJJLI - 1) {
                    c20271714Tr.notifyDataSetChanged();
                }
                ?? r1 = c20271714Tr.LLJILJILJ;
                if (r1 != 0) {
                    r1.invoke(c20271714Tr.LLJ);
                    return;
                }
                return;
            }
            int size2 = ((ArrayList) c20271714Tr.LLIZLLLIL).size();
            int i = c20271714Tr.LLILLJJLI;
            if (size2 >= i) {
                String string = c20271714Tr.LL.getString(2131828638, Integer.valueOf(i));
                C1233040iBy c1233040iBy = new C1233040iBy(c20271714Tr.LL);
                c1233040iBy.LIZJ(string);
                c1233040iBy.LIZLLL();
                return;
            }
            long j = c20271714Tr.LLILLL;
            if (C2471909mP.LJIIIZ(mediaModel.LJFF()) > j) {
                String string2 = c20271714Tr.LL.getString(2131822005, C244200wy.LIZ(j));
                C1233040iBy c1233040iBy2 = new C1233040iBy(C460020I2e.LIZ);
                c1233040iBy2.LIZJ(string2);
                c1233040iBy2.LIZLLL();
                return;
            }
            if (c20271714Tr.LLJ == null) {
                c20271714Tr.LLJ = new ArrayList();
            }
            try {
                if (c20271714Tr.LLILZ) {
                    C2137908Zd c2137908Zd = C2137908Zd.LIZJ;
                    String string3 = C2471909mP.LJIILIIL(c20272014Tu.LLILZIL).toString();
                    c2137908Zd.getClass();
                    strLIZ = C1796580wqu.LIZ(C2137908Zd.LJ(string3));
                }
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            List<C20272214Tw> list4 = c20271714Tr.LLJ;
            if (list4 != null) {
                ((ArrayList) list4).add(new C20272214Tw(C2471909mP.LJIILIIL(c20272014Tu.LLILZIL).toString(), strLIZ));
            }
            List<Integer> list5 = c20271714Tr.LLIZLLLIL;
            if (list5 != null) {
                ((ArrayList) list5).add(Integer.valueOf(adapterPosition));
            }
            int size3 = ((ArrayList) c20271714Tr.LLIZLLLIL).size() - 1;
            TextView textView3 = c20272014Tu.LLILLJJLI;
            if (textView3 != null) {
                textView3.setText(String.valueOf(size3 + 1));
            }
            TextView textView4 = c20272014Tu.LLILLJJLI;
            if (textView4 != null) {
                textView4.setBackgroundResource(R.drawable.cf6);
            }
            final int size4 = ((ArrayList) c20271714Tr.LLIZLLLIL).size();
            ListProtector.set(c20271714Tr.LLIZ, adapterPosition, Integer.valueOf(size4 - 1));
            RemoteImageView remoteImageView2 = c20272014Tu.LL;
            if (remoteImageView2 != null) {
                remoteImageView2.animate().scaleY(1.1f).scaleX(1.1f).setDuration(300L).withEndAction(new Runnable() { // from class: X.14Ts
                    /* JADX WARN: Type inference failed for: r1v2, types: [X.09AY, kotlin.jvm.functions.Function1] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ImageChooseAdapter@8d6d.handleImageSelected$3$1");
                        try {
                            int i2 = size4;
                            C20271714Tr c20271714Tr2 = c20271714Tr;
                            if (i2 == c20271714Tr2.LLILLJJLI) {
                                c20271714Tr2.notifyDataSetChanged();
                            } else {
                                c20271714Tr2.notifyItemChanged(adapterPosition);
                            }
                            C20271714Tr c20271714Tr3 = c20271714Tr;
                            ?? r12 = c20271714Tr3.LLJILJILJ;
                            if (r12 != 0) {
                                r12.invoke(c20271714Tr3.LLJ);
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ImageChooseAdapter@8d6d.handleImageSelected$3$1");
                    }
                }).start();
            }
            View view3 = c20272014Tu.LLILZ;
            if (view3 != null) {
                C786410Ut5.T4(view3, 0.0f);
                C786410Ut5.LJLLLLLL(0, view3);
                view3.animate().alpha(1.0f).setDuration(300L).start();
            }
        }
    }

    public ACListenerS94S0300000_30(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj3;
        this.l1 = obj;
        this.l2 = obj2;
    }
}
