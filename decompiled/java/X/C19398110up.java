package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.global.config.settings.pojo.ContentLanguageGuideSetting;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.10up, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19398110up extends AbstractC21673619ry<C19398010uo> {
    public final InterfaceC19397910un LLILLJJLI;
    public final String LLILLL;
    public final List<ContentLanguageGuideSetting> LL = C0CLW.LIZIZ.LIZ.getContentLanguageGuideCodes();
    public final ArrayList<String> LLILZ = new ArrayList<>();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C19398110up(String str, InterfaceC19397910un interfaceC19397910un) {
        this.LLILLJJLI = interfaceC19397910un;
        this.LLILLL = str;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [REQUEST, X.0kbR] */
    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        final C19398010uo c19398010uo = (C19398010uo) viewHolder;
        final ContentLanguageGuideSetting contentLanguageGuideSetting = (ContentLanguageGuideSetting) ListProtector.get(this.LL, i);
        try {
            ((TextView) c19398010uo.LL.getValue()).setText(contentLanguageGuideSetting.getLocalName());
            ((TextView) c19398010uo.LLILLJJLI.getValue()).setText(contentLanguageGuideSetting.getEnName());
            if (TextUtils.isEmpty(contentLanguageGuideSetting.getIcon())) {
                C1324840ka2.LIZ(c19398010uo.I5(), 2130971789);
            } else {
                ?? LIZ = C1325700kbQ.LIZLLL(UriProtector.parse(contentLanguageGuideSetting.getIcon())).LIZ();
                C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                c1320810kTXLIZJ.LJIILJJIL = c19398010uo.I5().getController();
                c1320810kTXLIZJ.LIZLLL = LIZ;
                c1320810kTXLIZJ.LJIIIIZZ = new C12Z3(contentLanguageGuideSetting, this, 1);
                c19398010uo.I5().setController(c1320810kTXLIZJ.LIZ());
            }
            c19398010uo.itemView.setOnTouchListener(new AbstractViewOnTouchListenerC19382810sM() { // from class: X.10um
                @Override // X.AbstractViewOnTouchListenerC19382810sM
                public final Animator LIZ(View view) {
                    View viewFindViewById;
                    if (view != null) {
                        viewFindViewById = view.findViewById(R.id.mcd);
                    } else {
                        viewFindViewById = null;
                    }
                    ObjectAnimator objectAnimatorOfArgb = ObjectAnimator.ofArgb(viewFindViewById, "backgroundColor", 0, view.getResources().getColor(R.color.aj));
                    objectAnimatorOfArgb.setDuration(150L);
                    return objectAnimatorOfArgb;
                }

                @Override // X.AbstractViewOnTouchListenerC19382810sM
                public final Animator LIZJ(View view) {
                    View viewFindViewById;
                    if (view != null) {
                        viewFindViewById = view.findViewById(R.id.mcd);
                    } else {
                        viewFindViewById = null;
                    }
                    ObjectAnimator objectAnimatorOfArgb = ObjectAnimator.ofArgb(viewFindViewById, "backgroundColor", view.getResources().getColor(R.color.aj), 0);
                    objectAnimatorOfArgb.setDuration(150L);
                    return objectAnimatorOfArgb;
                }

                @Override // X.AbstractViewOnTouchListenerC19382810sM
                public final void LIZIZ(MotionEvent motionEvent, View view) {
                    int iLJ;
                    C19398110up c19398110up = this.LL;
                    C19398010uo c19398010uo2 = c19398010uo;
                    ContentLanguageGuideSetting contentLanguageGuideSetting2 = contentLanguageGuideSetting;
                    c19398110up.getClass();
                    try {
                        if (!c19398110up.LLILZ.contains(contentLanguageGuideSetting2.getCode())) {
                            int size = c19398110up.LLILZ.size();
                            int iLJ2 = 5;
                            try {
                                SettingsManager.LIZLLL().getClass();
                                iLJ = SettingsManager.LJ("content_lang_limit", 5);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                iLJ = 5;
                            }
                            if (size >= iLJ) {
                                Context context = c19398010uo2.itemView.getContext();
                                Object[] objArr = new Object[1];
                                try {
                                    SettingsManager.LIZLLL().getClass();
                                    iLJ2 = SettingsManager.LJ("content_lang_limit", 5);
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                }
                                objArr[0] = String.valueOf(iLJ2);
                                String string = context.getString(2131835443, objArr);
                                C1389890mGx c1389890mGx = new C1389890mGx(c19398010uo2.itemView);
                                c1389890mGx.LJIIJ(string);
                                c1389890mGx.LJIIJJI();
                                return;
                            }
                        }
                        if (c19398110up.LLILZ.contains(contentLanguageGuideSetting2.getCode())) {
                            c19398110up.LLILZ.remove(contentLanguageGuideSetting2.getCode());
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("enter_from", c19398110up.LLILLL);
                            c2344009Gk.LJIIIIZZ("language_type", contentLanguageGuideSetting2.getCode());
                            c2344009Gk.LJIIIIZZ("click_type", "unchoose");
                            C20684815ws.LJIILLIIL("click_content_language_popup", c2344009Gk.LIZ);
                        } else {
                            c19398110up.LLILZ.add(contentLanguageGuideSetting2.getCode());
                            C2344009Gk c2344009Gk2 = new C2344009Gk();
                            c2344009Gk2.LJIIIIZZ("enter_from", c19398110up.LLILLL);
                            c2344009Gk2.LJIIIIZZ("language_type", contentLanguageGuideSetting2.getCode());
                            c2344009Gk2.LJIIIIZZ("click_type", "choose");
                            C20684815ws.LJIILLIIL("click_content_language_popup", c2344009Gk2.LIZ);
                        }
                        c19398110up.LLILLJJLI.LJJLIIIJJIZ(contentLanguageGuideSetting2.getCode());
                        c19398010uo2.L5();
                    } catch (C316660CbA e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            });
            ((View) c19398010uo.LLILZIL.getValue()).setTag(contentLanguageGuideSetting.getHighlightColor());
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19398010uo c19398010uo = new C19398010uo(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cv7, viewGroup, false));
        try {
            View view = c19398010uo.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c19398010uo.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c19398010uo.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C19398010uo.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c19398010uo.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c19398010uo.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C19398010uo.class.getName();
        return c19398010uo;
    }
}
