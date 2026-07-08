package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0vL9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1738450vL9 extends RecyclerView.ViewHolder implements InterfaceC1738440vL8 {
    public final EffectDraftSubmissionListViewModel LL;
    public final Context LLILLJJLI;
    public Map<String, String> LLILLL;
    public C2211008lQ LLILZ;
    public final C0HZQ LLILZIL;
    public final TuxTextView LLILZLL;
    public final C424560Gko LLIZ;
    public final TuxIconView LLIZLLLIL;

    public final void LIZIZ() {
        this.LL.LLILLJJLI.setValue(new C1738590vLN<>(Unit.LIZ));
        C2211008lQ c2211008lQ = this.LLILZ;
        if ((c2211008lQ == null ? null : c2211008lQ).LIZ == EnumC2159908dB.DRAFT_EFFECT) {
            UploadableDraftEffect uploadableDraftEffect = (c2211008lQ == null ? null : c2211008lQ).LIZJ;
            if (uploadableDraftEffect != null && !uploadableDraftEffect.enableSubmission) {
                View view = this.itemView;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(R.string.effect_tool_alert_exceed7M);
                C1390380mHk.LIZLLL(view, 1011, creativeToastBuilder);
                I5("DISABLED");
                return;
            }
        }
        if ((c2211008lQ == null ? null : c2211008lQ).LIZ == EnumC2159908dB.MOBILE_EFFECT) {
            if (c2211008lQ == null) {
                c2211008lQ = null;
            }
            UploadableMobileEffect uploadableMobileEffect = c2211008lQ.LIZLLL;
            if (uploadableMobileEffect != null && !uploadableMobileEffect.enableSubmission) {
                View view2 = this.itemView;
                CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                creativeToastBuilder2.messageRes(R.string.effect_tool_alert_exceed7M);
                C1390380mHk.LIZLLL(view2, 1011, creativeToastBuilder2);
                I5("DISABLED");
                return;
            }
        }
        if (this.LLILZIL.isChecked()) {
            EffectDraftSubmissionListViewModel effectDraftSubmissionListViewModel = this.LL;
            effectDraftSubmissionListViewModel.LLILZ--;
        } else {
            EffectDraftSubmissionListViewModel effectDraftSubmissionListViewModel2 = this.LL;
            int i = effectDraftSubmissionListViewModel2.LLILZ;
            if (i >= 10) {
                View view3 = this.itemView;
                CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
                creativeToastBuilder3.messageRes(2131826527);
                C1390380mHk.LIZLLL(view3, 1011, creativeToastBuilder3);
                I5("OFF");
                return;
            }
            effectDraftSubmissionListViewModel2.LLILZ = i + 1;
        }
        C2211008lQ c2211008lQ2 = this.LLILZ;
        (c2211008lQ2 != null ? c2211008lQ2 : null).LIZIZ = this.LLILZIL.isChecked();
        if (this.LLILZIL.isChecked()) {
            I5("ON");
        } else {
            I5("OFF");
        }
    }

    public final void I5(String str) {
        Map<String, String> map = this.LLILLL;
        if (map == null) {
            map = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("button_state", str);
        C1737910vKH.LIZ("post_page_draft_effect_click", linkedHashMap);
    }

    public final void L5(C2211008lQ c2211008lQ) {
        if (c2211008lQ.LIZ == EnumC2159908dB.DRAFT_EFFECT && c2211008lQ.LIZJ != null) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("template_id", "");
            c0lab.LJ("template_name", "");
            c0lab.LJ("effect_id", c2211008lQ.LIZJ.effectId);
            c0lab.LJ("effect_name", c2211008lQ.LIZJ.effectName);
            c0lab.LJ("enter_from", "video_post_page");
            C20684815ws.LJIILLIIL("mobile_effect_edit_entrance", c0lab.LIZ);
        }
        if (c2211008lQ.LIZ == EnumC2159908dB.MOBILE_EFFECT && c2211008lQ.LIZLLL != null) {
            C0LAB c0lab2 = new C0LAB();
            c0lab2.LJ("template_id", c2211008lQ.LIZLLL.templateResourceId);
            c0lab2.LJ("template_name", c2211008lQ.LIZLLL.effectName);
            c0lab2.LJ("effect_id", c2211008lQ.LIZLLL.effectId);
            c0lab2.LJ("effect_name", c2211008lQ.LIZLLL.effectName);
            c0lab2.LJ("enter_from", "video_post_page");
            C20684815ws.LJIILLIIL("mobile_effect_edit_entrance", c0lab2.LIZ);
        }
        DialogC1738430vL7 dialogC1738430vL7 = new DialogC1738430vL7(this.LLILLJJLI, c2211008lQ, this, this.LL);
        dialogC1738430vL7.setContentView(R.layout.by3);
        dialogC1738430vL7.show();
        C785410UrT.LIZIZ(dialogC1738430vL7);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJ(dialogC1738430vL7);
        C816490W1f.LIZ(dialogC1738430vL7);
    }

    @Override // X.InterfaceC1738440vL8
    public final void a0(String str, String str2) {
        C2211008lQ c2211008lQ;
        C2211008lQ c2211008lQ2;
        C2211008lQ c2211008lQ3;
        C2211008lQ c2211008lQ4;
        String str3;
        C2211008lQ c2211008lQ5;
        C2211008lQ c2211008lQ6;
        String str4;
        C2211008lQ c2211008lQ7 = this.LLILZ;
        String str5 = null;
        if (c2211008lQ7 == null) {
            c2211008lQ = null;
        } else {
            c2211008lQ = c2211008lQ7;
        }
        if (c2211008lQ.LIZ == EnumC2159908dB.DRAFT_EFFECT) {
            if (c2211008lQ7 == null) {
                c2211008lQ5 = null;
            } else {
                c2211008lQ5 = c2211008lQ7;
            }
            if (c2211008lQ5.LIZJ != null) {
                if (c2211008lQ7 == null) {
                    c2211008lQ6 = null;
                } else {
                    c2211008lQ6 = c2211008lQ7;
                }
                UploadableDraftEffect uploadableDraftEffect = c2211008lQ6.LIZJ;
                if (uploadableDraftEffect != null) {
                    uploadableDraftEffect.effectName = str;
                }
                TuxTextView tuxTextView = this.LLILZLL;
                if (c2211008lQ7 == null) {
                    c2211008lQ7 = null;
                }
                UploadableDraftEffect uploadableDraftEffect2 = c2211008lQ7.LIZJ;
                if (uploadableDraftEffect2 != null) {
                    str4 = uploadableDraftEffect2.effectName;
                } else {
                    str4 = null;
                }
                tuxTextView.setText(str4);
                EffectDraftSubmissionListViewModel effectDraftSubmissionListViewModel = this.LL;
                C2211008lQ c2211008lQ8 = this.LLILZ;
                if (c2211008lQ8 == null) {
                    c2211008lQ8 = null;
                }
                UploadableDraftEffect uploadableDraftEffect3 = c2211008lQ8.LIZJ;
                C424560Gko c424560Gko = this.LLIZ;
                effectDraftSubmissionListViewModel.getClass();
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(effectDraftSubmissionListViewModel), null, null, new C2210808lO(effectDraftSubmissionListViewModel, uploadableDraftEffect3, str2, c424560Gko, null), 3);
            }
        }
        C2211008lQ c2211008lQ9 = this.LLILZ;
        if (c2211008lQ9 == null) {
            c2211008lQ2 = null;
        } else {
            c2211008lQ2 = c2211008lQ9;
        }
        if (c2211008lQ2.LIZ == EnumC2159908dB.MOBILE_EFFECT) {
            if (c2211008lQ9 == null) {
                c2211008lQ3 = null;
            } else {
                c2211008lQ3 = c2211008lQ9;
            }
            if (c2211008lQ3.LIZLLL != null) {
                if (c2211008lQ9 == null) {
                    c2211008lQ4 = null;
                } else {
                    c2211008lQ4 = c2211008lQ9;
                }
                UploadableMobileEffect uploadableMobileEffect = c2211008lQ4.LIZLLL;
                if (uploadableMobileEffect != null) {
                    uploadableMobileEffect.effectName = str;
                }
                TuxTextView tuxTextView2 = this.LLILZLL;
                if (c2211008lQ9 == null) {
                    c2211008lQ9 = null;
                }
                UploadableMobileEffect uploadableMobileEffect2 = c2211008lQ9.LIZLLL;
                if (uploadableMobileEffect2 != null) {
                    str3 = uploadableMobileEffect2.effectName;
                } else {
                    str3 = null;
                }
                tuxTextView2.setText(str3);
                EffectDraftSubmissionListViewModel effectDraftSubmissionListViewModel2 = this.LL;
                C2211008lQ c2211008lQ10 = this.LLILZ;
                if (c2211008lQ10 == null) {
                    c2211008lQ10 = null;
                }
                UploadableMobileEffect uploadableMobileEffect3 = c2211008lQ10.LIZLLL;
                C424560Gko c424560Gko2 = this.LLIZ;
                effectDraftSubmissionListViewModel2.getClass();
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(effectDraftSubmissionListViewModel2), null, null, new C2210708lN(effectDraftSubmissionListViewModel2, uploadableMobileEffect3, str2, c424560Gko2, null), 3);
                C2211008lQ c2211008lQ11 = this.LLILZ;
                if (c2211008lQ11 == null) {
                    c2211008lQ11 = null;
                }
                UploadableMobileEffect uploadableMobileEffect4 = c2211008lQ11.LIZLLL;
                if (uploadableMobileEffect4 != null) {
                    uploadableMobileEffect4.iconFilePath = str2;
                }
                C2211008lQ c2211008lQ12 = this.LLILZ;
                if (c2211008lQ12 == null) {
                    c2211008lQ12 = null;
                }
                UploadableMobileEffect uploadableMobileEffect5 = c2211008lQ12.LIZLLL;
                if (uploadableMobileEffect5 != null) {
                    str5 = uploadableMobileEffect5.iconFilePath;
                }
                C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(new C0VSJ(str5));
                c1331670kl3LJII.LJJ = EnumC1338240kve.FIT_CENTER;
                c1331670kl3LJII.LJJ(this.LLIZ);
                C786410Ut5.h3(c1331670kl3LJII);
            }
        }
    }

    public C1738450vL9(EffectDraftSubmissionListViewModel effectDraftSubmissionListViewModel, View view, Context context) {
        super(view);
        this.LL = effectDraftSubmissionListViewModel;
        this.LLILLJJLI = context;
        this.LLILZIL = (C0HZQ) view.findViewById(R.id.g7g);
        this.LLILZLL = (TuxTextView) view.findViewById(R.id.g7k);
        this.LLIZ = (C424560Gko) view.findViewById(R.id.g7i);
        this.LLIZLLLIL = (TuxIconView) view.findViewById(R.id.g7h);
    }
}
