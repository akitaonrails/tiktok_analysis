package Y;

import X.C07QI;
import X.C0D5D;
import X.C0DEW;
import X.C0DEX;
import X.C0DGF;
import X.C0DGH;
import X.C0DHZ;
import X.C0DNU;
import X.C0DNV;
import X.C0DNZ;
import X.C0DOO;
import X.C0DQ7;
import X.C0DYL;
import X.C0HWW;
import X.C0HXY;
import X.C0OAT;
import X.C0PEM;
import X.C123100dR;
import X.C1245860iWe;
import X.C1247510iZJ;
import X.C1390850mIV;
import X.C1391190mJ3;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1458960o4M;
import X.C1748440vbG;
import X.C1845270y7R;
import X.C1862330yYx;
import X.C197039127h;
import X.C19EG;
import X.C1DFH;
import X.C20684815ws;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2264941Dky;
import X.C23250099c;
import X.C2344009Gk;
import X.C326160CqU;
import X.C327850CtD;
import X.C330960CyE;
import X.C332860D3c;
import X.C339870DUb;
import X.C339940DUi;
import X.C339960DUk;
import X.C343970De7;
import X.C688120Qyw;
import X.C985403tE;
import X.DialogInterfaceOnCancelListenerC346360Dhy;
import X.EnumC326120CqQ;
import X.InterfaceC1378810lz5;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.prop.presenter.MobileEffectViewModel;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.tako.otherpage.video.TakoVideoPlayerFragment;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.ss.android.ugc.profile.business.ur.school.verifyschool.EnterEmailPageAssem;
import com.tts.oecverify.BdTuring;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes5.dex */
public class ACListenerS71S0300000_4 implements View.OnClickListener {
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
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
            case 8:
                onClick$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onClick$9(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS71S0300000_4 aCListenerS71S0300000_4, View view) {
        ((C339940DUi) aCListenerS71S0300000_4.l0).LLILLJJLI.Vr((C339870DUb) aCListenerS71S0300000_4.l1, (C339960DUk) aCListenerS71S0300000_4.l2);
    }

    public static final void onClick$1(ACListenerS71S0300000_4 aCListenerS71S0300000_4, View view) {
        ((C339940DUi) aCListenerS71S0300000_4.l0).LLILLJJLI.Vr((C339870DUb) aCListenerS71S0300000_4.l1, (C339960DUk) aCListenerS71S0300000_4.l2);
    }

