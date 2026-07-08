package X;

import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData;
import com.ss.android.ugc.aweme.sticker.data.BaseTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.11ix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19579311ix extends AbstractC19586911kB {
    public final InterfaceC386401eo LJIIIZ;
    public final BusinessExtraData LJIIJ;
    public final Aweme LJIIJJI;
    public View LJIIL;
    public final C19579411iy LJIILIIL;
    public final BPEAHandler LJIILJJIL;
    public final ARunnableS129S0100000_29 LJIILL;
    public final C01GW LJIILLIIL;
    public final C01GW LJIIZILJ;

    @Override // X.InterfaceC19594811lS
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC19594811lS
    public final void LJJIII() {
    }

    @Override // X.InterfaceC19594611lQ
    public final int getStickerType() {
        return 2;
    }

    @Override // X.AbstractC19586911kB
    public final View LJIILL() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.LIZ);
        C786410Ut5.d6(linearLayout, layoutParams);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        C424620Gku c424620Gku = new C424620Gku(this.LIZ);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) C12ES.LIZJ(32.0f, this.LIZ), (int) C12ES.LIZJ(32.0f, this.LIZ));
        layoutParams2.setMargins(0, 0, (int) C12ES.LIZJ(8.0f, this.LIZ), 0);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c424620Gku);
        c424620Gku.setLayoutParams(layoutParams2);
        ((C1331070kk5) c424620Gku.getHierarchy()).LJJ(R.drawable.ccl);
        C1331070kk5 c1331070kk5 = (C1331070kk5) c424620Gku.getHierarchy();
        c1331070kk5.LJIJ(c1331070kk5.LIZIZ.getDrawable(R.drawable.ccl), 5);
        BusinessExtraData businessExtraData = this.LJIIJ;
        C1324840ka2.LJIIJ(c424620Gku, businessExtraData != null ? businessExtraData.getPopIcon() : null, -1, -1);
        TuxTextView tuxTextView = new TuxTextView(this.LIZ, null, 6, 0);
        tuxTextView.setTextColor(C960203pA.LIZ(R.attr.ef, this.LIZ));
        tuxTextView.setTuxFont(62);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        layoutParams3.weight = 1.0f;
        layoutParams3.topMargin = (int) C12ES.LIZJ(1.0f, this.LIZ);
        C786410Ut5.R6(tuxTextView, layoutParams3);
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(16);
        BusinessExtraData businessExtraData2 = this.LJIIJ;
        tuxTextView.setText(businessExtraData2 != null ? businessExtraData2.getPopText() : null);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        TuxIconView tuxIconView = new TuxIconView(this.LIZ, null, 0, 6, null);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_right_fill_ltr;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        tuxIconView.setTuxIcon(c419910GdJ);
        linearLayout.addView(c424620Gku);
        linearLayout.addView(tuxTextView);
        linearLayout.addView(tuxIconView);
        return linearLayout;
    }

    @Override // X.AbstractC19586911kB
    public final void LJIJ() {
        C0R60 c0r60;
        C0R60 c0r602;
        C0R60 c0r603;
        C0R60 c0r604;
        C2344009Gk c2344009Gk = new C2344009Gk();
        BusinessExtraData businessExtraData = this.LJIIJ;
        c2344009Gk.LJIIIIZZ("prop_id", businessExtraData != null ? businessExtraData.getStickerId() : null);
        C705930RmZ c705930RmZ = this.LIZJ;
        c2344009Gk.LJIIIIZZ("enter_from", (c705930RmZ == null || (c0r604 = c705930RmZ.LJIIZILJ) == null) ? null : c0r604.LIZ);
        C705930RmZ c705930RmZ2 = this.LIZJ;
        c2344009Gk.LJIIIIZZ("log_pb", (c705930RmZ2 == null || (c0r603 = c705930RmZ2.LJIIZILJ) == null) ? null : c0r603.LJ);
        C705930RmZ c705930RmZ3 = this.LIZJ;
        c2344009Gk.LJIIIIZZ("author_id", (c705930RmZ3 == null || (c0r602 = c705930RmZ3.LJIIZILJ) == null) ? null : c0r602.LIZJ);
        C705930RmZ c705930RmZ4 = this.LIZJ;
        c2344009Gk.LJIIIIZZ("group_id", (c705930RmZ4 == null || (c0r60 = c705930RmZ4.LJIIZILJ) == null) ? null : c0r60.LIZLLL);
        BusinessExtraData businessExtraData2 = this.LJIIJ;
        c2344009Gk.LJIIIIZZ("enter_method", C19580611jA.LIZLLL(businessExtraData2 != null ? businessExtraData2.getSchemaUrlWebFirst() : null));
        BusinessExtraData businessExtraData3 = this.LJIIJ;
        c2344009Gk.LJIIIIZZ("url", businessExtraData3 != null ? businessExtraData3.getSchemaUrlWebFirst() : null);
        C20684815ws.LJIILLIIL("function_prop_click", c2344009Gk.LIZ);
        Aweme aweme = this.LJIIJJI;
        if (aweme == null || !aweme.isAd()) {
            return;
        }
        ICommerceGlueOutService iCommerceGlueOutService = (ICommerceGlueOutService) this.LJIILLIIL.getValue();
        if (iCommerceGlueOutService != null) {
            iCommerceGlueOutService.LJJJJZ(this.LIZ, this.LJIIJJI);
        }
        C2184171Adz.LIZLLL("draw_ad", "otherclick", this.LJIIJJI.getAwemeRawAd()).LJIIIIZZ();
        BusinessExtraData businessExtraData4 = this.LJIIJ;
        if (businessExtraData4 != null) {
            businessExtraData4.getStickerId();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0107  */
    @Override // X.AbstractC19586911kB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI() {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19579311ix.LJIJI():void");
    }

    @Override // X.InterfaceC19594811lS
    public final View getView() {
        if (C19580611jA.LJI(this.LIZ)) {
            if (this.LJIIL == null) {
                this.LJIIL = new C0GST(this.LIZ);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                View view = this.LJIIL;
                if (view != null) {
                    C786410Ut5.W5(view, layoutParams);
                }
            }
            return this.LJIIL;
        }
        if (this.LJIIL == null) {
            this.LJIIL = new FrameLayout(this.LIZ);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            View view2 = this.LJIIL;
            if (view2 != null) {
                C786410Ut5.W5(view2, layoutParams2);
            }
        }
        return this.LJIIL;
    }

    @Override // X.AbstractC19586911kB, X.InterfaceC19594811lS
    public final void onPause() {
        BPEAHandler bPEAHandler = this.LJIILJJIL;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.AbstractC19586911kB, X.InterfaceC19594811lS
    public final void onResume() {
        BPEAHandler bPEAHandler;
        ARunnableS129S0100000_29 aRunnableS129S0100000_29 = this.LJIILL;
        if (aRunnableS129S0100000_29 == null || (bPEAHandler = this.LJIILJJIL) == null) {
            return;
        }
        C786410Ut5.LJJZZIII(bPEAHandler, aRunnableS129S0100000_29);
    }

    @Override // X.AbstractC19586911kB, X.InterfaceC19594911lT
    public final void LIZLLL(C705930RmZ c705930RmZ) {
        this.LIZJ = c705930RmZ;
        this.LJIILIIL.LIZLLL = c705930RmZ;
    }

    @Override // X.AbstractC19586911kB, X.InterfaceC19594811lS
    public final void LJIIJJI(int i) {
        super.LJIIJJI(i);
        BPEAHandler bPEAHandler = this.LJIILJJIL;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.AbstractC19586911kB
    public final void LJIILJJIL(C435270H4z c435270H4z) {
        int iLIZJ = (int) C12ES.LIZJ(57.9f, this.LIZ);
        c435270H4z.LLILZ = iLIZJ;
        c435270H4z.setHeight(iLIZJ);
        C418600GbC.LLJJL = iLIZJ;
    }

    @Override // X.InterfaceC19594911lT
    public final boolean LJI(float f, float f2, int i, long j) {
        return LJI(f, f2, i, j);
    }

    @Override // X.InterfaceC19594911lT
    public final boolean LJIIIZ(long j, int i, float f, float f2, InterfaceC19579211iw interfaceC19579211iw) {
        return LJIIIZ(j, i, f, f2, interfaceC19579211iw);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.11iy] */
    public C19579311ix(int i, final Context context, C194349111v c194349111v, final InteractStickerStruct interactStickerStruct, final C705930RmZ c705930RmZ, InterfaceC386401eo interfaceC386401eo, final BusinessExtraData businessExtraData, Aweme aweme) {
        String stickerId;
        String str;
        String str2;
        String str3;
        String str4;
        String schemaUrlWebFirst;
        C0R60 c0r60;
        C0R60 c0r602;
        C0R60 c0r603;
        C0R60 c0r604;
        super(context, c194349111v, interactStickerStruct, c705930RmZ);
        this.LJIIIZ = interfaceC386401eo;
        this.LJIIJ = businessExtraData;
        this.LJIIJJI = aweme;
        this.LJIILIIL = new AbstractC19580211j6(context, this, interactStickerStruct, c705930RmZ, businessExtraData) { // from class: X.11iy
            public final BusinessExtraData LJ;

            @Override // X.AbstractC19580211j6
            public final List<NormalTrackTimeStamp> LIZIZ(long j, InteractStickerStruct interactStickerStruct2) {
                List list;
                long pts;
                boolean z;
                String trackList;
                ArrayList arrayList = null;
                try {
                    Gson gson = C7740030o.LIZ().getGson();
                    if (interactStickerStruct2 != null) {
                        trackList = interactStickerStruct2.getTrackList();
                    } else {
                        trackList = null;
                    }
                    list = (List) GsonProtectorUtils.fromJson(gson, trackList, new TypeToken<List<? extends NormalTrackTimeStamp>>() { // from class: X.11iz
                    }.getType());
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("InteractStickerUtils.kt : e ");
                    sbLIZ.append(e);
                    C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    list = null;
                }
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj : list) {
                        BaseTrackTimeStamp baseTrackTimeStamp = (BaseTrackTimeStamp) obj;
                        if (baseTrackTimeStamp != null) {
                            pts = baseTrackTimeStamp.getPts();
                        } else {
                            pts = 0;
                        }
                        long j2 = j - pts;
                        if (-160 <= j2 && j2 < 161) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(obj);
                        }
                    }
                }
                return arrayList;
            }

            @Override // X.AbstractC19580211j6
            public final void LJIIJJI(float f, float f2, InterfaceC19579211iw interfaceC19579211iw) {
                String schemaUrlOpenFirst;
                BusinessExtraData businessExtraData2 = this.LJ;
                if (businessExtraData2 != null) {
                    schemaUrlOpenFirst = businessExtraData2.getSchemaUrlOpenFirst();
                } else {
                    schemaUrlOpenFirst = null;
                }
                if (C1030670cvZ.LIZ(schemaUrlOpenFirst)) {
                    return;
                }
                interfaceC19579211iw.LIZ(this.LIZIZ.LJIL(f, f2));
            }

            @Override // X.AbstractC19580211j6, X.InterfaceC19594911lT
            public final boolean LJI(float f, float f2, int i2, long j) {
                String stickerId2;
                BusinessExtraData businessExtraData2 = this.LJ;
                String schemaUrlOpenFirst = null;
                if (businessExtraData2 != null) {
                    stickerId2 = businessExtraData2.getStickerId();
                } else {
                    stickerId2 = null;
                }
                if (TextUtils.isEmpty(stickerId2)) {
                    return false;
                }
                BusinessExtraData businessExtraData3 = this.LJ;
                if (businessExtraData3 != null) {
                    schemaUrlOpenFirst = businessExtraData3.getSchemaUrlOpenFirst();
                }
                if (TextUtils.isEmpty(schemaUrlOpenFirst)) {
                    return false;
                }
                return super.LJI(f, f2, i2, j);
            }

            {
                this.LJ = businessExtraData;
            }
        };
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(530));
        this.LJIILLIIL = c01gwLIZIZ;
        this.LJIIZILJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(529));
        if (C19580611jA.LJI(context)) {
            ARunnableS129S0100000_29 aRunnableS129S0100000_29 = new ARunnableS129S0100000_29(this, 227);
            this.LJIILL = aRunnableS129S0100000_29;
            BPEAHandler bPEAHandler = new BPEAHandler();
            this.LJIILJJIL = bPEAHandler;
            C786410Ut5.LJJZZIII(bPEAHandler, aRunnableS129S0100000_29);
        }
        if (aweme != null && aweme.isAd()) {
            ICommerceGlueOutService iCommerceGlueOutService = (ICommerceGlueOutService) c01gwLIZIZ.getValue();
            if (iCommerceGlueOutService != null) {
                iCommerceGlueOutService.LJJIZ(context, aweme);
            }
            C2184171Adz.LIZLLL("draw_ad", "othershow", aweme.getAwemeRawAd()).LJIIIIZZ();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (businessExtraData != null) {
            stickerId = businessExtraData.getStickerId();
        } else {
            stickerId = null;
        }
        c2344009Gk.LJIIIIZZ("prop_id", stickerId);
        if (c705930RmZ != null && (c0r604 = c705930RmZ.LJIIZILJ) != null) {
            str = c0r604.LIZ;
        } else {
            str = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
        if (c705930RmZ != null && (c0r603 = c705930RmZ.LJIIZILJ) != null) {
            str2 = c0r603.LJ;
        } else {
            str2 = null;
        }
        c2344009Gk.LJIIIIZZ("log_pb", str2);
        if (c705930RmZ != null && (c0r602 = c705930RmZ.LJIIZILJ) != null) {
            str3 = c0r602.LIZJ;
        } else {
            str3 = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", str3);
        if (c705930RmZ != null && (c0r60 = c705930RmZ.LJIIZILJ) != null) {
            str4 = c0r60.LIZLLL;
        } else {
            str4 = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", str4);
        if (businessExtraData != null) {
            schemaUrlWebFirst = businessExtraData.getSchemaUrlWebFirst();
        } else {
            schemaUrlWebFirst = null;
        }
        c2344009Gk.LJIIIIZZ("enter_method", C19580611jA.LIZLLL(schemaUrlWebFirst));
        c2344009Gk.LJIIIIZZ("url", businessExtraData != null ? businessExtraData.getSchemaUrlWebFirst() : null);
        C20684815ws.LJIILLIIL("function_prop_show", c2344009Gk.LIZ);
    }
}
