package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicFragment;
import com.ss.android.ugc.aweme.shortvideo.ui.TTEPVideoSaveActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.TTEPVideoSaveViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.16Hd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20748716Hd implements InterfaceC19515111Wr {
    public final int $t;
    public Object l0;

    public static final void onCanceled$0(C20748716Hd c20748716Hd) {
    }

    public static final void onCanceled$1(C20748716Hd c20748716Hd) {
    }

    public static final void onCanceled$2(C20748716Hd c20748716Hd) {
    }

    @Override // X.InterfaceC19515111Wr
    public final void LIZ(C0HWO... c0hwoArr) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, c0hwoArr);
                break;
            case 1:
                LIZ$1(this, c0hwoArr);
                break;
            case 2:
                LIZ$2(this, c0hwoArr);
                break;
        }
    }

    @Override // X.InterfaceC19515111Wr
    public final void onCanceled() {
        switch (this.$t) {
            case 0:
                onCanceled$0(this);
                break;
            case 1:
                onCanceled$1(this);
                break;
            case 2:
                onCanceled$2(this);
                break;
        }
    }

    public C20748716Hd(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(final C20748716Hd c20748716Hd, C0HWO... c0hwoArr) {
        if (c0hwoArr.length > 0 && c0hwoArr[0].LIZIZ == EnumC442280HVy.DENIED_PERMANENT) {
            C21566919al c21566919al = new C21566919al(((C20696615ym) c20748716Hd.l0).LIZIZ);
            c21566919al.LIZ(2131826621);
            final int i = 0;
            c21566919al.LJII(R.string.f1_, new DialogInterface.OnClickListener(c20748716Hd, i) { // from class: X.16HG
                public final int $t;
                public Object l0;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    switch (this.$t) {
                        case 0:
                            onClick$0(this, dialogInterface, i2);
                            break;
                        case 1:
                            onClick$1(this, dialogInterface, i2);
                            break;
                    }
                }

                {
                    this.$t = i;
                    this.l0 = c20748716Hd;
                }

                public static final void onClick$0(C16HG c16hg, DialogInterface dialogInterface, int i2) {
                    ((C20696615ym) ((C20748716Hd) c16hg.l0).l0).LIZ.LLJJIJIL();
                }

                public static final void onClick$1(C16HG c16hg, DialogInterface dialogInterface, int i2) {
                    C0W79.LIZLLL(((C20696615ym) ((C20748716Hd) c16hg.l0).l0).LIZIZ);
                }
            }, false);
            final int i2 = 1;
            c21566919al.LJIIJ(R.string.ftf, new DialogInterface.OnClickListener(c20748716Hd, i2) { // from class: X.16HG
                public final int $t;
                public Object l0;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i22) {
                    switch (this.$t) {
                        case 0:
                            onClick$0(this, dialogInterface, i22);
                            break;
                        case 1:
                            onClick$1(this, dialogInterface, i22);
                            break;
                    }
                }

                {
                    this.$t = i2;
                    this.l0 = c20748716Hd;
                }

                public static final void onClick$0(C16HG c16hg, DialogInterface dialogInterface, int i22) {
                    ((C20696615ym) ((C20748716Hd) c16hg.l0).l0).LIZ.LLJJIJIL();
                }

                public static final void onClick$1(C16HG c16hg, DialogInterface dialogInterface, int i22) {
                    C0W79.LIZLLL(((C20696615ym) ((C20748716Hd) c16hg.l0).l0).LIZIZ);
                }
            }, false);
            new C21566519ah(c21566919al).LIZLLL();
        }
    }

    public static final void LIZ$1(C20748716Hd c20748716Hd, C0HWO... c0hwoArr) {
        if (c0hwoArr.length != 0 && c0hwoArr[0].LIZIZ == EnumC442280HVy.GRANTED) {
            ((LocalMusicFragment) c20748716Hd.l0).VR();
        }
    }

    public static final void LIZ$2(C20748716Hd c20748716Hd, C0HWO... c0hwoArr) {
        if (c0hwoArr.length == 0) {
            ((TTEPVideoSaveViewModel) ((TTEPVideoSaveActivity) c20748716Hd.l0).LLILLL.getValue()).vQ2(false);
        } else if (c0hwoArr[0].LIZIZ == EnumC442280HVy.GRANTED) {
            ((TTEPVideoSaveViewModel) ((TTEPVideoSaveActivity) c20748716Hd.l0).LLILLL.getValue()).vQ2(true);
        } else {
            ((TTEPVideoSaveViewModel) ((TTEPVideoSaveActivity) c20748716Hd.l0).LLILLL.getValue()).vQ2(false);
        }
    }
}
