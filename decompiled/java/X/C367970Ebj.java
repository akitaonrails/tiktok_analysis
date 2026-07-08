package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.android.editor.track.TrackPanelActionListener;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Ebj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367970Ebj extends AbstractC367990Ebl {
    public final C368000Ebm LJIILLIIL;
    public final ArrayList<C350030Dnt> LJIIZILJ;
    public final String LJIJ;
    public InterfaceC367810EbT LJIJI;
    public final C367930Ebf LJIJJ;
    public final C367940Ebg LJIJJLI;
    public final C367960Ebi LJIL;
    public final C368440EcU LJJ;
    public final C367950Ebh LJJI;
    public final C368020Ebo LJJIFFI;
    public final List<Long> LJJII;

    @Override // X.AbstractC367990Ebl
    public final boolean LIZJ() {
        Typeface typeface = C368130Ebz.LIZ;
        return C368130Ebz.LJ;
    }

    @Override // X.AbstractC367990Ebl
    public final void LJIILJJIL() {
        this.LJIJJ.LJIILJJIL();
        this.LJJIFFI.getClass();
        this.LJIJJLI.getClass();
    }

    @Override // X.AbstractC367990Ebl
    public final void LJIIL() {
        super.LJIIL();
        Typeface typeface = C368130Ebz.LIZ;
    }

    @Override // X.AbstractC367990Ebl
    public final void LIZLLL(Canvas canvas) {
        this.LJIJJ.getClass();
        this.LJJIFFI.LIZLLL(canvas);
        this.LJIJJLI.getClass();
    }

    @Override // X.AbstractC367990Ebl
    public final int LJFF(int i) {
        int i2;
        C368020Ebo c368020Ebo = this.LJJIFFI;
        if (c368020Ebo.LJJJ) {
            i2 = c368020Ebo.LJIL;
        } else {
            i2 = -1;
        }
        if (i <= i2) {
            return super.LJFF(i) + this.LJIIJJI;
        }
        return super.LJFF(i);
    }

    @Override // X.AbstractC367990Ebl
    public final void LJIILIIL(NLETrackSlot nLETrackSlot) {
        Typeface typeface = C368130Ebz.LIZ;
        TrackPanelActionListener trackPanelActionListener = this.LJIILLIIL.getTrackPanelActionListener();
        if (trackPanelActionListener != null) {
            trackPanelActionListener.onMoveFail(nLETrackSlot);
        }
    }

    public final AbstractC367990Ebl LJIJ(int i) {
        if (i >= 0) {
            for (C350030Dnt c350030Dnt : this.LJIIZILJ) {
                if (c350030Dnt.LIZ == i) {
                    switch (C347340DjY.LIZ[c350030Dnt.LIZJ.ordinal()]) {
                        case 1:
                            return this.LJIJJ;
                        case 2:
                            return this.LJJIFFI;
                        case 3:
                            return this.LJIJJLI;
                        case 4:
                            return this.LJIL;
                        case 5:
                            return this.LJJI;
                        case 6:
                            return this.LJJ;
                    }
                }
            }
        }
        return this.LJIJJLI;
    }

    @Override // X.InterfaceC369090EdX
    public final InterfaceC368720Ecw LIZ(int i, C368630Ecn c368630Ecn) {
        return LJIJ(i).LIZ(i, c368630Ecn);
    }

    @Override // X.AbstractC367990Ebl
    public final void LIZIZ(InterfaceC368720Ecw interfaceC368720Ecw, NLETrackSlot nLETrackSlot, int i) {
        AbstractC368550Ecf abstractC368550Ecf;
        InterfaceC367810EbT interfaceC367810EbT;
        AbstractC368550Ecf abstractC368550Ecf2;
        InterfaceC367810EbT interfaceC367810EbT2;
        AbstractC368550Ecf abstractC368550Ecf3;
        InterfaceC367810EbT interfaceC367810EbT3;
        C367760EbO c367760EbO;
        InterfaceC367810EbT interfaceC367810EbT4;
        AbstractC368550Ecf abstractC368550Ecf4;
        InterfaceC367810EbT interfaceC367810EbT5;
        AbstractC367990Ebl abstractC367990EblLJIJ = LJIJ(i);
        if (abstractC367990EblLJIJ instanceof C368020Ebo) {
            if ((interfaceC368720Ecw instanceof C367650EbD) && (abstractC368550Ecf4 = (AbstractC368550Ecf) interfaceC368720Ecw) != null && (interfaceC367810EbT5 = this.LJIJI) != null) {
                ((C367610Eb9) abstractC368550Ecf4.LJIIIZ()).setLabelPainter$editor_trackpanel_release(interfaceC367810EbT5);
            }
        } else if (abstractC367990EblLJIJ instanceof C367930Ebf) {
            if ((interfaceC368720Ecw instanceof C367760EbO) && (c367760EbO = (C367760EbO) interfaceC368720Ecw) != null && (interfaceC367810EbT4 = this.LJIJI) != null) {
                c367760EbO.LLILZ.setLabelPainter$editor_trackpanel_release(interfaceC367810EbT4);
            }
        } else if (abstractC367990EblLJIJ instanceof C367940Ebg) {
            if ((interfaceC368720Ecw instanceof C367800EbS) && (abstractC368550Ecf3 = (AbstractC368550Ecf) interfaceC368720Ecw) != null && (interfaceC367810EbT3 = this.LJIJI) != null) {
                ((C367470Eav) abstractC368550Ecf3.LJIIIZ()).setLabelPainter$editor_trackpanel_release(interfaceC367810EbT3);
                abstractC368550Ecf3.LJIIIZ().invalidate();
            }
        } else if (abstractC367990EblLJIJ instanceof C367960Ebi) {
            if ((interfaceC368720Ecw instanceof C367750EbN) && (abstractC368550Ecf2 = (AbstractC368550Ecf) interfaceC368720Ecw) != null && (interfaceC367810EbT2 = this.LJIJI) != null) {
                ((C367560Eb4) abstractC368550Ecf2.LJIIIZ()).setLabelPainter$editor_trackpanel_release(interfaceC367810EbT2);
                abstractC368550Ecf2.LJIIIZ().invalidate();
            }
        } else if ((abstractC367990EblLJIJ instanceof C368440EcU) && (interfaceC368720Ecw instanceof C368540Ece) && (abstractC368550Ecf = (AbstractC368550Ecf) interfaceC368720Ecw) != null && (interfaceC367810EbT = this.LJIJI) != null) {
            ((C367270Eab) abstractC368550Ecf.LJIIIZ()).setLabelPainter$editor_trackpanel_release(interfaceC367810EbT);
            abstractC368550Ecf.LJIIIZ().invalidate();
        }
        abstractC367990EblLJIJ.LIZIZ(interfaceC368720Ecw, nLETrackSlot, i);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Ebi] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0EcU] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0Ebh] */
    public C367970Ebj(final C19EG c19eg, C368000Ebm c368000Ebm, final C368630Ecn c368630Ecn, final C368680Ecs c368680Ecs, final C369220Edk c369220Edk, final C368450EcV c368450EcV) {
        super(c368630Ecn, c368680Ecs, c369220Edk, c368450EcV);
        this.LJIILLIIL = c368000Ebm;
        this.LJIIZILJ = new ArrayList<>();
        this.LJIJ = "MultiTrackAdapter";
        this.LJIJJ = new C367930Ebf(c19eg, c368630Ecn, c368680Ecs, c369220Edk, c368450EcV);
        this.LJIJJLI = new C367940Ebg(c19eg, c368630Ecn, c368680Ecs, c369220Edk, c368450EcV);
        this.LJIL = new AbstractC367990Ebl(c19eg, c368630Ecn, c368680Ecs, c369220Edk, c368450EcV) { // from class: X.0Ebi
            public final C19EG LJIILLIIL;

            @Override // X.AbstractC367990Ebl
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.InterfaceC369090EdX
            public final void onMove(int i, int i2, NLETrackSlot nLETrackSlot, long j, long j2, long j3, boolean z) {
            }

            @Override // X.InterfaceC369090EdX
            public final InterfaceC368720Ecw LIZ(int i, C368630Ecn c368630Ecn2) {
                return new C367750EbN(this.LJIILLIIL, this.LIZ.getTrackViewModelCompat());
            }

            {
                super(c368630Ecn, c368680Ecs, c369220Edk, c368450EcV);
                this.LJIILLIIL = c19eg;
            }
        };
        this.LJJ = new AbstractC367990Ebl(c19eg, c368630Ecn, c368680Ecs, c369220Edk, c368450EcV) { // from class: X.0EcU
            public final Context LJIILLIIL;

            @Override // X.AbstractC367990Ebl
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.InterfaceC369090EdX
            public final void onMove(int i, int i2, NLETrackSlot nLETrackSlot, long j, long j2, long j3, boolean z) {
            }

            @Override // X.InterfaceC369090EdX
            public final InterfaceC368720Ecw LIZ(int i, C368630Ecn c368630Ecn2) {
                return new C368540Ece(this.LJIILLIIL);
            }

            {
                super(c368630Ecn, c368680Ecs, c369220Edk, c368450EcV);
                this.LJIILLIIL = c19eg;
            }
        };
        this.LJJI = new AbstractC367990Ebl(c368630Ecn, c368680Ecs, c369220Edk, c368450EcV) { // from class: X.0Ebh
            @Override // X.InterfaceC369090EdX
            public final void onMove(int i, int i2, NLETrackSlot nLETrackSlot, long j, long j2, long j3, boolean z) {
            }

            @Override // X.InterfaceC369090EdX
            public final InterfaceC368720Ecw LIZ(int i, C368630Ecn c368630Ecn2) {
                return new C367820EbU(c368630Ecn2.getContext(), this.LIZ.getTrackViewModelCompat());
            }
        };
        this.LJJIFFI = new C368020Ebo(c19eg, c368630Ecn, c368680Ecs, c369220Edk, c368450EcV);
        this.LJJII = new ArrayList();
    }

    @Override // X.InterfaceC369090EdX
    public final void onMove(int i, int i2, NLETrackSlot nLETrackSlot, long j, long j2, long j3, boolean z) {
        String str = this.LJIJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMove from ");
        sbLIZ.append(i);
        sbLIZ.append(" to index ");
        sbLIZ.append(i2);
        sbLIZ.append("  offsetTime ");
        sbLIZ.append(j);
        sbLIZ.append(" currentTime ");
        sbLIZ.append(j2);
        sbLIZ.append(" \n ");
        sbLIZ.append(nLETrackSlot);
        C355090Dw3.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        Typeface typeface = C368130Ebz.LIZ;
        TrackPanelActionListener trackPanelActionListener = this.LJIILLIIL.getTrackPanelActionListener();
        if (trackPanelActionListener != null) {
            long j4 = LSPassThroughRecordSizeConfig.DEFAULT;
            trackPanelActionListener.onMove(i, i2, nLETrackSlot, j * j4, j2 * j4, j3 * j4, z);
        }
    }
}
