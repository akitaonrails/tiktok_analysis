package X;

import Y.AObserverS208S0100000_4;
import Y.AObserverS212S0100000_8;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.asynctask.workflowbuilder.AIGCArchWorkflowInput;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.Text2ImageModel;
import com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.texttoimage.choose.Text2ImageAIChooseCell;
import com.ss.android.ugc.aweme.texttoimage.choose.Text2ImageChooseCell;
import com.ss.android.ugc.aweme.texttoimage.choose.Text2ImageChooseListViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS53S0200000_8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS217S0300000_8;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Luq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C558180Luq extends Scene implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final C1DRG LLJI;
    public final boolean LLJIJIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJILLL;
    public TuxSkeletonLayout LLJJ;
    public LinearLayout LLJJI;
    public TuxTextView LLJJIII;
    public SmartImageView LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public TextSwitcher LLJJIJIL;
    public TuxTextView LLJJJ;
    public C1749280vcc LLJJJIL;
    public View LLJJJJ;
    public final C1664750tQH LLJJJJJIL;
    public final C1664750tQH LLJJJJLIIL;
    public final C1664740tQG LLJJL;
    public final C1664740tQG LLJJLIIIJLLLLLLLZ;
    public final C1664740tQG LLJL;
    public final C1664740tQG LLJLIL;
    public ConstraintLayout LLJLL;
    public long LLJLLIL;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 393));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(211));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(212));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 291));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C558180Luq.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C558180Luq.class, "previewComponentApi", "getPreviewComponentApi()Lcom/ss/android/ugc/aweme/texttoimage/choose/Text2ImageChoosePreviewComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C558180Luq.class, "titlebarApi", "getTitlebarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/TitlebarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C558180Luq.class, "editToolbar", "getEditToolbar()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C558180Luq.class, "musicApi", "getMusicApi()Lcom/ss/android/ugc/gamora/editor/lightening/music/LighteningMusicApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C558180Luq.class, "animationComponent", "getAnimationComponent()Lcom/ss/android/ugc/aweme/texttoimage/choose/Text2ImageAIGCAnimationApi;", 0);
        c09r3.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
    }

    public final InterfaceC558220Luu LLLIIIIL() {
        return (InterfaceC558220Luu) this.LLJLIL.getValue(this, LLJZ[5]);
    }

    public final InterfaceC1460000o62 LLLIILIL() {
        return (InterfaceC1460000o62) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLJZ[3]);
    }

    public final VideoPublishEditModel LLLIL() {
        return (VideoPublishEditModel) this.LLJJJJJIL.getValue(this, LLJZ[0]);
    }

    public final C572850MdP LLLILZ() {
        return (C572850MdP) this.LLJJJJLIIL.getValue(this, LLJZ[1]);
    }

    public final Text2ImageChooseListViewModel LLLILZLLLI() {
        return (Text2ImageChooseListViewModel) this.LLJILJIL.getValue();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public final void LLLLII(VideoPublishEditModel videoPublishEditModel) {
        if (C07CI.LIZ() == 0) {
            return;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0LIB(videoPublishEditModel, null), 3);
    }

    public final void LLLLIILL(boolean z) {
        int i;
        int i2;
        TuxTextView tuxTextView = this.LLJJIJIIJIL;
        int i3 = 0;
        if (tuxTextView != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, tuxTextView);
        }
        TuxTextView tuxTextView2 = this.LLJJJ;
        if (tuxTextView2 != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, tuxTextView2);
        }
        TextSwitcher textSwitcher = this.LLJJIJIL;
        if (textSwitcher != null) {
            if (!z) {
                i3 = 8;
            }
            C786410Ut5.LJLLLLLL(i3, textSwitcher);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!LLLIL().creativeModel.text2ImageModel.directToChoose) {
            SmartImageView smartImageView = this.LLJJIJI;
            if (smartImageView != null) {
                smartImageView.setPlaceholderImage((Drawable) null);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJILLL;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                viewOnAttachStateChangeListenerC20604515jv.LJIIL((AbstractC329610Cw3) this.LLJLLL.getValue());
            }
        } else {
            TuxSkeletonLayout tuxSkeletonLayout = this.LLJJ;
            if (tuxSkeletonLayout != null) {
                tuxSkeletonLayout.setLoading(true);
            }
            InterfaceC1413540mt6 interfaceC1413540mt6 = (InterfaceC1413540mt6) this.LLJL.getValue(this, LLJZ[4]);
            if (interfaceC1413540mt6 != null) {
                interfaceC1413540mt6.lA(false);
            }
            LLLILZ().ly0().observe(this, new AObserverS212S0100000_8(this, 44));
            LLLILZ().DJ1(true);
        }
        LLLILZ().au2().observe(this, new AObserverS208S0100000_4(this, 5));
        LLLILZLLLI().LLILZ.observe(this, new AObserverS212S0100000_8(this, 45));
        InterfaceC1457610o2B interfaceC1457610o2B = (InterfaceC1457610o2B) this.LLJJL.getValue(this, LLJZ[2]);
        if (interfaceC1457610o2B != null) {
            interfaceC1457610o2B.In0(this, new AwS587S0100000_8(this, 296));
        }
        C786410Ut5.x3(this.mView.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC581000MqY(this, 2));
    }

    public C558180Luq(C1DRG c1drg, boolean z) {
        this.LLJI = c1drg;
        this.LLJIJIL = z;
        this.LLJJJJJIL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZ(c1drg, C572850MdP.class, null);
        this.LLJJL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1457600o2A.class, null);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1460000o62.class, null);
        this.LLJL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1413540mt6.class, null);
        this.LLJLIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC558220Luu.class, null);
    }

    public final void LLLJL(String str, String str2) {
        String str3;
        String string;
        if (str2 == null) {
            return;
        }
        TextImageTaskInfo textImageTaskInfoLIZIZ = C572250McR.LIZIZ(LLLIL().creativeModel.text2ImageModel, str2);
        Integer numValueOf = null;
        if (textImageTaskInfoLIZIZ != null) {
            textImageTaskInfoLIZIZ.setUri(null);
        }
        TextImageTaskInfo textImageTaskInfoLIZIZ2 = C572250McR.LIZIZ(LLLIL().creativeModel.text2ImageModel, str2);
        if (textImageTaskInfoLIZIZ2 != null) {
            textImageTaskInfoLIZIZ2.setFailReason(null);
        }
        CreativeInfo creativeInfo = LLLIL().getCreativeInfo();
        String str4 = "";
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        Source source = Source.TEXT_TO_IMAGE;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("create_time", String.valueOf(new Date().getTime()));
        String str5 = LLLIL().creativeModel.text2ImageModel.text;
        if (str5 == null || (string = a0.LJLIIIL(str5).toString()) == null) {
            string = "";
        }
        linkedHashMap.put("text_content", string);
        String enterFrom = LLLIL().getEnterFrom();
        if (enterFrom == null) {
            enterFrom = "";
        }
        linkedHashMap.put("enter_from", enterFrom);
        linkedHashMap.put("content_source", C1428470nHB.LJIILIIL(LLLIL()));
        String str6 = LLLIL().mShootWay;
        if (str6 != null) {
            str4 = str6;
        }
        linkedHashMap.put("shoot_way", str4);
        linkedHashMap.put("entrance", LLLIL().creativeModel.text2ImageModel.entrance);
        linkedHashMap.put("template_id", String.valueOf(C572250McR.LJ(LLLIL().creativeModel.text2ImageModel)));
        linkedHashMap.put("is_retry", "true");
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0LUQ(this, new AIGCArchWorkflowInput(null, creativeInfo, null, source, "text_to_image", "text_to_image", str3, "", null, 1, null, null, linkedHashMap, 1285, null), str2, str, null), 3);
        TextImageTaskInfo textImageTaskInfoLIZJ = C572250McR.LIZJ(LLLIL().creativeModel.text2ImageModel);
        if (textImageTaskInfoLIZJ != null) {
            Integer genCount = textImageTaskInfoLIZJ.getGenCount();
            if (genCount != null) {
                numValueOf = Integer.valueOf(genCount.intValue() + 1);
            }
            textImageTaskInfoLIZJ.setGenCount(numValueOf);
        }
    }

    public final void LLLLIIIILLL(boolean z, AbstractC558210Lut abstractC558210Lut) {
        String failReason;
        int i;
        Integer numValueOf;
        if (!z) {
            C1749280vcc c1749280vcc = this.LLJJJIL;
            if (c1749280vcc != null) {
                C786410Ut5.LJLLLLLL(8, c1749280vcc);
            }
            SmartImageView smartImageView = this.LLJJIJI;
            if (smartImageView != null) {
                C337180DJs.LIZJ(smartImageView);
                return;
            }
            return;
        }
        C013C c013c = new C013C();
        c013c.element = true;
        TextImageTaskInfo textImageTaskInfoLIZJ = C572250McR.LIZJ(LLLIL().creativeModel.text2ImageModel);
        if (textImageTaskInfoLIZJ != null) {
            failReason = textImageTaskInfoLIZJ.getFailReason();
        } else {
            failReason = null;
        }
        if (Intrinsics.LJFF(failReason, EnumC1841480y1K.NETWORK_ERROR.getType())) {
            i = 2131829438;
            numValueOf = Integer.valueOf(R.raw.icon_arrow_clockwise);
        } else {
            i = 2131821531;
            numValueOf = Integer.valueOf(R.raw.icon_arrow_clockwise);
        }
        LLLLIILL(false);
        C1749280vcc c1749280vcc2 = this.LLJJJIL;
        if (c1749280vcc2 != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            c1722300uv6.LJFF = 2131821532;
            c1722300uv6.LJII = i;
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = numValueOf.intValue();
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZIZ = c419910GdJ;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(32.4d)));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(35.6d)));
            c1722300uv6.LIZLLL = iLIZIZ;
            c1722300uv6.LJ = iLIZIZ2;
            c1722300uv6.LJIIJ = new AwS217S0300000_8(c013c, this, abstractC558210Lut, 24);
            c1749280vcc2.setStatus(c1722300uv6);
            C786410Ut5.LJLLLLLL(0, c1749280vcc2);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
            c1749280vcc2.setBackground(c384050F3z.LIZ(c1749280vcc2.getContext()));
            ((TuxTextView) c1749280vcc2.findViewById(R.id.y3j)).setTextColorRes(R.attr.a1j);
            ((TuxTextView) c1749280vcc2.findViewById(R.id.message_tv)).setTextColorRes(R.attr.a1p);
        }
        InterfaceC558220Luu interfaceC558220LuuLLLIIIIL = LLLIIIIL();
        if (interfaceC558220LuuLLLIIIIL != null) {
            interfaceC558220LuuLLLIIIIL.Uz();
        }
        SmartImageView smartImageView2 = this.LLJJIJI;
        if (smartImageView2 != null) {
            C786410Ut5.LJLLLLLL(4, smartImageView2);
        }
    }

    public final void LLLLILI(boolean z, Integer num) {
        boolean z2;
        String string;
        C1749280vcc c1749280vcc = this.LLJJJIL;
        if (c1749280vcc != null) {
            C786410Ut5.LJLLLLLL(8, c1749280vcc);
        }
        if (num != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && num.intValue() < 100) {
            LLLLIILL(true);
            InterfaceC1460000o62 interfaceC1460000o62LLLIILIL = LLLIILIL();
            if (interfaceC1460000o62LLLIILIL != null) {
                interfaceC1460000o62LLLIILIL.BJ(false);
            }
            TuxTextView tuxTextView = this.LLJJIJIIJIL;
            if (tuxTextView != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                Context sceneContext = getSceneContext();
                if (sceneContext != null) {
                    string = sceneContext.getString(2131821500);
                } else {
                    string = null;
                }
                sbLIZ.append(string);
                sbLIZ.append('%');
                tuxTextView.setText(C786410Ut5.j4(C2188811AlT.LIZIZ(sbLIZ), Arrays.copyOf(new Object[]{num.toString()}, 1)));
            }
            InterfaceC558220Luu interfaceC558220LuuLLLIIIIL = LLLIIIIL();
            if (interfaceC558220LuuLLLIIIIL != null) {
                interfaceC558220LuuLLLIIIIL.j3(num.intValue());
                return;
            }
            return;
        }
        LLLLIILL(false);
        if (z && (num == null || num.intValue() != 100)) {
            InterfaceC1460000o62 interfaceC1460000o62LLLIILIL2 = LLLIILIL();
            if (interfaceC1460000o62LLLIILIL2 != null) {
                interfaceC1460000o62LLLIILIL2.BJ(false);
            }
        } else {
            InterfaceC1460000o62 interfaceC1460000o62LLLIILIL3 = LLLIILIL();
            if (interfaceC1460000o62LLLIILIL3 != null) {
                interfaceC1460000o62LLLIILIL3.BJ(true);
            }
        }
        InterfaceC558220Luu interfaceC558220LuuLLLIIIIL2 = LLLIIIIL();
        if (interfaceC558220LuuLLLIIIIL2 == null) {
            return;
        }
        interfaceC558220LuuLLLIIIIL2.Uz();
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        String type;
        InterfaceC558220Luu interfaceC558220LuuLLLIIIIL;
        super.onViewCreated(view, bundle);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rr3);
        this.LLJILLL = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(Text2ImageChooseCell.class, Text2ImageAIChooseCell.class);
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C0DXR() { // from class: X.0Gha
                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    super.LIZIZ(rect, view2, recyclerView, c21673919s1);
                    Context context = view2.getContext();
                    if (context != null) {
                        if (recyclerView.getChildAdapterPosition(view2) == 0) {
                            if (C07CH.LIZIZ()) {
                                if (C423170GiZ.LIZ(context)) {
                                    rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(21));
                                    return;
                                } else {
                                    rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(21));
                                    return;
                                }
                            }
                            if (C423170GiZ.LIZ(context)) {
                                rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                                return;
                            } else {
                                rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                                return;
                            }
                        }
                        if (C07CH.LIZIZ()) {
                            if (C423170GiZ.LIZ(context)) {
                                rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                                return;
                            } else {
                                rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                                return;
                            }
                        }
                        if (C423170GiZ.LIZ(context)) {
                            rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                        } else {
                            rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                        }
                    }
                }
            });
            viewOnAttachStateChangeListenerC20604515jv.setOrientation(0);
            viewOnAttachStateChangeListenerC20604515jv.getState().LIZLLL = C0Q4Y.BUFFER;
            viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
        }
        this.LLJJIJI = (SmartImageView) view.findViewById(R.id.rqu);
        this.LLJJIJIIJIL = (TuxTextView) view.findViewById(R.id.s8j);
        this.LLJJIJIL = (TextSwitcher) view.findViewById(R.id.as0);
        this.LLJJJ = (TuxTextView) view.findViewById(R.id.aoj);
        this.LLJJJIL = (C1749280vcc) view.findViewById(R.id.w28);
        View viewFindViewById = view.findViewById(R.id.teg);
        this.LLJJJJ = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AkS53S0200000_8(this, view, 3), viewFindViewById);
        }
        this.LLJLL = (ConstraintLayout) view.findViewById(R.id.i4n);
        this.LLJJ = (TuxSkeletonLayout) view.findViewById(R.id.vg3);
        this.LLJJI = (LinearLayout) view.findViewById(R.id.nc5);
        this.LLJJIII = (TuxTextView) view.findViewById(R.id.tv_select_style);
        LLLILZLLLI().LLILLJJLI = LLLIL();
        InterfaceC558220Luu interfaceC558220LuuLLLIIIIL2 = LLLIIIIL();
        if (interfaceC558220LuuLLLIIIIL2 != null) {
            interfaceC558220LuuLLLIIIIL2.Ys(view);
        }
        TextImageTaskInfo textImageTaskInfoLIZJ = C572250McR.LIZJ(LLLIL().creativeModel.text2ImageModel);
        if (textImageTaskInfoLIZJ != null) {
            type = textImageTaskInfoLIZJ.getType();
        } else {
            type = null;
        }
        if (!Intrinsics.LJFF(type, C0LIV.AI.getType()) && (interfaceC558220LuuLLLIIIIL = LLLIIIIL()) != null) {
            interfaceC558220LuuLLLIIIIL.Uz();
        }
    }

    public final void LLLIZZ(Integer num, String str, String str2) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0LUP(this, str, str2, num, null), 3);
    }

    public final void LLLJ(String str, String str2, boolean z) {
        String str3;
        C1331670kl3 c1331670kl3LJIIIZ;
        int iIntValue;
        String type;
        String uri;
        Integer numLIZJ;
        this.LLJLLIL = System.currentTimeMillis();
        C572850MdP c572850MdPLLLILZ = LLLILZ();
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        c572850MdPLLLILZ.v92(str3);
        if (C1533950q1J.LJ(str)) {
            c1331670kl3LJIIIZ = C1331660kl2.LJI(C2471909mP.LJIILIIL(str));
        } else if (str2 == null || str2.length() <= 0) {
            return;
        } else {
            c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
        }
        c1331670kl3LJIIIZ.LJJIJL(getSceneContext());
        c1331670kl3LJIIIZ.LJJ(this.LLJJIJI);
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LIZIZ = C418440Gaw.LIZIZ(1);
        Context sceneContext = getSceneContext();
        if (sceneContext != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a03, sceneContext)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c1331750klB.LIZJ = iIntValue;
        c1331750klB.LJ = C418440Gaw.LIZIZ(24);
        c1331670kl3LJIIIZ.LJJI = new C1331730kl9(c1331750klB);
        if (C07CI.LIZIZ()) {
            TextImageTaskInfo textImageTaskInfoLIZJ = C572250McR.LIZJ(LLLIL().creativeModel.text2ImageModel);
            if (textImageTaskInfoLIZJ != null) {
                type = textImageTaskInfoLIZJ.getType();
            } else {
                type = null;
            }
            if (Intrinsics.LJFF(type, C0LIV.AI.getType()) && ((uri = textImageTaskInfoLIZJ.getUri()) == null || uri.length() == 0)) {
                C1331750klB c1331750klB2 = new C1331750klB();
                c1331750klB2.LJ = c1331670kl3LJIIIZ.LJJI.LJ;
                c1331670kl3LJIIIZ.LJJI = new C1331730kl9(c1331750klB2);
                c1331670kl3LJIIIZ.LJJIFFI = new C1332060klg(25, 3, 0);
                c1331670kl3LJIIIZ.LJIIIIZZ = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
                c1331670kl3LJIIIZ.LJIIIZ = 400;
            }
        }
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        if (!z) {
            LLLLII(LLLIL());
        }
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.erx, viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLLII(com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo r22, boolean r23, boolean r24, boolean r25, X.InterfaceC1364105Vn<? super X.C558190Lur> r26) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C558180Luq.LLLII(com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo, boolean, boolean, boolean, X.05Vn):java.lang.Object");
    }

    public static void LLLLIL(C558180Luq c558180Luq, String str, String str2, EnumC554770LpL enumC554770LpL, Integer num, String str3, Exception exc, String str4, int i) {
        C558190Lur c558190Lur;
        int iIntValue;
        CreativeModel creativeModel;
        Text2ImageModel text2ImageModel;
        List<TextImageTaskInfo> list;
        TextImageTaskInfo next;
        AbstractC558210Lut abstractC558210Lut;
        C20600815jK<InterfaceC1891350zJl> state;
        C558190Lur c558190Lur2;
        Integer num2;
        String str5;
        C558190Lur c558190Lur3;
        Integer num3;
        C558190Lur c558190Lur4;
        String message;
        CreativeModel creativeModel2;
        Text2ImageModel text2ImageModel2;
        List<TextImageTaskInfo> list2;
        TextImageTaskInfo next2;
        String str6 = str4;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            exc = null;
        }
        if ((i & 64) != 0) {
            str6 = null;
        }
        Text2ImageChooseListViewModel text2ImageChooseListViewModelLLLILZLLLI = c558180Luq.LLLILZLLLI();
        Iterator it2 = ((ArrayList) text2ImageChooseListViewModelLLLILZLLLI.LL).iterator();
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                AbstractC558210Lut abstractC558210Lut2 = (AbstractC558210Lut) it2.next();
                if ((abstractC558210Lut2 instanceof C558190Lur) && Intrinsics.LJFF(((C558190Lur) abstractC558210Lut2).LLJILJILJ, str)) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 < 0) {
            text2ImageChooseListViewModelLLLILZLLLI.wQ2();
            return;
        }
        Object obj = ListProtector.get(text2ImageChooseListViewModelLLLILZLLLI.LL, i2);
        if (!(obj instanceof C558190Lur) || (c558190Lur = (C558190Lur) obj) == null) {
            return;
        }
        Integer num4 = c558190Lur.LLJJ;
        if (num4 != null) {
            iIntValue = num4.intValue();
        } else {
            iIntValue = 0;
        }
        if (str6 != null) {
            c558190Lur.LLJILJILJ = str6;
        }
        c558190Lur.LLJJI = enumC554770LpL;
        int i3 = C554790LpN.LIZ[enumC554770LpL.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if ((num == null || iIntValue >= num.intValue()) && !C1533950q1J.LJ(str6)) {
                    i2 = -1;
                } else {
                    c558190Lur.LLJJ = num;
                    VideoPublishEditModel videoPublishEditModel = text2ImageChooseListViewModelLLLILZLLLI.LLILLJJLI;
                    if (videoPublishEditModel != null && (creativeModel2 = videoPublishEditModel.creativeModel) != null && (text2ImageModel2 = creativeModel2.text2ImageModel) != null && (list2 = text2ImageModel2.imageTaskList) != null) {
                        Iterator<TextImageTaskInfo> it3 = list2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next2 = it3.next();
                                if (Intrinsics.LJFF(next2.getAsyncTaskId(), str)) {
                                    break;
                                }
                            } else {
                                next2 = null;
                                break;
                            }
                        }
                        TextImageTaskInfo textImageTaskInfo = next2;
                        if (textImageTaskInfo != null) {
                            textImageTaskInfo.setProgress(num);
                            textImageTaskInfo.setUri(str3);
                        }
                    }
                }
            } else {
                c558190Lur.LLJJ = num;
                if (exc == null || (message = exc.getMessage()) == null) {
                    message = "";
                }
                c558190Lur.LLJJIJI = message;
            }
        } else {
            c558190Lur.LLJJ = num;
            c558190Lur.LLIZ = str3;
            VideoPublishEditModel videoPublishEditModel2 = text2ImageChooseListViewModelLLLILZLLLI.LLILLJJLI;
            if (videoPublishEditModel2 != null && (creativeModel = videoPublishEditModel2.creativeModel) != null && (text2ImageModel = creativeModel.text2ImageModel) != null && (list = text2ImageModel.imageTaskList) != null) {
                Iterator<TextImageTaskInfo> it4 = list.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next = it4.next();
                        if (Intrinsics.LJFF(next.getAsyncTaskId(), str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                TextImageTaskInfo textImageTaskInfo2 = next;
                if (textImageTaskInfo2 != null) {
                    textImageTaskInfo2.setProgress(num);
                    textImageTaskInfo2.setUri(str3);
                }
            }
        }
        text2ImageChooseListViewModelLLLILZLLLI.wQ2();
        if (i2 < 0) {
            return;
        }
        Text2ImageChooseListViewModel text2ImageChooseListViewModelLLLILZLLLI2 = c558180Luq.LLLILZLLLI();
        if (i2 >= ((ArrayList) text2ImageChooseListViewModelLLLILZLLLI2.LL).size() || (abstractC558210Lut = (AbstractC558210Lut) ListProtector.get(text2ImageChooseListViewModelLLLILZLLLI2.LL, i2)) == null) {
            return;
        }
        if (abstractC558210Lut.isSelected()) {
            int i4 = C554780LpM.LIZ[enumC554770LpL.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    c558180Luq.LLLLIIIILLL(true, abstractC558210Lut);
                    View view = c558180Luq.LLJJJJ;
                    if (view != null) {
                        C337180DJs.LIZ(view);
                    }
                } else {
                    boolean z = abstractC558210Lut instanceof C558190Lur;
                    if (z && (c558190Lur4 = (C558190Lur) abstractC558210Lut) != null) {
                        str5 = c558190Lur4.LLJILJIL;
                    } else {
                        str5 = null;
                    }
                    c558180Luq.LLLJ(str3, str5, false);
                    if (z && (c558190Lur3 = (C558190Lur) abstractC558210Lut) != null && (num3 = c558190Lur3.LLJJ) != null) {
                        num = num3;
                    }
                    c558180Luq.LLLLILI(true, num);
                    InterfaceC558220Luu interfaceC558220LuuLLLIIIIL = c558180Luq.LLLIIIIL();
                    if (interfaceC558220LuuLLLIIIIL != null) {
                        interfaceC558220LuuLLLIIIIL.Uz();
                    }
                    View view2 = c558180Luq.LLJJJJ;
                    if (view2 != null) {
                        C337180DJs.LIZJ(view2);
                    }
                }
            } else {
                if ((abstractC558210Lut instanceof C558190Lur) && (c558190Lur2 = (C558190Lur) abstractC558210Lut) != null && (num2 = c558190Lur2.LLJJ) != null) {
                    num = num2;
                }
                c558180Luq.LLLLILI(true, num);
                InterfaceC558220Luu interfaceC558220LuuLLLIIIIL2 = c558180Luq.LLLIIIIL();
                if (interfaceC558220LuuLLLIIIIL2 != null) {
                    interfaceC558220LuuLLLIIIIL2.qS1(str2, null);
                }
                View view3 = c558180Luq.LLJJJJ;
                if (view3 != null) {
                    C337180DJs.LIZ(view3);
                }
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = c558180Luq.LLJILLL;
        if (viewOnAttachStateChangeListenerC20604515jv == null || (state = viewOnAttachStateChangeListenerC20604515jv.getState()) == null) {
            return;
        }
        state.LJIILJJIL(i2, abstractC558210Lut);
    }
}
