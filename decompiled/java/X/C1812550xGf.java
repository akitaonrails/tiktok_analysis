package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary.AiSummaryViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.RichTextPreviewView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAISummaryBoardSetting;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.ImageContent;
import com.bytedance.android.livesdk.model.SceneryContent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xGf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1812550xGf {
    public final View LIZ;
    public final C19R6 LIZIZ;
    public final C19R6 LIZJ;
    public final C0GZW LIZLLL;
    public final RichTextPreviewView LJ;
    public final TuxIconView LJFF;
    public final C197039127h LJI;
    public C1812850xH9 LJII;
    public C11JF LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1812550xGf)) {
            return false;
        }
        C1812550xGf c1812550xGf = (C1812550xGf) obj;
        return Intrinsics.LJFF(this.LIZ, c1812550xGf.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1812550xGf.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1812550xGf.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1812550xGf.LIZLLL) && Intrinsics.LJFF(this.LJ, c1812550xGf.LJ) && Intrinsics.LJFF(this.LJFF, c1812550xGf.LJFF) && Intrinsics.LJFF(this.LJI, c1812550xGf.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        TuxIconView tuxIconView = this.LJFF;
        int iHashCode2 = (iHashCode + (tuxIconView == null ? 0 : tuxIconView.hashCode())) * 31;
        C197039127h c197039127h = this.LJI;
        return iHashCode2 + (c197039127h != null ? c197039127h.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AiSummaryBoardViewHolder(itemView=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", background=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", foreground=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sceneryImage=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", titleView=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", modifyButton=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", useButton=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZIZ() {
        C500260Jjc.LJIILLIIL(this.LIZ);
    }

    public final void LIZ(final InterfaceC497601wk interfaceC497601wk, final AiSummaryViewModel aiSummaryViewModel, final C1812850xH9 c1812850xH9, boolean z, final int i, final boolean z2) {
        C500260Jjc.LLFFF(this.LIZ);
        final Board board = c1812850xH9.LIZLLL;
        if (board != null) {
            ImageModel imageModel = (ImageModel) C13LP.LJJJLZIJ(0, board.previewImageList);
            if (imageModel != null) {
                C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
                c1324610kZfLJIIIZ.LJJ = Boolean.FALSE;
                c1324610kZfLJIIIZ.LJJI(this.LIZIZ);
                if (C497740JfY.LJJ()) {
                    C786410Ut5.ec(this.LIZIZ);
                }
            }
            ImageModel imageModel2 = (ImageModel) C13LP.LJJJLZIJ(1, board.previewImageList);
            if (imageModel2 != null) {
                C1324610kZf c1324610kZfLJIIIZ2 = C1819620xS4.LIZ().LJIIIZ(imageModel2);
                c1324610kZfLJIIIZ2.LJJ = Boolean.FALSE;
                c1324610kZfLJIIIZ2.LJJI(this.LIZJ);
                if (C497740JfY.LJJ()) {
                    C786410Ut5.ec(this.LIZJ);
                }
            }
            HandlerHook.viewPost(this.LIZ, new Runnable() { // from class: X.0xHS
                public final void LIZ() {
                    final ImageContent imageContent;
                    BoardItem next;
                    SceneryContent sceneryContent;
                    this.LL.LJ.h0(board, interfaceC497601wk, -1, c1812850xH9.LJ, "ai_summary_panel");
                    Iterator<BoardItem> it2 = board.boardItemList.iterator();
                    while (true) {
                        imageContent = null;
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it2.next();
                            if (next.boardItemType == 6) {
                                break;
                            }
                        }
                    }
                    BoardItem boardItem = next;
                    if (boardItem != null && (sceneryContent = boardItem.sceneryContent) != null) {
                        imageContent = sceneryContent.imageContent;
                    }
                    C0GZW.LJIIIIZZ(this.LL.LIZLLL);
                    if (imageContent != null) {
                        SceneryContent sceneryContent2 = boardItem.sceneryContent;
                        if (sceneryContent2 == null || sceneryContent2.sceneryType != 3) {
                            this.LL.LIZLLL.LIZLLL(true);
                            C1812550xGf c1812550xGf = this.LL;
                            C500260Jjc.LJJZ((int) (((double) c1812550xGf.LIZ.getHeight()) * 0.25d), c1812550xGf.LIZLLL);
                        } else {
                            C1812550xGf c1812550xGf2 = this.LL;
                            C500260Jjc.LJJZ(c1812550xGf2.LIZ.getHeight(), c1812550xGf2.LIZLLL);
                            this.LL.LIZLLL.LIZLLL(false);
                        }
                        final C1812550xGf c1812550xGf3 = this.LL;
                        c1812550xGf3.getClass();
                        Bitmap bitmap = imageContent.LIZ;
                        if (bitmap != null) {
                            C0GZW c0gzw = c1812550xGf3.LIZLLL;
                            c0gzw.setImageDrawable(new BitmapDrawable(c0gzw.getResources(), bitmap));
                        } else {
                            C11JF c11jf = c1812550xGf3.LJIIIIZZ;
                            if (c11jf != null && !c11jf.isDisposed() && c11jf != null) {
                                c11jf.dispose();
                            }
                            c1812550xGf3.LJIIIIZZ = (C11JF) C1121670fIL.LJ(imageContent.image).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0xHT
                                @Override // X.C09JN
                                public final void accept(Object obj) {
                                    BitmapDrawable bitmapDrawable;
                                    C1C7U.LIZ("AiSummaryBoardViewHolder@d1cf.updateBackgroundImage$3");
                                    Bitmap bitmap2 = (Bitmap) obj;
                                    imageContent.LIZ = bitmap2;
                                    C0GZW c0gzw2 = c1812550xGf3.LIZLLL;
                                    if (bitmap2 != null) {
                                        bitmapDrawable = new BitmapDrawable(c0gzw2.getResources(), bitmap2);
                                    } else {
                                        bitmapDrawable = null;
                                    }
                                    c0gzw2.setImageDrawable(bitmapDrawable);
                                    C1C7U.LIZIZ("AiSummaryBoardViewHolder@d1cf.updateBackgroundImage$3");
                                }
                            }, new C09JN() { // from class: X.00MM
                                @Override // X.C09JN
                                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                    C1C7U.LIZ("AiSummaryBoardViewHolder@d1cf.updateBackgroundImage$4");
                                    C1C7U.LIZIZ("AiSummaryBoardViewHolder@d1cf.updateBackgroundImage$4");
                                }
                            });
                        }
                        C0GZW c0gzw2 = this.LL.LIZLLL;
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gzw2);
                        c0gzw2.setTranslationY(-((c1812850xH9.LJ / 100.0f) * C14KS.LIZLLL() * ((this.LL.LIZ.getHeight() * 1.0f) / C497740JfY.LJIIZILJ())));
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AiSummaryBoardViewHolder@d1cf.bind$1$3");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AiSummaryBoardViewHolder@d1cf.bind$1$3");
                }
            });
        }
        if (!z && LiveAISummaryBoardSetting.INSTANCE.previewKeepOldStyle()) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0xGd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AiSummaryViewModel aiSummaryViewModel2 = aiSummaryViewModel;
                    C1812850xH9 c1812850xH92 = c1812850xH9;
                    int i2 = C768850UDz.LIZ[C497700JfU.LIZ.LIZ().ordinal()];
                    int i3 = 1;
                    if (i2 != 1) {
                        i3 = 2;
                        if (i2 != 2) {
                            i3 = 0;
                        }
                    }
                    aiSummaryViewModel2.vQ2(new C1812270xGD(c1812850xH92, i3));
                    aiSummaryViewModel.vQ2(new C1812240xGA(new C1812750xGz(c1812850xH9, "click", "display", "design_2", "small", i)));
                }
            }, this.LIZ);
        }
        C197039127h c197039127h = this.LJI;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new View.OnClickListener() { // from class: X.0xGZ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    aiSummaryViewModel.vQ2(new C1812480xGY(c1812850xH9, null, z2));
                    aiSummaryViewModel.vQ2(new C1812240xGA(new C1812750xGz(c1812850xH9, "click", "use", "design_2", "small", i)));
                }
            });
        }
        TuxIconView tuxIconView = this.LJFF;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new View.OnClickListener() { // from class: X.0xGC
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    aiSummaryViewModel.vQ2(new C1812250xGB(c1812850xH9));
                    aiSummaryViewModel.vQ2(new C1812240xGA(new C1812750xGz(c1812850xH9, "click", "edit", "design_2", "small", i)));
                }
            });
        }
        this.LJII = c1812850xH9;
    }

    public C1812550xGf(View view, C19R6 c19r6, C19R6 c19r62, C0GZW c0gzw, RichTextPreviewView richTextPreviewView, TuxIconView tuxIconView, C197039127h c197039127h) {
        this.LIZ = view;
        this.LIZIZ = c19r6;
        this.LIZJ = c19r62;
        this.LIZLLL = c0gzw;
        this.LJ = richTextPreviewView;
        this.LJFF = tuxIconView;
        this.LJI = c197039127h;
        c19r6.setBackgroundColor(C20736316Cj.LIZIZ(R.attr.ey_, view.getContext()));
    }
}
