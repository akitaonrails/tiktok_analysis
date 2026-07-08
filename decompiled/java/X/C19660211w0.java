package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.FeedbackResponse;
import com.bytedance.android.live.broadcast.model.SubmitSurveyAnswerRequest;
import com.bytedance.android.live.broadcast.model.SurveyAnswer;
import com.bytedance.android.live.broadcast.model.SurveyQuestionOption;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.11w0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19660211w0 implements C11GG {
    public SurveyQuestionOption LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public Long LLILZIL;
    public Context LLILZLL;
    public View LLIZ;
    public View LLIZLLLIL;
    public View LLJ;
    public TuxIconView LLJI;
    public TuxTextView LLJIJIL;
    public RecyclerView LLJILJIL;
    public View LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxIconView LLJJ;
    public C197039127h LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public InterfaceC19661111w9 LLJJIJIL;
    public C19409110wb LLJJJ;
    public String LLJJI = "";
    public final ViewOnClickListenerC19660311w1 LLJJJIL = new View.OnClickListener() { // from class: X.11w1
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v30, types: [X.11w5] */
        /* JADX WARN: Type inference failed for: r0v53, types: [X.11w8] */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TuxTextView tuxTextView;
            CharSequence text;
            CharSequence text2;
            int id = view.getId();
            if (id != R.id.dgb) {
                if (id == R.id.krx) {
                    C19660211w0 c19660211w0 = this.LL;
                    Context context = c19660211w0.LLILZLL;
                    if (context != null) {
                        C11GD c11gd = new C11GD(context, true, c19660211w0.LLJJI, c19660211w0, c19660211w0.LLILZIL, c19660211w0.LLILLL, c19660211w0.LLILLJJLI);
                        c11gd.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: X.11w6
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                            }
                        });
                        c11gd.show();
                        C785410UrT.LIZIZ(c11gd);
                        PopupMonitorServiceImpl.LIZ.getClass();
                        PopupMonitorServiceImpl.LJJJ(c11gd);
                        C816490W1f.LIZ(c11gd);
                        return;
                    }
                    return;
                }
                if (id == R.id.e0h) {
                    TuxTextView tuxTextView2 = this.LL.LLJILLL;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setText("");
                    }
                    this.LL.LLJJI = "";
                    return;
                }
                if (id == R.id.cvd) {
                    C19660411w2 c19660411w2 = C19660411w2.LIZ;
                    C19660211w0 c19660211w02 = this.LL;
                    Long l = c19660211w02.LLILZIL;
                    String str = c19660211w02.LLILLL;
                    String str2 = c19660211w02.LLILLJJLI;
                    c19660411w2.getClass();
                    C19660411w2.LJI = str2;
                    C19660411w2.LJII = str;
                    C19660411w2.LJIIIIZZ = l;
                    View view2 = this.LL.LLJILJILJ;
                    if (view2 != null && view2.getVisibility() == 0 && (tuxTextView = this.LL.LLJILLL) != null && (text = tuxTextView.getText()) != null && text.length() > 0) {
                        C19660211w0 c19660211w03 = this.LL;
                        final Context context2 = c19660211w03.LLILZLL;
                        TuxTextView tuxTextView3 = c19660211w03.LLJILLL;
                        if (tuxTextView3 != null) {
                            text2 = tuxTextView3.getText();
                        } else {
                            text2 = null;
                        }
                        String strValueOf = String.valueOf(text2);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("entrance", "LIVE_Academy");
                        linkedHashMap.put("qr_id", "7202594730163689989");
                        linkedHashMap.put("appkey", "tiktok-android");
                        linkedHashMap.put("live_academy_option", C19660411w2.LIZLLL);
                        linkedHashMap.put("content", strValueOf);
                        C844470XAv.LIZ.getClass();
                        linkedHashMap.put("app_version", C844470XAv.LJFF());
                        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJLJJLL(linkedHashMap, new InterfaceC19661411wC() { // from class: X.11w8
                            @Override // X.InterfaceC19661411wC
                            public final void onFailed() {
                                C19660411w2 c19660411w22 = C19660411w2.LIZ;
                                Context context3 = context2;
                                c19660411w22.getClass();
                                C19660411w2.LIZJ(context3, "", "feedback", false);
                            }

                            @Override // X.InterfaceC19661411wC
                            public final void LIZ(FeedbackResponse feedbackResponse) {
                                int i = feedbackResponse.errorCode;
                                if (i == 0) {
                                    C19660411w2 c19660411w22 = C19660411w2.LIZ;
                                    Context context3 = context2;
                                    c19660411w22.getClass();
                                    C19660411w2.LIZJ(context3, "", "feedback", true);
                                    return;
                                }
                                if (i != -1) {
                                    return;
                                }
                                C19660411w2 c19660411w23 = C19660411w2.LIZ;
                                Context context4 = context2;
                                c19660411w23.getClass();
                                C19660411w2.LIZJ(context4, "-1", "feedback", false);
                            }
                        });
                    } else {
                        C19660211w0 c19660211w04 = this.LL;
                        final Context context3 = c19660211w04.LLILZLL;
                        String str3 = c19660211w04.LLILLJJLI;
                        String str4 = c19660211w04.LLILZ;
                        SurveyAnswer surveyAnswer = C19660411w2.LIZJ;
                        if (surveyAnswer != null) {
                            List listSingletonList = Collections.singletonList(surveyAnswer);
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            if (str3 == null) {
                                str3 = "";
                            }
                            linkedHashMap2.put("taskID", str3);
                            if (str4 == null) {
                                str4 = "";
                            }
                            linkedHashMap2.put("videoID", str4);
                            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LLIL(new SubmitSurveyAnswerRequest("academy_video", listSingletonList, linkedHashMap2), new C1AKF() { // from class: X.11w5
                                @Override // X.C1AKF
                                public final void onFailed() {
                                    C19660411w2 c19660411w22 = C19660411w2.LIZ;
                                    Context context4 = context3;
                                    c19660411w22.getClass();
                                    C19660411w2.LIZJ(context4, "", "live_server", false);
                                }

                                @Override // X.C1AKF
                                public final void LIZIZ(int i) {
                                    if (i == 0) {
                                        C19660411w2 c19660411w22 = C19660411w2.LIZ;
                                        Context context4 = context3;
                                        c19660411w22.getClass();
                                        C19660411w2.LIZJ(context4, "", "live_server", true);
                                        return;
                                    }
                                    C19660411w2 c19660411w23 = C19660411w2.LIZ;
                                    Context context5 = context3;
                                    String strValueOf2 = String.valueOf(i);
                                    c19660411w23.getClass();
                                    C19660411w2.LIZJ(context5, strValueOf2, "live_server", false);
                                }
                            });
                        }
                    }
                    this.LL.LIZ();
                    C19660511w3.LIZ = null;
                    C19660511w3.LIZIZ = null;
                    C19660511w3.LIZJ = null;
                    C19660511w3.LIZLLL = null;
                    C19660511w3.LJ = null;
                    C19660511w3.LJFF = null;
                    C19660511w3.LJI = null;
                    C19660511w3.LJII = "";
                    InterfaceC19661111w9 interfaceC19661111w9 = this.LL.LLJJIJIL;
                    if (interfaceC19661111w9 == null) {
                        return;
                    }
                    interfaceC19661111w9.LJII();
                    return;
                }
                if (id == R.id.j2n) {
                    C19660211w0 c19660211w05 = this.LL;
                    View view3 = c19660211w05.LLIZ;
                    if (view3 == null) {
                        return;
                    }
                    C786410Ut5.LJLLLLLL(8, view3);
                    InterfaceC19661111w9 interfaceC19661111w92 = c19660211w05.LLJJIJIL;
                    if (interfaceC19661111w92 == null) {
                        return;
                    }
                    interfaceC19661111w92.LIZIZ();
                    return;
                }
                if (id == R.id.jzi) {
                    C505201xy c505201xy = C505201xy.LIZ;
                    C19660411w2 c19660411w22 = C19660411w2.LIZ;
                    c19660411w22.getClass();
                    String str5 = C19660411w2.LJ;
                    C19660211w0 c19660211w06 = this.LL;
                    Long l2 = c19660211w06.LLILZIL;
                    String str6 = c19660211w06.LLILLL;
                    String str7 = c19660211w06.LLILLJJLI;
                    c505201xy.getClass();
                    C505201xy.LIZJ(false, false, false, "", str5, "close", "", "", l2, str6, str7);
                    C19660211w0 c19660211w07 = this.LL;
                    c19660211w07.getClass();
                    c19660411w22.getClass();
                    C19660411w2.LIZ();
                    C19660511w3.LIZ = null;
                    C19660511w3.LIZIZ = null;
                    C19660511w3.LIZJ = null;
                    C19660511w3.LIZLLL = null;
                    C19660511w3.LJ = null;
                    C19660511w3.LJFF = null;
                    C19660511w3.LJI = null;
                    C19660511w3.LJII = "";
                    c19660211w07.LIZ();
                    InterfaceC19661111w9 interfaceC19661111w93 = this.LL.LLJJIJIL;
                    if (interfaceC19661111w93 == null) {
                        return;
                    }
                    interfaceC19661111w93.LJII();
                    return;
                }
                C505201xy c505201xy2 = C505201xy.LIZ;
                C19660411w2 c19660411w23 = C19660411w2.LIZ;
                c19660411w23.getClass();
                String str8 = C19660411w2.LJ;
                C19660211w0 c19660211w08 = this.LL;
                Long l3 = c19660211w08.LLILZIL;
                String str9 = c19660211w08.LLILLL;
                String str10 = c19660211w08.LLILLJJLI;
                c505201xy2.getClass();
                C505201xy.LIZJ(false, false, false, "", str8, "close", "", "", l3, str9, str10);
                C19660211w0 c19660211w09 = this.LL;
                c19660211w09.getClass();
                c19660411w23.getClass();
                C19660411w2.LIZ();
                C19660511w3.LIZ = null;
                C19660511w3.LIZIZ = null;
                C19660511w3.LIZJ = null;
                C19660511w3.LIZLLL = null;
                C19660511w3.LJ = null;
                C19660511w3.LJFF = null;
                C19660511w3.LJI = null;
                C19660511w3.LJII = "";
                c19660211w09.LIZ();
                InterfaceC19661111w9 interfaceC19661111w94 = this.LL.LLJJIJIL;
                if (interfaceC19661111w94 == null) {
                    return;
                }
                interfaceC19661111w94.LJII();
            }
        }
    };

    public final void LIZ() {
        View view = this.LLIZLLLIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLIZ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        View view3 = this.LLJ;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
        C19409110wb c19409110wb = this.LLJJJ;
        if (c19409110wb != null) {
            c19409110wb.notifyDataSetChanged();
        }
        View view4 = this.LLJILJILJ;
        if (view4 != null) {
            view4.setEnabled(true);
        }
        TuxIconView tuxIconView = this.LLJJ;
        if (tuxIconView != null) {
            tuxIconView.setEnabled(true);
        }
        View view5 = this.LLJILJILJ;
        if (view5 != null) {
            C786410Ut5.LJLLLLLL(8, view5);
        }
        TuxTextView tuxTextView = this.LLJILLL;
        if (tuxTextView != null) {
            tuxTextView.setText("");
        }
        this.LLJJI = "";
        C197039127h c197039127h = this.LLJJIII;
        if (c197039127h != null) {
            c197039127h.setEnabled(false);
            c197039127h.setClickable(false);
            c197039127h.setButtonVariant(2);
        }
        TuxTextView tuxTextView2 = this.LLJJIJI;
        if (tuxTextView2 != null) {
            tuxTextView2.setEnabled(true);
        }
    }

    @Override // X.C11GG
    public final void LIZIZ(String str) {
        TuxTextView tuxTextView = this.LLJILLL;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
        if (str == null) {
            str = "";
        }
        this.LLJJI = str;
    }
}
