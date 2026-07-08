package X;

import Y.AObserverS230S0100000_28;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.aikit.api.camera.ability.PublishService;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.video.ICreativePageService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.subscription.preview.SubscriptionPublishPermissionViewModel;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;
import com.zhiliaoapp.musically.R;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS109S0201000_28;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10BU, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10BU extends C109W {
    public final boolean LLJI;
    public final C01GW LLJIJIL;
    public boolean LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public SoftReference<Fragment> LLJJ;

    @Override // X.C109Y, X.AbstractC191843103l
    public final void LJIIIIZZ() {
        Fragment fragment;
        SoftReference<Fragment> softReference = this.LLJJ;
        if (softReference != null && (fragment = softReference.get()) != null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(fragment, C343970De7.LIZ);
        }
        this.LLJJ = null;
        LJIL();
        super.LJIIIIZZ();
    }

    public final SubscriptionPublishPermissionViewModel LJJIJ() {
        return (SubscriptionPublishPermissionViewModel) this.LLJIJIL.getValue();
    }

    public final VideoPublishEditModel LJJIJIIJIL() {
        InterfaceC192004109q interfaceC192004109q = this.LLILZLL;
        VideoPublishEditModel videoPublishEditModelLIZIZ = interfaceC192004109q != null ? interfaceC192004109q.LIZIZ() : null;
        if (videoPublishEditModelLIZIZ instanceof VideoPublishEditModel) {
            return videoPublishEditModelLIZIZ;
        }
        return null;
    }

    @Override // X.C109W, X.C109Y, X.AbstractC191843103l
    public final void LJII() {
        super.LJII();
        if (!this.LLJILJIL) {
            this.LLJILJIL = true;
            LifecycleOwner lifecycleOwner = this.LLILLJJLI.LIZJ;
            LJJIJ().LLJIJIL.observe(lifecycleOwner, new AObserverS230S0100000_28(this, 1));
            LJJIJ().LLIZ.observe(lifecycleOwner, new C10BW(this));
            LJJIJ().LLJJ.observe(lifecycleOwner, new C10A7(this));
        }
        VideoPublishEditModel videoPublishEditModelLJJIJIIJIL = LJJIJIIJIL();
        if (videoPublishEditModelLJJIJIIJIL != null) {
            SubscriptionPublishPermissionViewModel subscriptionPublishPermissionViewModelLJJIJ = LJJIJ();
            int iLJIILIIL = LJIILIIL();
            String str = this.LLILLJJLI.LIZLLL;
            if (str == null) {
                str = "";
            }
            subscriptionPublishPermissionViewModelLJJIJ.vQ2(iLJIILIIL, videoPublishEditModelLJJIJIIJIL, str);
        }
    }

    @Override // X.C109Y
    public final List<AbstractC191840103i> LJIILJJIL(List<AbstractC191840103i> list) {
        Object next;
        InterfaceC191854103w interfaceC191854103w;
        Object objPrevious;
        InterfaceC191854103w interfaceC191854103w2;
        ArrayList arrayList = (ArrayList) list;
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof InterfaceC191854103w) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (next instanceof InterfaceC191854103w) {
            interfaceC191854103w = (InterfaceC191854103w) next;
        } else {
            interfaceC191854103w = null;
        }
        if (interfaceC191854103w != null) {
            interfaceC191854103w.LIZLLL(true);
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                objPrevious = listIterator.previous();
                if (objPrevious instanceof InterfaceC191854103w) {
                    break;
                }
            } else {
                objPrevious = null;
                break;
            }
        }
        if ((objPrevious instanceof InterfaceC191854103w) && (interfaceC191854103w2 = (InterfaceC191854103w) objPrevious) != null) {
            interfaceC191854103w2.LIZJ(true);
        }
        return list;
    }

    @Override // X.C109W
    public final Integer LJJII(int i) {
        boolean z = false;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "post_process_ui_optimize", true) == 1) {
            z = true;
        }
        if (!z) {
            return null;
        }
        if (i != 3) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 4) {
                            return null;
                        }
                    } else {
                        return Integer.valueOf(R.raw.icon_person_arrow_left_right);
                    }
                } else {
                    return Integer.valueOf(R.raw.icon_lock_small);
                }
            } else {
                return Integer.valueOf(R.raw.icon_earth_w);
            }
        }
        return Integer.valueOf(R.raw.icon_person_star);
    }

    @Override // X.C109W
    public final AnonymousClass1098 LJJIIZ(C191848103q c191848103q) {
        int iLIZIZ;
        int i;
        AnonymousClass1098 anonymousClass1098 = new AnonymousClass1098();
        C105X c105x = null;
        if (C10BZ.LIZ()) {
            anonymousClass1098.LIZIZ = new C105X(null, new C191884105a(31), 0, 11);
            anonymousClass1098.LIZJ = new C105X(null, new C191884105a(61), 0, 11);
            if (this.LLJI) {
                i = 8;
            } else {
                i = 16;
            }
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
            anonymousClass1098.LIZLLL = Integer.valueOf(R.attr.a1h);
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        }
        if (C10BZ.LIZ()) {
            c105x = new C105X(null, new C191884105a(31), 0, 11);
        }
        anonymousClass1098.LIZIZ = c105x;
        anonymousClass1098.LJ = new C105Z(iLIZIZ, iLIZIZ);
        return anonymousClass1098;
    }

    public C10BU(C191848103q c191848103q, C107N c107n) {
        super(c191848103q, c107n);
        boolean z = false;
        ICreativePageService iCreativePageService = (ICreativePageService) PluggableExtentionKt.pluggableSpi$default(ICreativePageService.class, false, false, false, 14, null);
        if (iCreativePageService != null && !iCreativePageService.isPublishPage(C1388190mED.LIZIZ(c191848103q.LIZ))) {
            z = true;
        }
        this.LLJI = !z;
        this.LLJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(c191848103q, 15));
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(18));
        this.LLJILLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(19));
    }

    public static String LJJIJIIJI(Context context, VideoPublishEditModel videoPublishEditModel) {
        if (!TextUtils.isEmpty(videoPublishEditModel.playlist_name)) {
            return C786410Ut5.j4(context.getString(2131838198), Arrays.copyOf(new Object[]{videoPublishEditModel.playlist_name}, 1));
        }
        return "";
    }

    @Override // X.C109Y
    public final CharSequence LJIIZILJ(Context context, CharSequence charSequence) {
        CreativeModel creativeModel;
        if (C10BZ.LIZ()) {
            return "";
        }
        C548590LfN.LIZ.getClass();
        PublishService publishServiceLIZLLL = C548590LfN.LIZLLL();
        VideoPublishEditModel videoPublishEditModelLJJIJIIJIL = LJJIJIIJIL();
        if (videoPublishEditModelLJJIJIIJIL != null) {
            creativeModel = videoPublishEditModelLJJIJIIJIL.creativeModel;
        } else {
            creativeModel = null;
        }
        if (publishServiceLIZLLL.LIZ(creativeModel)) {
            C547860LeC.LIZ.getClass();
            String strLIZLLL = C547860LeC.LJI().LIZLLL(C0LOK.LIZ, 2131826083, null);
            if (strLIZLLL == null) {
                return context.getString(2131844946);
            }
            return strLIZLLL;
        }
        C191821102p.LIZIZ().getClass();
        PrivacySettingsAgreementRecord privacySettingsAgreementRecordLJI = C191880104w.LJI("video_visibility_select");
        if (privacySettingsAgreementRecordLJI != null && privacySettingsAgreementRecordLJI.status == 1) {
            return context.getString(2131845582);
        }
        return charSequence;
    }

    @Override // X.C109Y
    public final boolean LJIJI(int i, View view) {
        String strJ4;
        Context context = this.LLILLJJLI.LIZ;
        VideoPublishEditModel videoPublishEditModelLJJIJIIJIL = LJJIJIIJIL();
        if (videoPublishEditModelLJJIJIIJIL == null) {
            return false;
        }
        if (i == 3) {
            i = 4;
        }
        if (LJIILIIL() != 0 || TextUtils.isEmpty(videoPublishEditModelLJJIJIIJIL.playlist_name) || i == 0) {
            return false;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    return false;
                }
                if (!TextUtils.isEmpty(videoPublishEditModelLJJIJIIJIL.playlist_name)) {
                    strJ4 = C786410Ut5.j4(context.getString(2131849229), Arrays.copyOf(new Object[]{videoPublishEditModelLJJIJIIJIL.playlist_name}, 1));
                } else {
                    strJ4 = "";
                }
                if (TextUtils.isEmpty(strJ4)) {
                    LJJIJIL(4, context, view, context.getString(2131834701));
                    return true;
                }
                LJJIJIL(4, context, view, strJ4);
                return true;
            }
            LJJIJIL(2, context, view, LJJIJIIJI(context, videoPublishEditModelLJJIJIIJIL));
            return true;
        }
        String strLJJIJIIJI = LJJIJIIJI(context, videoPublishEditModelLJJIJIIJIL);
        if (TextUtils.isEmpty(strLJJIJIIJI)) {
            LJJIJIL(1, context, view, context.getString(2131834701));
            return true;
        }
        LJJIJIL(1, context, view, strLJJIJIIJI);
        return true;
    }

    @Override // X.C109Y
    public final void LJIJJLI(int i, View view) {
        if (i == 3) {
            i = 4;
        }
        super.LJIJJLI(i, view);
        VideoPublishEditModel videoPublishEditModelLJJIJIIJIL = LJJIJIIJIL();
        if (videoPublishEditModelLJJIJIIJIL != null) {
            SubscriptionPublishPermissionViewModel subscriptionPublishPermissionViewModelLJJIJ = LJJIJ();
            int iLJIILIIL = LJIILIIL();
            String str = this.LLILLJJLI.LIZLLL;
            if (str == null) {
                str = "";
            }
            subscriptionPublishPermissionViewModelLJJIJ.vQ2(iLJIILIIL, videoPublishEditModelLJJIJIIJIL, str);
        }
    }

    @Override // X.C109W
    public final List LJJ(int i, C109B c109b) {
        VideoPublishEditModel videoPublishEditModelLJJIJIIJIL;
        int i2;
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(c109b);
        if (!this.LLJI) {
            return listLJIILJJIL;
        }
        if ((i != 3 && i != 4) || (videoPublishEditModelLJJIJIIJIL = LJJIJIIJIL()) == null || LJIILIIL() != 4) {
            return listLJIILJJIL;
        }
        if (videoPublishEditModelLJJIJIIJIL.getCreationMode() != 1 && !C1428470nHB.LJJZZI(videoPublishEditModelLJJIJIIJIL)) {
            return listLJIILJJIL;
        }
        Context context = this.LLILLJJLI.LIZ;
        AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(this, 19);
        String string = context.getString(2131830347);
        T value = LJJIJ().LLJ.getValue();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(value, bool)) {
            i2 = R.attr.a01;
        } else {
            i2 = R.attr.a03;
        }
        listLJIILJJIL.add(new C10AP(string, i2, awS607S0100000_28, awS607S0100000_28, Intrinsics.LJFF(LJJIJ().LLJ.getValue(), bool), new AwS571S0100000_27(this, 5)));
        return listLJIILJJIL;
    }

    @Override // X.C109W
    public final boolean LJJI(int i, boolean z) {
        int iLJIILIIL = LJIILIIL();
        if (i == 3) {
            i = 4;
        }
        if (iLJIILIIL == i) {
            return true;
        }
        return false;
    }

    @Override // X.C109W
    public final boolean LJJIFFI(int i, boolean z) {
        VideoPublishEditModel videoPublishEditModelLJJIJIIJIL;
        MusicObject musicObject;
        if ((i != 3 && i != 4) || (videoPublishEditModelLJJIJIIJIL = LJJIJIIJIL()) == null) {
            return z;
        }
        C19204010Ba.LIZ.getClass();
        if (C0L44.LIZ() && (musicObject = videoPublishEditModelLJJIJIIJIL.creativeModel.musicBuzModel.music) != null && !musicObject.isCommerceMusic) {
            return false;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ed  */
    @Override // X.C109W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIIJZLJL(int r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10BU.LJJIIJZLJL(int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8  */
    @Override // X.C109W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence LJJIII(android.content.Context r17, java.lang.CharSequence r18, int r19) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10BU.LJJIII(android.content.Context, java.lang.CharSequence, int):java.lang.CharSequence");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    @Override // X.C109W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence LJJIIJ(android.content.Context r18, java.lang.CharSequence r19, int r20) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10BU.LJJIIJ(android.content.Context, java.lang.CharSequence, int):java.lang.CharSequence");
    }

    public final void LJJIJIL(int i, Context context, View view, String str) {
        int i2;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        i2 = 2131838197;
                    } else {
                        i2 = 2131849230;
                    }
                } else {
                    i2 = 2131845722;
                }
            } else {
                i2 = 2131845723;
            }
        } else {
            i2 = 2131845724;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJFF(i2);
        c1397580mTM.LIZIZ(str);
        C985403tE.LIZ(c1397580mTM, new AwS109S0201000_28(this, view, i, 1));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }
}
