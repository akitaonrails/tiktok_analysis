package X;

import Y.AObserverS229S0100000_27;
import Y.ARunnableS72S0200000_3;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.UploadImageParam;
import ge.i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS39S0001000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0yHe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1851600yHe extends i<InterfaceC1851500yHU, C1851510yHV, C1851530yHX, C1851570yHb> implements InterfaceC379610EuV, InterfaceC1851500yHU {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public static final int LLJJL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final C19EG LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final Map<AIGenerationType, C1851610yHf> LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final MutableLiveData<List<UploadImageParam>> LLJJJIL;
    public final Function0<C1851530yHX> LLJJJJ;
    public final Function0<C1851570yHb> LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1851600yHe.class, "aiPlaygroundHeaderApi", "getAiPlaygroundHeaderApi()Lcom/ss/android/ugc/aweme/aigc/aiplayground/panel/component/AIPlaygroundHeaderApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1851600yHe.class, "aiPlaygroundPromptApi", "getAiPlaygroundPromptApi()Lcom/ss/android/ugc/aweme/aigc/aiplayground/panel/component/AIPlaygroundPromptApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1851600yHe.class, "aiPlaygroundGenerateApi", "getAiPlaygroundGenerateApi()Lcom/ss/android/ugc/aweme/aigc/aiplayground/panel/component/AIPlaygroundGenerateApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1851600yHe.class, "aiPlaygroundSettingsApi", "getAiPlaygroundSettingsApi()Lcom/ss/android/ugc/aweme/aigc/aiplayground/panel/component/AIPlaygroundSettingsApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1851600yHe.class, "creativeModel", "getCreativeModel()Lcom/ss/android/ugc/aweme/creative/model/CreativeModel;", 0);
        c09r3.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJJL = 8;
    }

    private final InterfaceC1851490yHT O4() {
        return (InterfaceC1851490yHT) this.LLJJIJI.getValue(this, LLJJJJLIIL[2]);
    }

    private final InterfaceC1851410yHL P4() {
        return (InterfaceC1851410yHL) this.LLJJI.getValue(this, LLJJJJLIIL[0]);
    }

    private final InterfaceC1851400yHK T4() {
        return (InterfaceC1851400yHK) this.LLJJIII.getValue(this, LLJJJJLIIL[1]);
    }

    private final InterfaceC1851450yHP Z4() {
        return (InterfaceC1851450yHP) this.LLJJIJIIJIL.getValue(this, LLJJJJLIIL[3]);
    }

    private final CreativeModel d5() {
        return (CreativeModel) this.LLJJJ.getValue(this, LLJJJJLIIL[4]);
    }

    @Override // X.InterfaceC1851500yHU
    public List<UploadImageParam> Do1() {
        ArrayList arrayList = new ArrayList();
        UploadImageParam uploadImageParam = T2().LIZIZ;
        if (uploadImageParam != null && uploadImageParam.path.length() > 0) {
            arrayList.add(uploadImageParam);
        }
        UploadImageParam uploadImageParam2 = T2().LIZJ;
        if (uploadImageParam2 != null && uploadImageParam2.path.length() > 0) {
            arrayList.add(uploadImageParam2);
        }
        return arrayList;
    }

    public final void K4() {
        i3(AFwS269S0000000_27.get$arr$(44));
    }

    @Override // X.InterfaceC1851500yHU
    public void LLLIL() {
        this.LLJJIJIL.clear();
        K4();
        n5();
    }

    private final void n5() {
        C12WG.LIZJ(this.LLJILJILJ, new ARunnableS72S0200000_3(this, Do1(), 8));
    }

    private final void nD1() {
        MutableLiveData<C1838890xx9> mutableLiveDataOP2;
        MutableLiveData<AIGenerationType> mutableLiveDataII1;
        InterfaceC1851410yHL interfaceC1851410yHLP4 = P4();
        if (interfaceC1851410yHLP4 != null && (mutableLiveDataII1 = interfaceC1851410yHLP4.iI1()) != null) {
            mutableLiveDataII1.observe(this, new AObserverS229S0100000_27(this, 24));
        }
        InterfaceC1851400yHK interfaceC1851400yHKT4 = T4();
        if (interfaceC1851400yHKT4 == null || (mutableLiveDataOP2 = interfaceC1851400yHKT4.oP2()) == null) {
            return;
        }
        mutableLiveDataOP2.observe(this, new AObserverS229S0100000_27(this, 25));
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        nD1();
    }

    public final void v5() {
        UploadImageParam uploadImageParam = T2().LIZIZ;
        if (uploadImageParam == null) {
            uploadImageParam = new UploadImageParam("", -1, -1, false);
        }
        UploadImageParam uploadImageParam2 = T2().LIZJ;
        if (uploadImageParam2 == null) {
            uploadImageParam2 = new UploadImageParam("", -1, -1, false);
        }
        this.LLJJIJIL.put(T2().LIZ, new C1851610yHf(uploadImageParam, uploadImageParam2));
    }

    @Override // X.InterfaceC1851500yHU
    public MutableLiveData<List<UploadImageParam>> Tf1() {
        return this.LLJJJIL;
    }

    public final C19EG getActivity() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1851530yHX> o2() {
        return this.LLJJJJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1851570yHb> w2() {
        return this.LLJJJJJIL;
    }

    private final int H4(int i) {
        String str;
        String str2;
        String str3;
        String str4;
        i3(new AwS39S0001000_27(i, 2));
        if (i == EnumC1779930wQ3.FIRST.getIndex()) {
            if (T2().LIZ == AIGenerationType.IMAGE_TO_VIDEO) {
                return 1;
            }
            if (T2().LIZ != AIGenerationType.AI_TRANSITION) {
                return 0;
            }
            UploadImageParam uploadImageParam = T2().LIZIZ;
            if (uploadImageParam != null && (str3 = uploadImageParam.path) != null && str3.length() != 0) {
                UploadImageParam uploadImageParam2 = T2().LIZJ;
                if (uploadImageParam2 != null && (str4 = uploadImageParam2.path) != null && str4.length() != 0) {
                    return 1;
                }
            } else {
                UploadImageParam uploadImageParam3 = T2().LIZJ;
                if (uploadImageParam3 == null || (str2 = uploadImageParam3.path) == null || str2.length() == 0) {
                    return 2;
                }
                return 1;
            }
            return 2;
        }
        UploadImageParam uploadImageParam4 = T2().LIZIZ;
        if (uploadImageParam4 != null && (str = uploadImageParam4.path) != null && str.length() != 0) {
            T2();
            return 1;
        }
        T2();
        return 2;
    }

    private final void k5(int i) {
        String str;
        String str2;
        String str3;
        if (T2().LIZ == AIGenerationType.IMAGE_TO_VIDEO) {
            UploadImageParam uploadImageParam = T2().LIZIZ;
            if (uploadImageParam != null && (str3 = uploadImageParam.path) != null && str3.length() != 0) {
                InterfaceC1851490yHT interfaceC1851490yHTO4 = O4();
                if (interfaceC1851490yHTO4 != null) {
                    interfaceC1851490yHTO4.cS0("click_change_your_image");
                    return;
                }
                return;
            }
            InterfaceC1851490yHT interfaceC1851490yHTO42 = O4();
            if (interfaceC1851490yHTO42 == null) {
                return;
            }
            interfaceC1851490yHTO42.cS0("click_add_your_image");
            return;
        }
        if (T2().LIZ != AIGenerationType.AI_TRANSITION) {
            return;
        }
        if (i == EnumC1779930wQ3.FIRST.getIndex()) {
            UploadImageParam uploadImageParam2 = T2().LIZIZ;
            if (uploadImageParam2 != null && (str2 = uploadImageParam2.path) != null && str2.length() != 0) {
                InterfaceC1851490yHT interfaceC1851490yHTO43 = O4();
                if (interfaceC1851490yHTO43 == null) {
                    return;
                }
                interfaceC1851490yHTO43.cS0("click_change_first_frame");
                return;
            }
            InterfaceC1851490yHT interfaceC1851490yHTO44 = O4();
            if (interfaceC1851490yHTO44 == null) {
                return;
            }
            interfaceC1851490yHTO44.cS0("click_add_first_frame");
            return;
        }
        if (i != EnumC1779930wQ3.SECOND.getIndex()) {
            return;
        }
        UploadImageParam uploadImageParam3 = T2().LIZJ;
        if (uploadImageParam3 != null && (str = uploadImageParam3.path) != null && str.length() != 0) {
            InterfaceC1851490yHT interfaceC1851490yHTO45 = O4();
            if (interfaceC1851490yHTO45 == null) {
                return;
            }
            interfaceC1851490yHTO45.cS0("click_change_end_frame");
            return;
        }
        InterfaceC1851490yHT interfaceC1851490yHTO46 = O4();
        if (interfaceC1851490yHTO46 == null) {
            return;
        }
        interfaceC1851490yHTO46.cS0("click_add_end_frame");
    }

    public final void C5(int i) {
        String str;
        C19EG c19eg = this.LLJJ;
        int iH4 = H4(i);
        AIGenerationType aIGenerationType = T2().LIZ;
        AIGenerationType aIGenerationType2 = AIGenerationType.IMAGE_TO_VIDEO;
        boolean z = false;
        if (aIGenerationType == aIGenerationType2 && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_enable_ai_video_i2v_album_camera_entrance", true, true) && C0EIT.LIZ()) {
            z = true;
        }
        k5(i);
        if (T2().LIZ == aIGenerationType2) {
            str = "ai_video_tool_i2v";
        } else {
            str = "ai_video_tool_ai_transition";
        }
        CreativeModel creativeModelD5 = d5();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("shoot_way", creativeModelD5.editorProAIGCInfoModel.aiPlaygroundCameraModel.shootWay, bundle);
        C786410Ut5.LJJJI("content_source", "shoot", bundle);
        C786410Ut5.LJJJI("content_type", "video", bundle);
        C786410Ut5.LJJJI("enter_from", "video_edit_page", bundle);
        C537520L6g.LJFF(bundle, creativeModelD5.creativeInfo);
        bundle.putInt("key_choose_scene", 61);
        if (iH4 == 1) {
            bundle.putInt("key_support_flag", 1);
            C786410Ut5.LJJJI("key_mv_hint_text", c19eg.getString(2131829714), bundle);
        } else {
            bundle.putInt("key_support_flag", 10);
            C786410Ut5.LJJJI("key_mv_hint_text", c19eg.getString(2131829713), bundle);
        }
        bundle.putInt("key_photo_select_min_count", 1);
        bundle.putInt("key_photo_select_max_count", iH4);
        bundle.putInt("key_set_column_count", 3);
        if (z) {
            bundle.putBoolean("key_show_ai_playground_photo_entrance", true);
        }
        C786410Ut5.LJJJI("key_ai_playground_enter_type", str, bundle);
        C1660680tJi.LIZ().LIZJ(c19eg, bundle, 10010, 10010);
    }

    @Override // X.InterfaceC1851500yHU
    public boolean LLLLILI(Bundle bundle) {
        boolean z = false;
        if (bundle != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("key_ai_playground_take_photo_bitmap");
            if (stringArrayList == null) {
                return false;
            }
            String str = (String) C13LP.LJJJLZIJ(0, stringArrayList);
            String str2 = "";
            if (str == null) {
                str = "";
            }
            z = true;
            String str3 = (String) C13LP.LJJJLZIJ(1, stringArrayList);
            if (str3 != null) {
                str2 = str3;
            }
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2263208tq(this, str, str2, stringArrayList.size(), null), 3);
        }
        return z;
    }

    public final void t5(AIGenerationType aIGenerationType) {
        C1851610yHf c1851610yHf = this.LLJJIJIL.get(aIGenerationType);
        if (c1851610yHf != null) {
            UploadImageParam uploadImageParam = c1851610yHf.LIZ;
            UploadImageParam uploadImageParam2 = c1851610yHf.LIZIZ;
            x5(uploadImageParam, EnumC1779930wQ3.FIRST.getIndex());
            x5(uploadImageParam2, EnumC1779930wQ3.SECOND.getIndex());
            n5();
        }
    }

    private final void x5(UploadImageParam uploadImageParam, int i) {
        if (i == EnumC1779930wQ3.FIRST.getIndex()) {
            i3(new AwS606S0100000_27(uploadImageParam, 89));
        } else {
            if (i != EnumC1779930wQ3.SECOND.getIndex()) {
                return;
            }
            i3(new AwS606S0100000_27(uploadImageParam, 90));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D5(java.lang.String r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.creative.model.editorpro.aigc.UploadImageParam> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C2263308tr
            if (r0 == 0) goto L64
            r5 = r8
            X.08tr r5 = (X.C2263308tr) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L64
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r4 = 0
            r2 = 1
            if (r0 == 0) goto L48
            if (r0 != r2) goto L6b
            java.lang.Object r7 = r5.LL
            java.lang.String r7 = (java.lang.String) r7
            X.C155000ia.LIZIZ(r1)
        L27:
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r0 = r1.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            java.lang.Object r0 = r1.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            if (r3 <= 0) goto L6a
            if (r2 <= 0) goto L6a
            com.ss.android.ugc.aweme.creative.model.editorpro.aigc.UploadImageParam r1 = new com.ss.android.ugc.aweme.creative.model.editorpro.aigc.UploadImageParam
            r0 = 0
            r1.<init>(r7, r3, r2, r0)
            return r1
        L48:
            X.C155000ia.LIZIZ(r1)
            int r0 = r7.length()
            if (r0 != 0) goto L52
            return r4
        L52:
            X.1DFB r1 = X.C0PEM.LIZJ
            X.08tp r0 = new X.08tp
            r0.<init>(r7, r4)
            r5.LL = r7
            r5.LLILZ = r2
            java.lang.Object r1 = X.C23250099c.LJI(r5, r1, r0)
            if (r1 != r3) goto L27
            return r3
        L64:
            X.08tr r5 = new X.08tr
            r5.<init>(r6, r8)
            goto L12
        L6a:
            return r4
        L6b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1851600yHe.D5(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1851500yHU
    public void KG(List<UploadImageParam> list, AIGenerationType aIGenerationType) {
        if (list.isEmpty()) {
            return;
        }
        int i = C389480FOw.LIZ[aIGenerationType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                UploadImageParam uploadImageParam = (UploadImageParam) C13LP.LJJJLZIJ(0, list);
                if (uploadImageParam != null && (!a0.LJJJIL(uploadImageParam.path))) {
                    x5(uploadImageParam, EnumC1779930wQ3.FIRST.getIndex());
                }
                UploadImageParam uploadImageParam2 = (UploadImageParam) C13LP.LJJJLZIJ(1, list);
                if (uploadImageParam2 != null && (!a0.LJJJIL(uploadImageParam2.path))) {
                    x5(uploadImageParam2, EnumC1779930wQ3.SECOND.getIndex());
                    return;
                }
                return;
            }
            return;
        }
        UploadImageParam uploadImageParam3 = (UploadImageParam) C13LP.LJJJLZIJ(0, list);
        if (uploadImageParam3 == null || !(!a0.LJJJIL(uploadImageParam3.path))) {
            return;
        }
        x5(uploadImageParam3, EnumC1779930wQ3.FIRST.getIndex());
    }

    @Override // X.InterfaceC1851500yHU
    public void e91(Boolean bool, Boolean bool2) {
        i3(new AwS393S0200000_27(bool, bool2, 28));
    }

    public C1851600yHe(C19A3 c19a3, C1DRG c1drg, C19EG c19eg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = c19eg;
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1851410yHL.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1851400yHK.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1851490yHT.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1851450yHP.class, null);
        this.LLJJIJIL = new LinkedHashMap();
        this.LLJJJ = C1664770tQJ.LIZ(getDiContainer(), CreativeModel.class, null);
        this.LLJJJIL = new MutableLiveData<>();
        this.LLJJJJ = AFwS216S0000000_27.get$arr$(90);
        this.LLJJJJJIL = new AwS571S0100000_27(this, 215);
    }

    public final void F4(UploadImageParam uploadImageParam, UploadImageParam uploadImageParam2, int i) {
        String str;
        String str2;
        String str3;
        Integer num = T2().LJ;
        if (num != null) {
            int iIntValue = num.intValue();
            boolean z = false;
            if (uploadImageParam == null || (str3 = uploadImageParam.path) == null || str3.length() == 0) {
                uploadImageParam = null;
            }
            if (uploadImageParam2 == null || (str2 = uploadImageParam2.path) == null || str2.length() == 0) {
                uploadImageParam2 = null;
            }
            if (uploadImageParam == null && uploadImageParam2 == null) {
                return;
            }
            UploadImageParam uploadImageParam3 = T2().LIZIZ;
            if (uploadImageParam3 == null || (str = uploadImageParam3.path) == null || str.length() == 0) {
                z = true;
            }
            EnumC1779930wQ3 enumC1779930wQ3 = EnumC1779930wQ3.FIRST;
            if (iIntValue == enumC1779930wQ3.getIndex()) {
                if (uploadImageParam != null) {
                    x5(uploadImageParam, enumC1779930wQ3.getIndex());
                }
                if (uploadImageParam2 != null) {
                    x5(uploadImageParam2, EnumC1779930wQ3.SECOND.getIndex());
                }
            } else {
                EnumC1779930wQ3 enumC1779930wQ32 = EnumC1779930wQ3.SECOND;
                if (iIntValue == enumC1779930wQ32.getIndex()) {
                    if (z) {
                        if (i == 2) {
                            if (uploadImageParam != null) {
                                x5(uploadImageParam, enumC1779930wQ3.getIndex());
                            }
                            if (uploadImageParam2 != null) {
                                x5(uploadImageParam2, enumC1779930wQ32.getIndex());
                            }
                        } else if (uploadImageParam != null) {
                            x5(uploadImageParam, enumC1779930wQ32.getIndex());
                        }
                    } else if (uploadImageParam != null) {
                        x5(uploadImageParam, enumC1779930wQ32.getIndex());
                    }
                }
            }
            n5();
        }
    }
}
