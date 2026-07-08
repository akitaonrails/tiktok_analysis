package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundChipsModel;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfoKt;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.AwS681S0100000_32;
import lth.o;

/* JADX INFO: renamed from: X.190M, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C190M extends C193N<C05YF, C190H, C10J1> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final int LLJJIJI;
    public final C05YF LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public final Function0<C190H> LLJILJILJ;
    public final C10J1 LLJILLL;
    public final InterfaceC1738600vLO LLJJ;
    public final C10J3 LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C190M.class, "extensionAdapterApiComponent", "getExtensionAdapterApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/adapter/PublishExtensionAdapterApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C190M.class, "permissionOptionApiComponent", "getPermissionOptionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/permission/PermissionOptionApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C190M.class, "compatibleFragment", "getCompatibleFragment()Landroidx/fragment/app/Fragment;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C190M.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C190M.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJJIJI = 8;
    }

    private final Fragment P4() {
        return (Fragment) this.LLJI.getValue(this, LLJJIII[2]);
    }

    private final InterfaceC855150Xgf k5() {
        return (InterfaceC855150Xgf) this.LLJ.getValue(this, LLJJIII[1]);
    }

    @Override // X.C193N
    public AnonymousClass1931<?, C190H, C10J1> F4() {
        return new AnonymousClass1931<C21147717pL, C190H, C10J1>() { // from class: X.190B
            @Override // X.AnonymousClass1931
            public final AbstractC1738640vLS LJ(Context context, ViewGroup viewGroup) {
                C21147717pL c21147717pL = new C21147717pL(C786410Ut5.Td(C786410Ut5.ne(context), R.layout.d72, viewGroup, false));
                c21147717pL.LLILLJJLI.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
                return c21147717pL;
            }

            @Override // X.AnonymousClass1931
            public final void LIZLLL(AbstractC1738640vLS abstractC1738640vLS, C193X c193x, C1664690tQB c1664690tQB, Object obj) {
                C21147717pL c21147717pL = (C21147717pL) abstractC1738640vLS;
                C214743192f.LIZ.getClass();
                C214743192f.LIZ(this, c21147717pL, c193x, c1664690tQB, (C10J1) obj);
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.190D
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return Integer.valueOf(((C190H) obj2).LIZJ);
                    }
                }), c21147717pL, Lifecycle.State.STARTED, new AwS611S0100000_32(c21147717pL, 161));
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.190F
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return ((C190H) obj2).LIZLLL;
                    }
                }), c21147717pL, Lifecycle.State.STARTED, new AwS611S0100000_32(c21147717pL, 162));
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.190E
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return Integer.valueOf(((C190H) obj2).LJ);
                    }
                }), c21147717pL, Lifecycle.State.STARTED, new AwS611S0100000_32(c21147717pL, 163));
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.190G
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return ((C190H) obj2).LJFF;
                    }
                }), c21147717pL, Lifecycle.State.STARTED, new AwS601S0100000_22(new AwS611S0100000_32(c21147717pL, 164), (Function1<? super Map<Integer, String>, Unit>) 190));
            }
        };
    }

    public final InterfaceC855570XhL T4() {
        return (InterfaceC855570XhL) this.LLIZLLLIL.getValue(this, LLJJIII[0]);
    }

    public final C19EG Z4() {
        return (C19EG) this.LLJIJIL.getValue(this, LLJJIII[3]);
    }

    public final VideoPublishEditModel d5() {
        return (VideoPublishEditModel) this.LLJILJIL.getValue(this, LLJJIII[4]);
    }

    public final void t5() {
        if (!o.LJIIZILJ.isLogin()) {
            o.LJIIZILJ.LJIILJJIL(P4(), "", "", new InterfaceC19305710fv() { // from class: X.190O
                @Override // X.InterfaceC19305710fv
                public final void onCancel() {
                }

                @Override // X.InterfaceC19305710fv
                public final void onSuccess() {
                    this.LIZ.T4().ZT0();
                }
            });
            return;
        }
        C0LAB c0lab = new C0LAB();
        C580270MpN.LIZJ(d5(), c0lab, "video_post_page");
        c0lab.LJ("enter_from", "video_post_page");
        C20684815ws.LJIILLIIL("click_video_tag", c0lab.LIZ);
        C190N c190n = C190N.LIZIZ;
        if (c190n.LIZIZ() >= 3) {
            c190n.LIZLLL(Z4(), "video_post_page", k5().hu0(), d5().getTagUserList(), new AwS681S0100000_32(this, 6));
        } else {
            c190n.LJ(Z4(), "video_post_page", k5().hu0(), d5().getTagUserList(), new C1466770oGx(this, 0));
        }
    }

    public final void K4() {
        ArrayList<InteractionTagUserInfo> tagUserList = d5().getTagUserList();
        if (tagUserList != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(tagUserList, 10));
            Iterator<InteractionTagUserInfo> it2 = tagUserList.iterator();
            while (it2.hasNext()) {
                arrayList.add(InteractionTagInfoKt.toMutualUser(it2.next()));
            }
            if (!arrayList.isEmpty()) {
                i3(new AwS611S0100000_32(arrayList, (List<AIPlaygroundChipsModel>) 160));
                return;
            }
        }
        i3(AFwS278S0000000_32.get$arr$(91));
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
        k5().JN2().LJIIIZ(this, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 192));
        K4();
        C190N c190n = C190N.LIZIZ;
        if (c190n.LIZIZ() < 2) {
            c190n.LJFF(Z4(), new AwS576S0100000_32(this, 313));
        }
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

    public C10J1 O4() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public C05YF getApiComponent() {
        return this.LLIZ;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C190H> o2() {
        return this.LLJILJILJ;
    }

    public C190M(C1DRG c1drg) {
        super(c1drg);
        this.LLIZ = this;
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC855570XhL.class, null);
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC855150Xgf.class, null);
        this.LLJI = C1664770tQJ.LIZ(getDiContainer(), Fragment.class, null);
        this.LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJILJILJ = AFwS223S0000000_32.get$arr$(98);
        this.LLJILLL = new C10J1(new AwS611S0100000_32(this, 159), null);
        this.LLJJ = EnumC214771193h.TAG_PEOPLE;
        this.LLJJI = AnonymousClass1937.LIZ;
    }

    public final void n5(List<InteractionTagUserInfo> list, boolean z, boolean z2) {
        ArrayList<InteractionTagUserInfo> arrayList;
        if (z2 && z) {
            VideoPublishEditModel videoPublishEditModelD5 = d5();
            if (list instanceof ArrayList) {
                arrayList = (ArrayList) list;
            } else {
                arrayList = null;
            }
            videoPublishEditModelD5.setTagUserList(arrayList);
            K4();
        }
    }
}