    public static final void onClick$2(ACListenerS71S0300000_4 aCListenerS71S0300000_4, View view) {
        C1845270y7R c1845270y7R;
        String str;
        String strValueOf;
        Map<String, String> map;
        String str2;
        C1845270y7R c1845270y7R2;
        if (!((C197039127h) aCListenerS71S0300000_4.l0).LLLII && (c1845270y7R = ((TakoVideoPlayerFragment) aCListenerS71S0300000_4.l1).LLIZLLLIL) != null && (str = c1845270y7R.videoUrl) != null) {
            String str3 = c1845270y7R.fileHash;
            if (str3 == null || !C123100dR.LIZ(str3) || (c1845270y7R2 = ((TakoVideoPlayerFragment) aCListenerS71S0300000_4.l1).LLIZLLLIL) == null || (strValueOf = c1845270y7R2.fileHash) == null) {
                strValueOf = String.valueOf(str.hashCode());
            }
            C07QI.LIZ.getClass();
            if (C07QI.LIZ()) {
                ((TakoVideoPlayerFragment) aCListenerS71S0300000_4.l1).t4(true);
            } else {
                TakoVideoPlayerFragment takoVideoPlayerFragment = (TakoVideoPlayerFragment) aCListenerS71S0300000_4.l1;
                C197039127h c197039127h = (C197039127h) aCListenerS71S0300000_4.l0;
                takoVideoPlayerFragment.getClass();
                c197039127h.setLoading(true);
            }
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            C1845270y7R c1845270y7R3 = ((TakoVideoPlayerFragment) aCListenerS71S0300000_4.l1).LLIZLLLIL;
            if (c1845270y7R3 != null) {
                map = c1845270y7R3.params;
            } else {
                map = null;
            }
            if (c1845270y7R3 != null) {
                str2 = c1845270y7R3.msgId;
            } else {
                str2 = null;
            }
            C1862330yYx.LJLJJL(c1862330yYx, map, "post", "video_generation", null, str2, null, 104);
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope((TakoVideoPlayerFragment) aCListenerS71S0300000_4.l1);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C0DQ7((C197039127h) aCListenerS71S0300000_4.l0, (View) aCListenerS71S0300000_4.l2, strValueOf, str, (TakoVideoPlayerFragment) aCListenerS71S0300000_4.l1, null), 2);
        }
    }

    public static final void onClick$3(ACListenerS71S0300000_4 aCListenerS71S0300000_4, View view) {
        CharSequence text;
        C0DNU c0dnu;
        C0DOO c0doo = C0DOO.LIZ;
        C1245860iWe enterFrom = ((EnterEmailPageAssem) aCListenerS71S0300000_4.l0).ip().getEnterFrom();
        C0DNZ c0dnz = C0DNZ.CLICK_SEND;
        c0doo.getClass();
        C0DOO.LJIILJJIL(enterFrom, c0dnz);
        C1748440vbG c1748440vbG = ((EnterEmailPageAssem) aCListenerS71S0300000_4.l0).LLJJJJJIL;
        if (c1748440vbG == null || (text = c1748440vbG.getText()) == null) {
            text = "";
        }
        EnterEmailPageAssem.LLLFFI.getClass();
        String string = null;
        if (!EnterEmailPageAssem.LLLI.getValue().matches(text)) {
            C1748440vbG c1748440vbG2 = ((EnterEmailPageAssem) aCListenerS71S0300000_4.l0).LLJJJJJIL;
            if (c1748440vbG2 != null) {
                c1748440vbG2.setValidationStatus(3);
            }
            EnterEmailPageAssem enterEmailPageAssem = (EnterEmailPageAssem) aCListenerS71S0300000_4.l0;
            String string2 = text.toString();
            enterEmailPageAssem.getClass();
            if (!a0.LJJIIZI(string2, e3.g, false)) {
                c0dnu = C0DNU.INVALID_EMAIL_NO_AT;
            } else if (!a0.LJJIIZI(string2, e3.d, false)) {
                c0dnu = C0DNU.INVALID_EMAIL_NO_DOT;
            } else {
                c0dnu = C0DNU.INVALID_EMAIL_OTHER;
            }
            C0DOO.LJII(c0dnu, C0DNV.ENTER_EMAIL_PAGE);
            EnterEmailPageAssem enterEmailPageAssem2 = (EnterEmailPageAssem) aCListenerS71S0300000_4.l0;
            Context context = ((UIAssem) aCListenerS71S0300000_4.l1).getContext();
            if (context != null) {
                string = context.getString(2131847024);
            }
            enterEmailPageAssem2.hp(string);
            return;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((UIAssem) aCListenerS71S0300000_4.l1), null, null, new C330960CyE((EnterEmailPageAssem) aCListenerS71S0300000_4.l0, (C0DHZ) aCListenerS71S0300000_4.l2, null), 3);
    }

    public static final void onClick$4(ACListenerS71S0300000_4 aCListenerS71S0300000_4, View view) {
        InterfaceC1378810lz5 interfaceC1378810lz5;
        C1748440vbG c1748440vbG = (C1748440vbG) aCListenerS71S0300000_4.l0;
        if (c1748440vbG != null) {
            C0DYL c0dyl = (C0DYL) aCListenerS71S0300000_4.l2;
            String string = a0.LJLIIIL(String.valueOf(c1748440vbG.getText())).toString();
            if (string != null && string.length() != 0 && (interfaceC1378810lz5 = c0dyl.LIZ) != null) {
                interfaceC1378810lz5.DN(string);
            }
        }
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((LinearLayout) aCListenerS71S0300000_4.l1, C343970De7.LIZ);
    }

    public static final void onClick$5(ACListenerS71S0300000_4 aCListenerS71S0300000_4, View view) {
        if (Intrinsics.LJFF(((C0DEX) aCListenerS71S0300000_4.l0).LJI, ((C332860D3c) aCListenerS71S0300000_4.l1).id)) {
            ((C0DEW) aCListenerS71S0300000_4.l2).LIZLLL().logAd(C2264941Dky.LIZ, ((C0DEW) aCListenerS71S0300000_4.l2).LIZJ());
            ((C0DEW) aCListenerS71S0300000_4.l2).LIZJ.xQ2(((C332860D3c) aCListenerS71S0300000_4.l1).id);
        }
    }

    public static final void onClick$6(ACListenerS71S0300000_4 aCListenerS71S0300000_4, View view) {
        Context context = (Context) aCListenerS71S0300000_4.l0;
        MobileEffectViewModel mobileEffectViewModel = (MobileEffectViewModel) aCListenerS71S0300000_4.l1;
        NewFaceStickerBean newFaceStickerBean = (NewFaceStickerBean) aCListenerS71S0300000_4.l2;
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJII = false;
        c1397580mTM.LJFF(2131833765);
        c1397580mTM.LIZ(2131833764);
        C985403tE.LIZ(c1397580mTM, new AwS370S0200000_4(mobileEffectViewModel, newFaceStickerBean, 93));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public static final void onClick$7(ACListenerS71S0300000_4 aCListenerS71S0300000_4, View view) {
        RecyclerView recyclerView;
        int adapterPosition = ((C0DGH) aCListenerS71S0300000_4.l1).getAdapterPosition();
        C0DGF c0dgf = (C0DGF) aCListenerS71S0300000_4.l2;
        int i = c0dgf.LLILZ;
        c0dgf.LLILZ = adapterPosition;
        if (i != -1) {
            c0dgf.notifyItemChanged(i, Collections.singletonList("selection"));
        }
        C0DGF c0dgf2 = (C0DGF) aCListenerS71S0300000_4.l2;
        int i2 = c0dgf2.LLILZ;
        if (i2 != -1) {
            c0dgf2.notifyItemChanged(i2, Collections.singletonList("selection"));
        }
        ViewParent parent = ((C0DGH) aCListenerS71S0300000_4.l1).itemView.getParent();
        if ((parent instanceof RecyclerView) && (recyclerView = (RecyclerView) parent) != null && adapterPosition != -1) {
            HandlerHook.viewPost(recyclerView, new ARunnableS12S0201000_4(adapterPosition, recyclerView, (C0DGF) aCListenerS71S0300000_4.l2, 3));
        }
        ((C0DGF) aCListenerS71S0300000_4.l2).LLILLJJLI.invoke((C0D5D) aCListenerS71S0300000_4.l0);
    }

    public static final void onClick$8(ACListenerS71S0300000_4 aCListenerS71S0300000_4, View view) {
        Map<String, String> map;
        String strLIZIZ;
        Regex regex = C326160CqU.LIZ;
        EnumC326120CqQ enumC326120CqQLIZ = C326160CqU.LIZ(((TopicRawInfo) aCListenerS71S0300000_4.l0).movieSchema);
        if (enumC326120CqQLIZ == EnumC326120CqQ.UNKNOWN) {
            return;
        }
        C1458960o4M.LIZ = true;
        C2344009Gk c2344009Gk = ((C0OAT) aCListenerS71S0300000_4.l1).LLILLL;
        if (c2344009Gk != null) {
            map = c2344009Gk.LIZ;
        } else {
            map = null;
        }
        C20684815ws.LJIILLIIL("enter_topic_detail", map);
        C327850CtD.LIZIZ("movie_detail_page");
        String str = "";
        if (enumC326120CqQLIZ == EnumC326120CqQ.LEADERBOARD) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://search?keyword=");
            String str2 = ((TopicRawInfo) aCListenerS71S0300000_4.l0).title;
            if (str2 != null) {
                str = str2;
            }
            sbLIZ.append(Uri.encode(str));
            sbLIZ.append("&enter_from=collection_movie&enter_method=ip_collection");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            String str3 = ((TopicRawInfo) aCListenerS71S0300000_4.l0).movieSchema;
            if (str3 != null) {
                str = str3;
            }
            String str4 = "?";
            if (a0.LJJIIZI(str, "?", false)) {
                str4 = "&";
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(str4);
            sbLIZ2.append("enter_from=collection_movie");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        SmartRouter.buildRoute(((View) aCListenerS71S0300000_4.l2).getContext(), strLIZIZ).open();
    }

    public static final void onClick$9(ACListenerS71S0300000_4 aCListenerS71S0300000_4, View view) {
        ((TuxSheet) aCListenerS71S0300000_4.l0).dismiss();
        C0HWW c0hww = C0HWW.LIZ;
        C0HXY c0hxy = (C0HXY) aCListenerS71S0300000_4.l1;
        String str = c0hxy.LLILLJJLI;
        String str2 = c0hxy.LLILLL;
        c0hww.getClass();
        C0HWW.LJIIIZ("delete", str, str2);
        C0HXY c0hxy2 = (C0HXY) aCListenerS71S0300000_4.l1;
        C688120Qyw c688120Qyw = (C688120Qyw) aCListenerS71S0300000_4.l2;
        c0hxy2.getClass();
        C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
        if (c19egLIZIZ != null) {
            C1390850mIV c1390850mIV = new C1390850mIV();
            C1247510iZJ c1247510iZJ = new C1247510iZJ();
            c1247510iZJ.LIZ = c688120Qyw.LIZ.getString(2131847312);
            c1247510iZJ.LIZJ = 1;
            c1247510iZJ.LIZ(new AwS583S0100000_4(c0hxy2, 369));
            c1390850mIV.LIZIZ(c1247510iZJ);
            c1390850mIV.LIZ.LL = new DialogInterfaceOnCancelListenerC346360Dhy(c0hxy2, 4);
            c1390850mIV.LIZJ().show(c19egLIZIZ.getSupportFragmentManager(), "social_avatar_stickers_delete_sheet");
            C0HWW.LJI("show", "sa_aiself_sticker_banner");
        }
    }

    public ACListenerS71S0300000_4(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }

    public ACListenerS71S0300000_4(C339940DUi c339940DUi, C339870DUb c339870DUb, C339960DUk c339960DUk, int i, int i2) {
        this.$t = i2;
        this.l0 = c339940DUi;
        this.l1 = c339870DUb;
        this.l2 = c339960DUk;
    }
}
