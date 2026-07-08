package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.draft.DraftMigrateState;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.model.SimpleEffect;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxNormalItemViewHolder;
import com.ss.android.ugc.effectmanager.effect.model.EffectLabel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0LpO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxNormalItemViewHolder$onBind$3$1", f = "DraftBoxNormalItemViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C554800LpO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ AwemeDraft LLILLJJLI;
    public final /* synthetic */ C0M0P LLILLL;
    public final /* synthetic */ DraftBoxNormalItemViewHolder LLILZ;
    public final /* synthetic */ DraftMigrateState LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C554800LpO(boolean z, AwemeDraft awemeDraft, C0M0P c0m0p, DraftBoxNormalItemViewHolder draftBoxNormalItemViewHolder, DraftMigrateState draftMigrateState, boolean z2, int i, InterfaceC1364105Vn<? super C554800LpO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = awemeDraft;
        this.LLILLL = c0m0p;
        this.LLILZ = draftBoxNormalItemViewHolder;
        this.LLILZIL = draftMigrateState;
        this.LLILZLL = z2;
        this.LLIZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C554800LpO(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String name;
        String str;
        String resourceId;
        List listLJJLIIIJILLIZJL;
        ArrayList<TimeSpeedModelExtension> arrayListLJIIIIZZ;
        List<String> v2Tags;
        EffectLabel effectLabel;
        Context context;
        Resources resources;
        String string;
        Context context2;
        Resources resources2;
        String string2;
        Context context3;
        Resources resources3;
        C1C7U.LIZ("DraftBoxNormalItemViewHolder@feeb.onBind$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            C0M0H c0m0h = C0M0H.LIZ;
            AwemeDraft awemeDraft = this.LLILLJJLI;
            c0m0h.getClass();
            this.LLILLL.LJIJ = C2286608xc.LJ(C0M0H.LIZ(awemeDraft));
            this.LLILLL.LJJIFFI = C0M0H.LIZIZ(this.LLILLJJLI);
            C561130Lzb c561130LzbR5 = this.LLILZ.R5();
            C0M0P c0m0p = this.LLILLL;
            c561130LzbR5.LIZIZ(c0m0p.LJ, c0m0p);
        }
        String strLJJLIIIJ = null;
        if (((Boolean) this.LLILZ.LLJZIJLIL.getValue()).booleanValue()) {
            DraftBoxNormalItemViewHolder draftBoxNormalItemViewHolder = this.LLILZ;
            DraftMigrateState draftMigrateState = this.LLILZIL;
            draftBoxNormalItemViewHolder.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DraftBoxNormalItemViewHolder, bindMigrateIcon, ");
            sbLIZ.append(draftMigrateState);
            C0M7M.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            int i = C0M33.LIZ[draftMigrateState.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        TuxIconView tuxIconViewI6 = draftBoxNormalItemViewHolder.i6();
                        if (tuxIconViewI6 != null) {
                            tuxIconViewI6.setIconRes(R.drawable.c60);
                        }
                        TuxIconView tuxIconViewI62 = draftBoxNormalItemViewHolder.i6();
                        if (tuxIconViewI62 != null) {
                            tuxIconViewI62.setTintColorRes(R.attr.ee);
                        }
                        TuxIconView tuxIconViewI63 = draftBoxNormalItemViewHolder.i6();
                        if (tuxIconViewI63 != null) {
                            C786410Ut5.LLLLLLZZ(tuxIconViewI63, 8);
                        }
                        TuxTextView tuxTextViewQ6 = draftBoxNormalItemViewHolder.q6();
                        if (tuxTextViewQ6 != null) {
                            TuxTextView tuxTextViewQ62 = draftBoxNormalItemViewHolder.q6();
                            if (tuxTextViewQ62 != null && (context3 = tuxTextViewQ62.getContext()) != null && (resources3 = context3.getResources()) != null) {
                                string2 = resources3.getString(2131836954);
                            } else {
                                string2 = null;
                            }
                            tuxTextViewQ6.setText(string2);
                        }
                        View viewH6 = draftBoxNormalItemViewHolder.h6();
                        if (viewH6 != null) {
                            C786410Ut5.LJLLLLLL(0, viewH6);
                        }
                        View viewH62 = draftBoxNormalItemViewHolder.h6();
                        if (viewH62 != null) {
                            viewH62.setBackground(null);
                        }
                    }
                } else {
                    TuxIconView tuxIconViewI64 = draftBoxNormalItemViewHolder.i6();
                    if (tuxIconViewI64 != null) {
                        tuxIconViewI64.setIconRes(R.drawable.c60);
                    }
                    TuxIconView tuxIconViewI65 = draftBoxNormalItemViewHolder.i6();
                    if (tuxIconViewI65 != null) {
                        tuxIconViewI65.setTintColorRes(R.attr.ee);
                    }
                    TuxIconView tuxIconViewI66 = draftBoxNormalItemViewHolder.i6();
                    if (tuxIconViewI66 != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconViewI66, 0);
                    }
                    TuxTextView tuxTextViewQ63 = draftBoxNormalItemViewHolder.q6();
                    if (tuxTextViewQ63 != null) {
                        TuxTextView tuxTextViewQ64 = draftBoxNormalItemViewHolder.q6();
                        if (tuxTextViewQ64 != null && (context2 = tuxTextViewQ64.getContext()) != null && (resources2 = context2.getResources()) != null) {
                            string = resources2.getString(2131836953);
                        } else {
                            string = null;
                        }
                        tuxTextViewQ63.setText(string);
                    }
                    View viewH63 = draftBoxNormalItemViewHolder.h6();
                    if (viewH63 != null) {
                        C786410Ut5.LJLLLLLL(0, viewH63);
                    }
                    View viewH64 = draftBoxNormalItemViewHolder.h6();
                    if (viewH64 != null) {
                        viewH64.setBackground(null);
                    }
                }
            } else {
                TuxIconView tuxIconViewI67 = draftBoxNormalItemViewHolder.i6();
                if (tuxIconViewI67 != null) {
                    tuxIconViewI67.setIconRes(R.drawable.c5z);
                }
                TuxIconView tuxIconViewI68 = draftBoxNormalItemViewHolder.i6();
                if (tuxIconViewI68 != null) {
                    tuxIconViewI68.setTintColorRes(R.attr.a1v);
                }
                TuxIconView tuxIconViewI69 = draftBoxNormalItemViewHolder.i6();
                if (tuxIconViewI69 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconViewI69, 0);
                }
                TuxTextView tuxTextViewQ65 = draftBoxNormalItemViewHolder.q6();
                if (tuxTextViewQ65 != null) {
                    TuxTextView tuxTextViewQ66 = draftBoxNormalItemViewHolder.q6();
                    if (tuxTextViewQ66 != null && (context = tuxTextViewQ66.getContext()) != null && (resources = context.getResources()) != null) {
                        strLJJLIIIJ = resources.getString(2131836952);
                    }
                    tuxTextViewQ65.setText(strLJJLIIIJ);
                }
                View viewH65 = draftBoxNormalItemViewHolder.h6();
                if (viewH65 != null) {
                    C786410Ut5.LJLLLLLL(0, viewH65);
                }
                View viewH66 = draftBoxNormalItemViewHolder.h6();
                if (viewH66 != null) {
                    viewH66.setBackgroundResource(R.drawable.bim);
                }
            }
            View viewH67 = this.LLILZ.h6();
            if (viewH67 != null) {
                C786410Ut5.LJLLLLLL(0, viewH67);
            }
            C786410Ut5.LJLLLLLL(8, this.LLILZ.f6());
            View view = (View) this.LLILZ.LLJJJIL.getValue();
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            this.LLILLL.LJIJ = C2286608xc.LJ(0);
            this.LLILLL.LJJIFFI = false;
            View viewH68 = this.LLILZ.h6();
            if (viewH68 != null) {
                viewH68.setTag(R.id.g57, true);
            }
            this.LLILLL.LJJI = true;
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DraftBoxNormalItemViewHolder@feeb.onBind$3$1");
            return unit;
        }
        this.LLILLL.LJJI = false;
        View viewH69 = this.LLILZ.h6();
        if (viewH69 != null) {
            viewH69.setTag(R.id.g57, false);
        }
        View viewH610 = this.LLILZ.h6();
        if (viewH610 != null) {
            C786410Ut5.LJLLLLLL(8, viewH610);
        }
        if (this.LLILZLL) {
            AVMusic aVMusic = this.LLILLJJLI.LJ;
            if (aVMusic != null) {
                C0M0P c0m0p2 = this.LLILLL;
                c0m0p2.LJII = C562270M3l.LJFF(this.LLILZ.getItemView().getContext(), aVMusic);
                c0m0p2.LJJ = true;
            }
            AIGCOfflineModel aIGCOfflineModel = this.LLILLJJLI.LIZ.aigcOfflineModel;
            if (Intrinsics.LJFF(aIGCOfflineModel.subAiPropType, "v2v") && !aIGCOfflineModel.isOfflineAIGCEffectGenerated) {
                z = true;
            } else {
                z = false;
            }
            String str2 = "";
            if (z) {
                C0M0P c0m0p3 = this.LLILLL;
                c0m0p3.LJIJJLI = "";
                c0m0p3.LJIJI = "";
                c0m0p3.LJIJJ = "";
            }
            AIGCOfflineModel aIGCOfflineModel2 = this.LLILLJJLI.LIZ.aigcOfflineModel;
            SettingsManager.LIZLLL().getClass();
            if (aIGCOfflineModel2.LIZIZ(SettingsManager.LIZ("aigc_draft_ai_label_check_enabled_killswitch", true))) {
                C0M0P c0m0p4 = this.LLILLL;
                AIGCOfflineModel aIGCOfflineModel3 = this.LLILLJJLI.LIZ.aigcOfflineModel;
                c0m0p4.LJIJJLI = aIGCOfflineModel3.propName;
                c0m0p4.LJIJI = aIGCOfflineModel3.propId;
                c0m0p4.LJIJJ = aIGCOfflineModel3.resourceId;
            } else {
                C0M0P c0m0p5 = this.LLILLL;
                SimpleEffect simpleEffect = this.LLILLJJLI.LIZ.recordEffectModel.effectInfo;
                if (simpleEffect == null || (name = simpleEffect.getName()) == null) {
                    name = "";
                }
                c0m0p5.LJIJJLI = name;
                C0M0P c0m0p6 = this.LLILLL;
                String str3 = this.LLILLJJLI.LJJIJIIJIL;
                if (str3 == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str3, new String[]{","}, 0, 6)) == null || (str = (String) C13LP.LJJJLL(listLJJLIIIJILLIZJL)) == null) {
                    str = "";
                }
                c0m0p6.LJIJI = str;
                C0M0P c0m0p7 = this.LLILLL;
                SimpleEffect simpleEffect2 = this.LLILLJJLI.LIZ.recordEffectModel.effectInfo;
                if (simpleEffect2 != null && (resourceId = simpleEffect2.getResourceId()) != null) {
                    str2 = resourceId;
                }
                c0m0p7.LJIJJ = str2;
            }
            CreativeModel creativeModel = this.LLILLJJLI.LIZ;
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = creativeModel.editModel.multiEditVideoStatusRecordData;
            if (multiEditVideoStatusRecordData != null && C0IKQ.LIZIZ(multiEditVideoStatusRecordData.editCutSegments)) {
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = creativeModel.editModel.multiEditVideoStatusRecordData;
                if (multiEditVideoStatusRecordData2 != null) {
                    arrayListLJIIIIZZ = multiEditVideoStatusRecordData2.editCutSegments;
                } else {
                    arrayListLJIIIIZZ = null;
                }
            } else {
                arrayListLJIIIIZZ = CameraComponentModel.LJIIIIZZ(creativeModel.recordData.videoSegmentsDesc);
            }
            C0M0P c0m0p8 = this.LLILLL;
            if (arrayListLJIIIIZZ != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<TimeSpeedModelExtension> it2 = arrayListLJIIIIZZ.iterator();
                while (it2.hasNext()) {
                    StickerInfo stickerInfo = it2.next().getStickerInfo();
                    if (stickerInfo == null || (effectLabel = stickerInfo.getEffectLabel()) == null || (v2Tags = effectLabel.getV2Tags()) == null) {
                        v2Tags = C13BV.INSTANCE;
                    }
                    C19719612Di.LJJI(v2Tags, arrayList);
                }
                strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
            }
            c0m0p8.LJIL = strLJJLIIIJ;
            C561130Lzb c561130LzbR52 = this.LLILZ.R5();
            C0M0P c0m0p9 = this.LLILLL;
            c561130LzbR52.LIZIZ(c0m0p9.LJ, c0m0p9);
        }
        if (Intrinsics.LJFF(this.LLILZ.f6().getTag(R.id.g56), this.LLILLJJLI.LIZ())) {
            if (this.LL) {
                this.LLILZ.e6(this.LLILLL);
            }
            if (this.LLILZLL) {
                this.LLILZ.c6(this.LLIZ, this.LLILLL);
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxNormalItemViewHolder@feeb.onBind$3$1");
        return unit2;
    }
}
