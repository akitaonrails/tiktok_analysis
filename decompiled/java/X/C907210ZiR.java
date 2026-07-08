package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.keva.Keva;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.pugc.PUgcSlotData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS29S0010000_14;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.0ZiR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C907210ZiR extends C193N<InterfaceC907240ZiU, C907220ZiS, C10J1> implements InterfaceC907240ZiU {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final int LLJJIJI;
    public final C19A3 LLIZ;
    public boolean LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public final C01GW LLJILJIL;
    public final Function0<C907220ZiS> LLJILJILJ;
    public final C10J1 LLJILLL;
    public final InterfaceC1738600vLO LLJJ;
    public final C10J3 LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C907210ZiR.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C907210ZiR.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C907210ZiR.class, "extensionAdapterApiComponent", "getExtensionAdapterApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/adapter/PublishExtensionAdapterApiComponent;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJJIJI = 8;
    }

    private final C19EG P4() {
        return (C19EG) this.LLJI.getValue(this, LLJJIII[1]);
    }

    private final List<PUgcSlotData> Z4() {
        return (List) this.LLJILJIL.getValue();
    }

    @Override // X.C193N
    public AnonymousClass1931<?, C907220ZiS, C10J1> F4() {
        return new AnonymousClass1931<AnonymousClass1903, C907220ZiS, C10J1>() { // from class: X.190C
            @Override // X.AnonymousClass1931
            public final AbstractC1738640vLS LJ(Context context, ViewGroup viewGroup) {
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setId(R.id.riz);
                C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -2));
                View view = new View(context);
                view.setId(R.id.rj0);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a09, context);
                if (numLIZJ != null) {
                    view.setBackgroundColor(numLIZJ.intValue());
                }
                C786410Ut5.LJLLLLLL(8, view);
                frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
                C127K c127k = new C127K(context, null, 6);
                c127k.setId(R.id.rj1);
                c127k.setAccessory(new C11G4(context, null));
                frameLayout.addView(c127k, new ViewGroup.LayoutParams(-1, context.getResources().getDimensionPixelSize(R.dimen.ad3)));
                return new AnonymousClass1903(frameLayout);
            }

            @Override // X.AnonymousClass1931
            public final void LIZLLL(AbstractC1738640vLS abstractC1738640vLS, C193X c193x, C1664690tQB c1664690tQB, Object obj) {
                AnonymousClass1903 anonymousClass1903 = (AnonymousClass1903) abstractC1738640vLS;
                C214743192f.LIZ.getClass();
                C214743192f.LIZ(this, anonymousClass1903, c193x, c1664690tQB, (C10J1) obj);
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.0ZiT
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return ((C907220ZiS) obj2).LJ;
                    }
                }), anonymousClass1903, Lifecycle.State.STARTED, new AwS601S0100000_22(new AwS611S0100000_32(anonymousClass1903, 165), (Function1<? super Map<Integer, String>, Unit>) 190));
            }
        };
    }

    public final InterfaceC855570XhL O4() {
        return (InterfaceC855570XhL) this.LLJIJIL.getValue(this, LLJJIII[2]);
    }

    public final VideoPublishEditModel T4() {
        return (VideoPublishEditModel) this.LLJ.getValue(this, LLJJIII[0]);
    }

    public final void d5() {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", T4().getCreationId());
        c0lab.LJ("enter_from", "video_post_page");
        c0lab.LJ("shoot_way", T4().mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(T4()));
        C20684815ws.LJIILLIIL("click_post_template_entrance", c0lab.LIZ);
        if (C376910Eq9.LIZ(T4(), C859340XnQ.LIZ(T4())) && (T4().isPrivate == 0)) {
            C15QK c15qk = new C15QK();
            VideoPublishEditModel videoPublishEditModelT4 = T4();
            boolean z = T4().creativeModel.pugcTemplateData.canPostTemplate;
            List<PUgcSlotData> listZ4 = Z4();
            c15qk.LLJJ = videoPublishEditModelT4;
            c15qk.LLJJI = false;
            c15qk.LLJJIII = z;
            c15qk.LLJJIJIL = listZ4;
            c15qk.LLJJIJI = null;
            c15qk.LLJJJ = new C15QI() { // from class: X.0XrN
                @Override // X.C15QI
                public final void LIZLLL(ArrayList<String> arrayList, ArrayList<Integer> arrayList2) {
                }

                @Override // X.C15QI
                public final void goBack() {
                }

                @Override // X.C15QI
                public final void LIZIZ() {
                    this.LIZ.O4().SY1();
                }

                @Override // X.C15QI
                public final void LJ(boolean z2) {
                    String str;
                    if (this.LIZ.T4().creativeModel.pugcTemplateData.canPostTemplate && !z2) {
                        this.LIZ.LLIZLLLIL = false;
                    }
                    this.LIZ.T4().creativeModel.pugcTemplateData.canPostTemplate = z2;
                    this.LIZ.i3(new AwS29S0010000_14(z2, 5));
                    C0LAB c0lab2 = new C0LAB();
                    c0lab2.LJ("creation_id", this.LIZ.T4().getCreationId());
                    c0lab2.LJ("enter_from", "video_post_page");
                    if (z2) {
                        str = "on";
                    } else {
                        str = "off";
                    }
                    c0lab2.LJ("to_status", str);
                    c0lab2.LJ("shoot_way", this.LIZ.T4().mShootWay);
                    c0lab2.LJ("is_pugc_template", "1");
                    c0lab2.LJ("content_source", C1428470nHB.LJIILIIL(this.LIZ.T4()));
                    C20684815ws.LJIILLIIL("click_post_template", c0lab2.LIZ);
                }

                @Override // X.C15QI
                public final void LIZJ(ArrayList<String> arrayList, ArrayList<Integer> arrayList2) {
                    this.LIZ.T4().creativeModel.pugcTemplateData.fixedSlots = arrayList;
                    this.LIZ.T4().creativeModel.pugcTemplateData.fixedSlotIndex = arrayList2;
                    LIZIZ();
                }

                @Override // X.C15QI
                public final void LIZ(int i, String str, boolean z2) {
                    String str2;
                    String str3 = "1";
                    if (this.LIZ.T4().creativeModel.pugcTemplateData.isFromCreateTemplate) {
                        str2 = "1";
                    } else {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    C0LAB c0lab2 = new C0LAB();
                    c0lab2.LJ("is_from_create_template", str2);
                    c0lab2.LJ("creation_id", this.LIZ.T4().getCreationId());
                    c0lab2.LJ("enter_from", "video_post_page");
                    if (z2) {
                        str3 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c0lab2.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str3);
                    c0lab2.LJ("shoot_way", this.LIZ.T4().mShootWay);
                    c0lab2.LIZ(i, "rank");
                    c0lab2.LJ("duration", str);
                    c0lab2.LJ("content_source", C1428470nHB.LJIILIIL(this.LIZ.T4()));
                    C20684815ws.LJIILLIIL("choose_replaceable_content", c0lab2.LIZ);
                }
            };
            NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this.LLIZ);
            if (navigationSceneLIZ != null) {
                C569760MWg c569760MWg = new C569760MWg();
                c569760MWg.LIZJ = new C190U();
                navigationSceneLIZ.LLLLLLLLLL(c15qk, c569760MWg.LIZ());
                return;
            }
            return;
        }
        C350280DoI c350280DoI = C350280DoI.LIZ;
        C19EG c19egP4 = P4();
        VideoPublishEditModel videoPublishEditModelT42 = T4();
        c350280DoI.getClass();
        if (videoPublishEditModelT42 != null) {
            C1397620mTQ c1397620mTQ = new C1397620mTQ(c19egP4);
            c1397620mTQ.LJFF(2131821918, null);
            C1397580mTM c1397580mTM = new C1397580mTM(c19egP4);
            c1397580mTM.LJI(c19egP4.getString(2131822785));
            c1397580mTM.LIZIZ(c19egP4.getString(2131822784, ""));
            c1397580mTM.LJIIL = c1397620mTQ;
            C1397720mTa.LIZ(c1397580mTM, c19egP4.getString(2131821919), new AwS597S0100000_18(c19egP4, 563));
            new C1397510mTF(c1397580mTM).LIZLLL();
            C0LAB c0lab2 = new C0LAB();
            c0lab2.LJ("creation_id", videoPublishEditModelT42.getCreationId());
            c0lab2.LJ("enter_from", "video_post_page");
            c0lab2.LJ("shoot_way", videoPublishEditModelT42.mShootWay);
            c0lab2.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModelT42));
            c0lab2.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModelT42));
            C20684815ws.LJIILLIIL("create_ugc_template_fail_popup_show", c0lab2.LIZ);
        }
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
        if (T4().isPrivate != 0) {
            T4().creativeModel.pugcTemplateData.canPostTemplate = false;
        }
        if (!C376910Eq9.LIZ(T4(), C859340XnQ.LIZ(T4()))) {
            T4().creativeModel.pugcTemplateData.canPostTemplate = false;
        }
        i3(new AwS593S0100000_14(this, 146));
        if (Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getBoolean("has_show_pugc_cell_highlight", false)) {
            return;
        }
        i3(AFwS248S0000000_14.get$arr$(325));
        if (Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getBoolean("has_show_pugc_cell_highlight", false)) {
            return;
        }
        Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").storeBoolean("has_show_pugc_cell_highlight", true);
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJILLL;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJJ;
    }

    @Override // X.C193N
    public C10J3 H4() {
        return this.LLJJI;
    }

    public C10J1 K4() {
        return this.LLJILLL;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C907220ZiS> o2() {
        return this.LLJILJILJ;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.CharSequence] */
    @Override // X.InterfaceC907240ZiU
    public void gm2(boolean z) {
        boolean z2 = T4().creativeModel.pugcTemplateData.canPostTemplate;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = T2().LIZLLL;
        if (z) {
            if (this.LLIZLLLIL) {
                T4().creativeModel.pugcTemplateData.canPostTemplate = true;
                c259800zU.element = "On";
                this.LLIZLLLIL = false;
            }
        } else {
            if (z2) {
                this.LLIZLLLIL = true;
            }
            T4().creativeModel.pugcTemplateData.canPostTemplate = false;
            c259800zU.element = "Off";
        }
        i3(new AwS380S0200000_14(this, (C907210ZiR) c259800zU, (C259800zU<CharSequence>) 69));
        O4().SY1();
    }

    public C907210ZiR(C1DRG c1drg, C19A3 c19a3) {
        super(c1drg);
        this.LLIZ = c19a3;
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJI = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC855570XhL.class, null);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1105));
        this.LLJILJILJ = new AwS558S0100000_14(this, 1104);
        this.LLJILLL = new C10J1(new AwS593S0100000_14(this, 145), null);
        this.LLJJ = EnumC214771193h.PUGC_TEMPLATE;
        this.LLJJI = AnonymousClass1938.LIZ;
    }
}
