package X;

import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.cover.PlaybookEditorCoverDialogV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderAllListSheetFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicViewV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.16H0, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16H0 extends AbstractC712240Rwk {
    public final int $t;
    public Object l0;

    public static final void onPageScrolled$0(C16H0 c16h0, int i, float f, int i2) {
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 0:
                onPageScrollStateChanged$0(this, i);
                break;
            case 5:
                onPageScrollStateChanged$1(this, i);
                break;
            default:
                super.onPageScrollStateChanged(i);
                break;
        }
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageScrolled(int i, float f, int i2) {
        if (5 - this.$t != 0) {
            super.onPageScrolled(i, f, i2);
        } else {
            onPageScrolled$0(this, i, f, i2);
        }
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                break;
            case 1:
                onPageSelected$1(this, i);
                break;
            case 2:
                onPageSelected$2(this, i);
                break;
            case 3:
                onPageSelected$3(this, i);
                break;
            case 4:
                onPageSelected$4(this, i);
                break;
            case 5:
                onPageSelected$5(this, i);
                break;
            case 6:
                onPageSelected$6(this, i);
                break;
            case 7:
                onPageSelected$7(this, i);
                break;
            default:
                super.onPageSelected(i);
                break;
        }
    }

    public C16H0(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageScrollStateChanged$0(C16H0 c16h0, int i) {
        if (i == 0) {
            ((C20632315oP) c16h0.l0).LJII();
        }
    }

    public static final void onPageScrollStateChanged$1(C16H0 c16h0, int i) {
        VerticalMusicViewV2 verticalMusicViewV2 = (VerticalMusicViewV2) c16h0.l0;
        int i2 = verticalMusicViewV2.LLJJJJJIL;
        verticalMusicViewV2.LLJJJJ = i2;
        verticalMusicViewV2.LLJJJJJIL = i;
        if ((i2 | 2) > 0 && i == 1) {
            C155H c155h = verticalMusicViewV2.LLIZ;
            if (c155h == null) {
                c155h = null;
            }
            c155h.LJIILIIL.LJIILLIIL(verticalMusicViewV2.LLLF.getStringValue());
        }
    }

    public static final void onPageSelected$0(C16H0 c16h0, int i) {
        C20632315oP c20632315oP = (C20632315oP) c16h0.l0;
        if (c20632315oP.LLILZ != i) {
            c20632315oP.LLILZ = i;
            c20632315oP.LLJJIJIL.LIZIZ();
        }
    }

    public static final void onPageSelected$1(C16H0 c16h0, int i) {
        ((C20632315oP) c16h0.l0).clearFocus();
        if (((C20632315oP) c16h0.l0).hasFocus()) {
            ((C20632315oP) c16h0.l0).LLJI.requestFocus(2);
        }
    }

    public static final void onPageSelected$2(C16H0 c16h0, int i) {
        ((AnchorTextHeaderAllListSheetFragment) c16h0.l0).zS(i);
    }

    public static final void onPageSelected$3(C16H0 c16h0, int i) {
        C1203130hPj c1203130hPj = ((C20449314zz) c16h0.l0).LLILZLL;
        if (c1203130hPj != null) {
            c1203130hPj.LIZ(i, true, C1203200hPq.LIZ);
        }
        C154N c154n = ((C20449314zz) c16h0.l0).LLJI;
        if (c154n != null) {
            c154n.LJIJJ();
        }
        C20449314zz c20449314zz = (C20449314zz) c16h0.l0;
        c20449314zz.LLJI = (C154N) ListProtector.get(c20449314zz.LLIZLLLIL, i);
        C154N c154n2 = ((C20449314zz) c16h0.l0).LLJI;
        if (c154n2 != null) {
            c154n2.LJIJI();
        }
    }

    public static final void onPageSelected$4(C16H0 c16h0, int i) {
        Function1 function1 = (Function1) c16h0.l0;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
    }

    public static final void onPageSelected$5(C16H0 c16h0, int i) {
        VerticalMusicViewV2 verticalMusicViewV2 = (VerticalMusicViewV2) c16h0.l0;
        int i2 = verticalMusicViewV2.LLJJJJJIL;
        if (i2 != 0) {
            if (i2 != 2 || verticalMusicViewV2.LLJJJJ != 0) {
                verticalMusicViewV2.LJJJLZIJ(i, true, true);
            }
        }
    }

    public static final void onPageSelected$6(C16H0 c16h0, int i) {
        PlaybookEditorCoverDialogV2 playbookEditorCoverDialogV2 = (PlaybookEditorCoverDialogV2) c16h0.l0;
        if (playbookEditorCoverDialogV2.LLLLII) {
            playbookEditorCoverDialogV2.LLLLII = false;
        } else {
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            C978360bZC.LJIJ("change_cover", "slide", playbookEditorCoverDialogV2.LLLF.invoke(), ((PlaybookEditorCoverDialogV2) c16h0.l0).LLLFF.invoke(), ((PlaybookEditorCoverDialogV2) c16h0.l0).LLLFFI.invoke().booleanValue(), null, null);
        }
        List<? extends View> list = ((PlaybookEditorCoverDialogV2) c16h0.l0).LLLIZZ;
        if (list != null) {
            ArrayList arrayList = (ArrayList) list;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setSelected(false);
            }
            if (i >= 0 && i < arrayList.size()) {
                ((View) ListProtector.get(list, i)).setSelected(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onPageSelected$7(X.C16H0 r8, int r9) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16H0.onPageSelected$7(X.16H0, int):void");
    }
}
