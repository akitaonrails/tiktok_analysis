package X;

import Y.ACListenerS163S0100000_29;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS40S0101000_29;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;
import com.ss.android.ugc.gamora.editor.sticker.read.panel.EditTTSPanelFragment;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.VoiceCloneReadTextEffectBean;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.111b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C194329111b extends RelativeLayout {
    public View LL;
    public View LLILLJJLI;
    public C19Y3 LLILLL;
    public C21594319fB LLILZ;
    public C0HZQ LLILZIL;
    public TuxTextView LLILZLL;
    public LinearLayout LLIZ;
    public TuxTextView LLIZLLLIL;
    public final List<List<ReadTextEffectBean>> LLJ;
    public C1749280vcc LLJI;
    public C194328111a LLJIJIL;
    public InterfaceC19407610wM LLJILJIL;
    public final List<EditTTSPanelFragment> LLJILJILJ;
    public C19774712Yn LLJILLL;
    public C197039127h LLJJ;
    public View LLJJI;
    public RelativeLayout LLJJIII;
    public final C194330111c LLJJIJI;
    public ViewGroup LLJJIJIIJIL;
    public View LLJJIJIL;
    public RelativeLayout LLJJJ;
    public RelativeLayout LLJJJIL;
    public RelativeLayout LLJJJJ;
    public boolean LLJJJJJIL;
    public DialogC1389620mGW LLJJJJLIIL;
    public final C054G LLJJL;

    public final void LIZ() {
        View view = this.LLJJIJIL;
        if (view == null) {
            return;
        }
        if (view.getVisibility() != 8) {
            View view2 = this.LLJJIJIL;
            C786410Ut5.LJLLLLLL(8, view2 != null ? view2 : null);
        }
    }

    public final View getContentView() {
        C21594319fB c21594319fB = this.LLILZ;
        if (c21594319fB != null) {
            return c21594319fB;
        }
        return null;
    }

    public final int getCurrentItemIndex() {
        C21594319fB c21594319fB = this.LLILZ;
        if (c21594319fB == null) {
            c21594319fB = null;
        }
        return c21594319fB.getCurrentItem();
    }

    public final void LIZJ() {
        Activity activityLIZ;
        String string;
        Context context = getContext();
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        C1389880mGw c1389880mGw = new C1389880mGw(activityLIZ);
        Context context2 = getContext();
        if (context2 == null || (string = context2.getString(2131826664)) == null) {
            string = "";
        }
        c1389880mGw.LJIIIZ(string);
        c1389880mGw.LJIIJ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2296808zG.LIZJ(this.LLJJL, null);
        C194330111c c194330111c = this.LLJJIJI;
        C21594319fB c21594319fB = this.LLILZ;
        if (c21594319fB == null) {
            c21594319fB = null;
        }
        c194330111c.LJIIIIZZ();
        c21594319fB.removeOnPageChangeListener(c194330111c.LJII);
        C19774712Yn c19774712Yn = this.LLJILLL;
        if (c19774712Yn != null) {
            C21594319fB c21594319fB2 = this.LLILZ;
            if (c21594319fB2 == null) {
                c21594319fB2 = null;
            }
            c21594319fB2.removeOnPageChangeListener(c19774712Yn);
        }
        this.LLJILLL = null;
    }

    public static boolean LIZIZ(List list) {
        if (!C848680XRa.LIZJ()) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ReadTextEffectBean readTextEffectBean = (ReadTextEffectBean) it2.next();
            if (C848680XRa.LIZ(readTextEffectBean.mSpeaker.ttsReleaseDate)) {
                Keva keva = SpeakerCenter.LIZ;
                String effect_id = readTextEffectBean.effect.getEffect_id();
                if (C848680XRa.LIZJ()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(SpeakerCenter.LIZJ());
                    sbLIZ.append("tts_red_dot_shown_list_");
                    sbLIZ.append(effect_id);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    Keva keva2 = SpeakerCenter.LIZ;
                    if (keva2.contains(strLIZIZ)) {
                        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                        long j = keva2.getLong(strLIZIZ, -1L);
                        if (C848680XRa.LIZLLL() + j < jCurrentTimeMillis) {
                            keva2.erase(strLIZIZ);
                        } else if (C848680XRa.LIZ(j)) {
                        }
                    }
                    return true;
                }
                continue;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view = this.LLJJIJIL;
        View view2 = null;
        if (view == null) {
            view = null;
        }
        if (view.getVisibility() == 0) {
            this.LLJJJJJIL = true;
        } else {
            View view3 = this.LLJJIJIL;
            if (view3 != null) {
                view2 = view3;
            }
            if (view2.getVisibility() == 8) {
                this.LLJJJJJIL = false;
            }
        }
        if (motionEvent != null && motionEvent.getAction() == 1) {
            LIZ();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        C194330111c c194330111c = this.LLJJIJI;
        C21594319fB c21594319fB = this.LLILZ;
        if (c21594319fB == null) {
            c21594319fB = null;
        }
        c194330111c.LJFF(c21594319fB, z);
    }

    public final void setCheckBox(boolean z) {
        C0HZQ c0hzq = this.LLILZIL;
        if (c0hzq == null) {
            c0hzq = null;
        }
        c0hzq.setChecked(z);
    }

    public final void setCheckBoxText(String str) {
        TuxTextView tuxTextView = this.LLILZLL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setText(str);
    }

    public final void setContentLayoutHeight(int i) {
        RelativeLayout relativeLayout = this.LLJJIII;
        if (relativeLayout == null) {
            relativeLayout = null;
        }
        HandlerHook.viewPost(relativeLayout, new ARunnableS40S0101000_29(this, i, 11));
    }

    public final void setOnCheckBoxChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        C0HZQ c0hzq = this.LLILZIL;
        if (c0hzq == null) {
            c0hzq = null;
        }
        C786410Ut5.D7(c0hzq, onCheckedChangeListener);
    }

    public final void setOnParentLayoutListener(View.OnClickListener onClickListener) {
        View view = this.LLILLJJLI;
        if (view == null) {
            view = null;
        }
        C786410Ut5.I7(onClickListener, view);
    }

    public final void setPlayViewVisible(int i) {
        View view = this.LL;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    public final void setTTSPanelBeanOpt(final InterfaceC19407610wM interfaceC19407610wM) {
        if (C848680XRa.LIZJ()) {
            interfaceC19407610wM = new InterfaceC19407610wM(interfaceC19407610wM) { // from class: X.111Z
                public final InterfaceC19407610wM LL;

                @Override // X.InterfaceC19407610wM
                public final boolean LLJLILLLLZIIL(String str) {
                    return this.LL.LLJLILLLLZIIL(str);
                }

                @Override // X.InterfaceC19407610wM
                public final void LLJLLIL() {
                    this.LL.LLJLLIL();
                }

                @Override // X.InterfaceC19407610wM
                public final void LLJLLL() {
                    this.LL.LLJLLL();
                }

                @Override // X.InterfaceC19407610wM
                public final void LLJZIJLIL(VoiceCloneReadTextEffectBean voiceCloneReadTextEffectBean) {
                    this.LL.LLJZIJLIL(voiceCloneReadTextEffectBean);
                }

                @Override // X.InterfaceC19407610wM
                public final void LLLF(ReadTextEffectBean readTextEffectBean) {
                    this.LL.LLLF(readTextEffectBean);
                }

                @Override // X.InterfaceC19407610wM
                public final void LLLFF() {
                    this.LL.LLLFF();
                }

                @Override // X.InterfaceC19407610wM
                public final void LLLFFI(ReadTextEffectBean readTextEffectBean) {
                    this.LL.LLLFFI(readTextEffectBean);
                }

                @Override // X.InterfaceC19407610wM
                public final void LLLFZ() {
                    this.LL.LLLFZ();
                }

                @Override // X.InterfaceC19407610wM
                public final void LLLI(ReadTextEffectBean readTextEffectBean) {
                    this.LL.LLLI(readTextEffectBean);
                }

                {
                    this.LL = interfaceC19407610wM;
                }

                @Override // X.InterfaceC19407610wM
                public final void LLJLL(int i, boolean z, ArrayList arrayList) {
                    this.LL.LLJLL(i, z, arrayList);
                    if (z) {
                        C194329111b c194329111b = this.LLILLJJLI;
                        ArrayList<ReadTextEffectBean> arrayList2 = new ArrayList();
                        for (Object obj : arrayList) {
                            c194329111b.getClass();
                            if (C848680XRa.LIZ(((ReadTextEffectBean) obj).mSpeaker.ttsReleaseDate)) {
                                arrayList2.add(obj);
                            }
                        }
                        C194329111b c194329111b2 = this.LLILLJJLI;
                        for (ReadTextEffectBean readTextEffectBean : arrayList2) {
                            String effect_id = readTextEffectBean.effect.getEffect_id();
                            long j = readTextEffectBean.mSpeaker.ttsReleaseDate;
                            c194329111b2.getClass();
                            Keva keva = SpeakerCenter.LIZ;
                            if (C848680XRa.LIZJ()) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(SpeakerCenter.LIZJ());
                                sbLIZ.append("tts_red_dot_shown_list_");
                                sbLIZ.append(effect_id);
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                Keva keva2 = SpeakerCenter.LIZ;
                                keva2.storeLong(strLIZIZ, j);
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(SpeakerCenter.LIZJ());
                                sbLIZ2.append("tts_red_dot_shown_set");
                                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                                Set<String> stringSet = keva2.getStringSet(strLIZIZ2, new LinkedHashSet());
                                stringSet.add(effect_id);
                                keva2.storeStringSet(strLIZIZ2, stringSet);
                            }
                            C19Y3 c19y3 = c194329111b2.LLILLL;
                            View view = null;
                            if (c19y3 == null) {
                                c19y3 = null;
                            }
                            C19Y5 c19y5LJIIIZ = c19y3.LJIIIZ(i);
                            if (c19y5LJIIIZ != null) {
                                view = c19y5LJIIIZ.LJFF;
                            }
                            if (view instanceof C1642680sqg) {
                                ((C1642680sqg) view).LIZ(C194329111b.LIZIZ(arrayList));
                            }
                        }
                    }
                }
            };
        }
        this.LLJILJIL = interfaceC19407610wM;
    }

    public C194329111b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJ = new ArrayList();
        this.LLJILJILJ = new ArrayList();
        this.LLJJIJI = new C194330111c();
        this.LLJJL = C2296808zG.LIZIZ();
        setBackgroundColor(0);
        this.LLILLJJLI = C786410Ut5.Sd(R.layout.ep6, C786410Ut5.ne(context), this);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.evm);
        this.LLJJIII = relativeLayout;
        (relativeLayout == null ? null : relativeLayout).setBackgroundResource(R.drawable.a9d);
        this.LLJJIJIIJIL = (ViewGroup) findViewById(R.id.ktp);
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(context);
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.ep2, viewGroup == null ? null : viewGroup, true);
        this.LLJJIJIL = viewTd;
        this.LLJJJ = (RelativeLayout) (viewTd == null ? null : viewTd).findViewById(R.id.uup);
        View view = this.LLJJIJIL;
        this.LLJJJIL = (RelativeLayout) (view == null ? null : view).findViewById(R.id.vz2);
        View view2 = this.LLJJIJIL;
        this.LLJJJJ = (RelativeLayout) (view2 == null ? null : view2).findViewById(R.id.fkh);
        RelativeLayout relativeLayout2 = this.LLJJJ;
        (relativeLayout2 == null ? null : relativeLayout2).findViewById(R.id.uuq);
        RelativeLayout relativeLayout3 = this.LLJJJ;
        (relativeLayout3 == null ? null : relativeLayout3).findViewById(R.id.uur);
        View viewFindViewById = findViewById(R.id.lpx);
        this.LLJJI = viewFindViewById;
        C786410Ut5.I7(new ACListenerS163S0100000_29(this, 145), viewFindViewById == null ? null : viewFindViewById);
        View view3 = this.LLJJI;
        C786410Ut5.LJLLLLLL(8, view3 == null ? null : view3);
        this.LLILLL = (C19Y3) findViewById(R.id.y4m);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.eh, context);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, context);
            if (numLIZJ2 != null) {
                int iIntValue2 = numLIZJ2.intValue();
                C19Y3 c19y3 = this.LLILLL;
                (c19y3 == null ? null : c19y3).LJIIZILJ(iIntValue, iIntValue2);
            }
        }
        C19Y3 c19y32 = this.LLILLL;
        HandlerHook.viewPost(c19y32 == null ? null : c19y32, new ARunnableS129S0100000_29(this, 110));
        this.LLILZIL = (C0HZQ) findViewById(R.id.dqk);
        this.LLILZLL = (TuxTextView) findViewById(R.id.dqz);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.cc8);
        this.LLIZ = linearLayout;
        C786410Ut5.R7(linearLayout == null ? null : linearLayout, new ACListenerS163S0100000_29(this, 146));
        this.LL = findViewById(R.id.qnz);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.xm0);
        this.LLIZLLLIL = tuxTextView;
        C786410Ut5.h9(tuxTextView == null ? null : tuxTextView, new AkS95S0100000_29(this, 56));
        this.LLJI = (C1749280vcc) findViewById(R.id.nne);
        C21594319fB c21594319fB = (C21594319fB) findViewById(R.id.yxd);
        this.LLILZ = c21594319fB;
        C19774712Yn c19774712Yn = new C19774712Yn(this, 9);
        this.LLJILLL = c19774712Yn;
        (c21594319fB == null ? null : c21594319fB).addOnPageChangeListener(c19774712Yn);
        C197039127h c197039127h = (C197039127h) findViewById(R.id.db0);
        this.LLJJ = c197039127h;
        C786410Ut5.U8(c197039127h == null ? null : c197039127h, new ACListenerS163S0100000_29(this, 147));
        LinearLayout linearLayout2 = this.LLIZ;
        C786410Ut5.LJZL(8, linearLayout2 != null ? linearLayout2 : null);
    }
}
