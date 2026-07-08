package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.ICLACaptionService;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.TextStickerInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.11jE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19581011jE extends AbstractC19586911kB {
    public final InterfaceC386401eo LJIIIZ;
    public C19581111jF LJIIJ;
    public final C19580411j8 LJIIJJI;
    public String LJIIL;
    public final ICLACaptionService LJIILIIL;

    @Override // X.InterfaceC19594811lS
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC19594911lT
    public final boolean LJI(float f, float f2, int i, long j) {
        return false;
    }

    @Override // X.InterfaceC19594911lT
    public final boolean LJIIIZ(long j, int i, float f, float f2, InterfaceC19579211iw interfaceC19579211iw) {
        return false;
    }

    @Override // X.AbstractC19586911kB
    public final void LJIJ() {
    }

    @Override // X.AbstractC19586911kB
    public final void LJIJI() {
    }

    @Override // X.InterfaceC19594811lS
    public final void LJJIII() {
    }

    @Override // X.InterfaceC19594611lQ
    public final int getStickerType() {
        return 18;
    }

    @Override // X.AbstractC19586911kB
    public final View LJIILL() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.LIZ);
        C786410Ut5.d6(linearLayout, layoutParams);
        linearLayout.setOrientation(0);
        TuxTextView tuxTextView = new TuxTextView(this.LIZ, null, 6, 0);
        tuxTextView.setTextColor(C960203pA.LIZ(R.attr.ee, this.LIZ));
        tuxTextView.setTuxFont(62);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = (int) C12ES.LIZJ(1.0f, this.LIZ);
        C786410Ut5.R6(tuxTextView, layoutParams2);
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(16);
        tuxTextView.setText(this.LIZ.getString(2131847256));
        C418730GbP c418730GbP = new C418730GbP(this.LIZ, null);
        c418730GbP.setImageResource(R.drawable.cw9);
        linearLayout.addView(tuxTextView);
        linearLayout.addView(c418730GbP);
        return linearLayout;
    }

    @Override // X.InterfaceC19594811lS
    public final View getView() {
        if (this.LJIIJ == null) {
            C19581111jF c19581111jF = new C19581111jF(this.LIZ);
            this.LJIIJ = c19581111jF;
            c19581111jF.setInteractStickerParams(this.LIZJ);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            C19581111jF c19581111jF2 = this.LJIIJ;
            if (c19581111jF2 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19581111jF2);
                c19581111jF2.setLayoutParams(layoutParams);
            }
            C19581111jF c19581111jF3 = this.LJIIJ;
            if (c19581111jF3 != null) {
                InteractStickerStruct interactStickerStruct = this.LJII;
                TextStickerInfo textInfo = interactStickerStruct != null ? interactStickerStruct.getTextInfo() : null;
                InteractStickerStruct interactStickerStruct2 = this.LJII;
                if (interactStickerStruct2 != null) {
                    interactStickerStruct2.getTextStruct();
                }
                c19581111jF3.LLILZ = textInfo;
            }
        }
        C19581111jF c19581111jF4 = this.LJIIJ;
        if (c19581111jF4 != null) {
            int visibility = c19581111jF4.getVisibility();
            c19581111jF4.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c19581111jF4);
        }
        C19581111jF c19581111jF5 = this.LJIIJ;
        if (c19581111jF5 != null) {
            c19581111jF5.postInvalidate();
        }
        return this.LJIIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0287 A[EDGE_INSN: B:288:0x0287->B:138:0x0287 BREAK  A[LOOP:0: B:119:0x0215->B:137:0x0283]] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0465 A[Catch: Exception -> 0x04f2, TryCatch #1 {Exception -> 0x04f2, blocks: (B:172:0x033f, B:174:0x034b, B:180:0x035e, B:182:0x0365, B:183:0x0370, B:185:0x0374, B:186:0x0378, B:188:0x037c, B:189:0x037e, B:195:0x038b, B:196:0x0392, B:198:0x0396, B:199:0x03b9, B:201:0x03bd, B:202:0x03e2, B:204:0x03e6, B:205:0x03f1, B:207:0x03f5, B:208:0x03f9, B:210:0x03fd, B:211:0x03ff, B:217:0x040c, B:219:0x0415, B:221:0x0419, B:222:0x043c, B:224:0x0440, B:225:0x0465, B:227:0x0469, B:228:0x0474, B:230:0x0478, B:231:0x047c, B:233:0x0480, B:236:0x0487, B:237:0x048e, B:239:0x0492, B:241:0x0496, B:243:0x049a, B:245:0x04a3, B:247:0x04a7, B:248:0x04ca, B:250:0x04ce), top: B:287:0x033f }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0469 A[Catch: Exception -> 0x04f2, TryCatch #1 {Exception -> 0x04f2, blocks: (B:172:0x033f, B:174:0x034b, B:180:0x035e, B:182:0x0365, B:183:0x0370, B:185:0x0374, B:186:0x0378, B:188:0x037c, B:189:0x037e, B:195:0x038b, B:196:0x0392, B:198:0x0396, B:199:0x03b9, B:201:0x03bd, B:202:0x03e2, B:204:0x03e6, B:205:0x03f1, B:207:0x03f5, B:208:0x03f9, B:210:0x03fd, B:211:0x03ff, B:217:0x040c, B:219:0x0415, B:221:0x0419, B:222:0x043c, B:224:0x0440, B:225:0x0465, B:227:0x0469, B:228:0x0474, B:230:0x0478, B:231:0x047c, B:233:0x0480, B:236:0x0487, B:237:0x048e, B:239:0x0492, B:241:0x0496, B:243:0x049a, B:245:0x04a3, B:247:0x04a7, B:248:0x04ca, B:250:0x04ce), top: B:287:0x033f }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0478 A[Catch: Exception -> 0x04f2, TryCatch #1 {Exception -> 0x04f2, blocks: (B:172:0x033f, B:174:0x034b, B:180:0x035e, B:182:0x0365, B:183:0x0370, B:185:0x0374, B:186:0x0378, B:188:0x037c, B:189:0x037e, B:195:0x038b, B:196:0x0392, B:198:0x0396, B:199:0x03b9, B:201:0x03bd, B:202:0x03e2, B:204:0x03e6, B:205:0x03f1, B:207:0x03f5, B:208:0x03f9, B:210:0x03fd, B:211:0x03ff, B:217:0x040c, B:219:0x0415, B:221:0x0419, B:222:0x043c, B:224:0x0440, B:225:0x0465, B:227:0x0469, B:228:0x0474, B:230:0x0478, B:231:0x047c, B:233:0x0480, B:236:0x0487, B:237:0x048e, B:239:0x0492, B:241:0x0496, B:243:0x049a, B:245:0x04a3, B:247:0x04a7, B:248:0x04ca, B:250:0x04ce), top: B:287:0x033f }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04a3 A[Catch: Exception -> 0x04f2, TryCatch #1 {Exception -> 0x04f2, blocks: (B:172:0x033f, B:174:0x034b, B:180:0x035e, B:182:0x0365, B:183:0x0370, B:185:0x0374, B:186:0x0378, B:188:0x037c, B:189:0x037e, B:195:0x038b, B:196:0x0392, B:198:0x0396, B:199:0x03b9, B:201:0x03bd, B:202:0x03e2, B:204:0x03e6, B:205:0x03f1, B:207:0x03f5, B:208:0x03f9, B:210:0x03fd, B:211:0x03ff, B:217:0x040c, B:219:0x0415, B:221:0x0419, B:222:0x043c, B:224:0x0440, B:225:0x0465, B:227:0x0469, B:228:0x0474, B:230:0x0478, B:231:0x047c, B:233:0x0480, B:236:0x0487, B:237:0x048e, B:239:0x0492, B:241:0x0496, B:243:0x049a, B:245:0x04a3, B:247:0x04a7, B:248:0x04ca, B:250:0x04ce), top: B:287:0x033f }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x056e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(boolean r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 1409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19581011jE.LJJI(boolean, boolean):void");
    }

    public final void LJJIFFI(Long l, boolean z) {
        if (l != null) {
            l.longValue();
            if (this.LJII == null) {
                return;
            }
            List<? extends NormalTrackTimeStamp> list = this.LJIIIIZZ;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (NormalTrackTimeStamp normalTrackTimeStamp : list) {
                    NormalTrackTimeStamp normalTrackTimeStamp2 = normalTrackTimeStamp;
                    if (normalTrackTimeStamp2 != null && (normalTrackTimeStamp2.isWholeDuration() || (normalTrackTimeStamp2.timeIsValid() && l.longValue() >= normalTrackTimeStamp2.getStartTime() - 150.0f && normalTrackTimeStamp2.getEndTime() - 150.0f >= l.longValue()))) {
                        arrayList.add(normalTrackTimeStamp);
                    }
                }
                if (!arrayList.isEmpty()) {
                    LJJI(z, true);
                    return;
                }
            }
            LJJI(z, false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11j8] */
    public C19581011jE(int i, final Context context, C194349111v c194349111v, final InteractStickerStruct interactStickerStruct, final C705930RmZ c705930RmZ, final InterfaceC386401eo interfaceC386401eo) {
        super(context, c194349111v, interactStickerStruct, c705930RmZ);
        this.LJIIIZ = interfaceC386401eo;
        this.LJIIJJI = new AbstractC19580211j6(context, this, interactStickerStruct, c705930RmZ, interfaceC386401eo) { // from class: X.11j8
            public final InterfaceC386401eo LJ;

            @Override // X.AbstractC19580211j6
            public final void LJIIJJI(float f, float f2, InterfaceC19579211iw interfaceC19579211iw) {
            }

            @Override // X.AbstractC19580211j6
            public final List<NormalTrackTimeStamp> LIZIZ(long j, InteractStickerStruct interactStickerStruct2) {
                return C19580611jA.LIZJ(j, interactStickerStruct2);
            }

            {
                this.LJ = interfaceC386401eo;
            }
        };
        this.LJIIL = "";
        this.LJIILIIL = (ICLACaptionService) ServiceManager.get().getService(ICLACaptionService.class);
    }
}
