package X;

import android.graphics.Rect;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AXK, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AXK extends C09AY implements Function0<C1AY4> {
    public final /* synthetic */ C2180891AWx LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AXK(C2180891AWx c2180891AWx) {
        super(0);
        this.LL = c2180891AWx;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1AY4 invoke() {
        if (!this.LL.getProvider().LJJJZ()) {
            final C1AY8 c1ay8 = new C1AY8(this.LL);
            return new C1AY4(c1ay8) { // from class: X.1AXH
                public final Function1<String, Unit> LIZ;

                @Override // X.C1AY4
                public final void LIZ(Rect rect) {
                }

                @Override // X.C1AY4
                public final void LIZJ(int i, int i2, C1AX3 c1ax3) {
                }

                @Override // X.C1AY4
                public final void LIZLLL(Rect rect, boolean z) {
                }

                {
                    this.LIZ = c1ay8;
                }

                @Override // X.C1AY4
                public final Rect LIZIZ(Rect rect, Rect rect2) {
                    Rect rect3 = new Rect();
                    int i = rect.left + rect2.left;
                    rect3.left = i;
                    rect3.top = rect.top + rect2.top;
                    rect3.right = i + rect.width();
                    rect3.bottom = rect3.top + rect.height();
                    return rect3;
                }

                @Override // X.C1AY4
                public final void LJ(int i, int i2, C1AX3 c1ax3, FrameLayout.LayoutParams layoutParams, Rect rect, int i3) {
                    c1ax3.LIZ.LIZ().LIZ(layoutParams);
                    int i4 = layoutParams.leftMargin;
                    int i5 = layoutParams.topMargin;
                    Rect rect2 = new Rect(i4, i5, layoutParams.width + i4, layoutParams.height + i5);
                    C1AXG c1axgLIZ = c1ax3.LIZ.LIZ();
                    LIZIZ(rect2, rect);
                    c1axgLIZ.LIZIZ();
                }
            };
        }
        C2180891AWx c2180891AWx = this.LL;
        final C1AXO c1axo = c2180891AWx.LLIZ;
        final C1AYA c1aya = new C1AYA(c2180891AWx);
        return new C1AY4(c1axo, c1aya) { // from class: X.1AXL
            public final C1AXO LIZ;
            public final Function1<String, Unit> LIZIZ;
            public boolean LIZJ;
            public Rect LIZLLL;

            public final boolean LJI() {
                Integer numIsOverlay;
                C1AXO c1axo2 = this.LIZ;
                Layout layoutLIZ = c1axo2.LIZ(false);
                if (layoutLIZ == null || (numIsOverlay = layoutLIZ.isOverlay()) == null) {
                    return c1axo2.LJII();
                }
                int iIntValue = numIsOverlay.intValue();
                C1AZW c1azw = C1AZW.LIZ;
                String strLJIIIIZZ = C1AXO.LJIIIIZZ(52);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("isOverlay = ");
                sbLIZ.append(iIntValue);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c1azw.getClass();
                C1AZW.LIZ(strLJIIIIZZ, strLIZIZ, null, null);
                if (iIntValue == 0) {
                    return false;
                }
                if (iIntValue != 1) {
                    return c1axo2.LJII();
                }
                return true;
            }

            @Override // X.C1AY4
            public final void LIZ(Rect rect) {
                this.LIZLLL = rect;
            }

            public final void LJII(String str) {
                Function1<String, Unit> function1 = this.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("error: ");
                sbLIZ.append(str);
                function1.invoke(C2188811AlT.LIZIZ(sbLIZ));
                C1CC2.LIZ(str, new Throwable());
            }

            {
                this.LIZ = c1axo;
                this.LIZIZ = c1aya;
            }

            @Override // X.C1AY4
            public final Rect LIZIZ(Rect rect, Rect rect2) {
                Rect rect3;
                Rect rect4 = new Rect();
                if (this.LIZJ && (rect3 = this.LIZLLL) != null) {
                    rect2 = rect3;
                }
                rect4.left = rect2.left;
                rect4.top = rect2.top;
                rect4.right = rect2.right;
                rect4.bottom = rect2.bottom;
                return rect4;
            }

            @Override // X.C1AY4
            public final void LIZLLL(Rect rect, boolean z) {
                this.LIZJ = z;
                this.LIZLLL = rect;
            }

            @Override // X.C1AY4
            public final void LIZJ(int i, int i2, C1AX3 c1ax3) {
                VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
                videoMixerDescription.setVisibility(false);
                LJFF(videoMixerDescription, c1ax3, i2);
                Function1<String, Unit> function1 = this.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("remove layer view pos = ");
                sbLIZ.append(i);
                sbLIZ.append(", server pos = ");
                sbLIZ.append(i2);
                function1.invoke(C2188811AlT.LIZIZ(sbLIZ));
            }

            public final void LJFF(VideoMixer.VideoMixerDescription videoMixerDescription, C1AX3 c1ax3, int i) {
                InterfaceC1268870j7l interfaceC1268870j7l;
                WeakReference<InterfaceC1268870j7l> weakReference = c1ax3.LIZ.LJFF;
                if (weakReference != null && (interfaceC1268870j7l = weakReference.get()) != null) {
                    interfaceC1268870j7l.LIZJ(videoMixerDescription);
                    return;
                }
                String str = this.LIZ.LIZ.LLJJJ.linkMicId;
                String str2 = c1ax3.LIZ.LIZJ;
                if ((str == null || str.length() == 0 || str2 == null || str2.length() == 0 || !Intrinsics.LJFF(str, str2)) && i != 0) {
                    String str3 = c1ax3.LIZ.LIZJ;
                    if (str3 != null) {
                        InterfaceC1268870j7l interfaceC1268870j7lLJJLL = this.LIZ.LIZ.LL.LJFF.LJJLL(str3);
                        if (interfaceC1268870j7lLJJLL != null) {
                            interfaceC1268870j7lLJJLL.LIZJ(videoMixerDescription);
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("cannot find local layer for other ");
                            sbLIZ.append(i);
                            LJII(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                    Function1<String, Unit> function1 = this.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("cannot find layer for user ");
                    sbLIZ2.append(i);
                    function1.invoke(C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                InterfaceC1268870j7l interfaceC1268870j7lLJJLIIIJLJLI = this.LIZ.LIZ.LL.LJFF.LJJLIIIJLJLI();
                if (interfaceC1268870j7lLJJLIIIJLJLI != null) {
                    interfaceC1268870j7lLJJLIIIJLJLI.LIZJ(videoMixerDescription);
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("cannot find local layer for owner ");
                sbLIZ3.append(i);
                LJII(C2188811AlT.LIZIZ(sbLIZ3));
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
            @Override // X.C1AY4
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJ(int r9, int r10, X.C1AX3 r11, android.widget.FrameLayout.LayoutParams r12, android.graphics.Rect r13, int r14) {
                /*
                    r8 = this;
                    boolean r0 = r8.LIZJ
                    if (r0 == 0) goto L9e
                    android.graphics.Rect r5 = r8.LIZLLL
                    if (r5 == 0) goto L9e
                L8:
                    int r1 = r5.width()
                    int r6 = r5.height()
                    java.lang.String r3 = ", server pos = "
                    java.lang.String r2 = "add layer view pos = "
                    if (r6 <= 0) goto La1
                    if (r1 <= 0) goto La1
                    android.graphics.RectF r4 = new android.graphics.RectF
                    r4.<init>()
                    int r7 = r13.left
                    int r0 = r5.left
                    int r7 = r7 - r0
                    float r7 = (float) r7
                    int r0 = r12.leftMargin
                    float r0 = (float) r0
                    float r7 = r7 + r0
                    float r1 = (float) r1
                    float r7 = r7 / r1
                    r4.left = r7
                    int r0 = r12.width
                    float r0 = (float) r0
                    float r0 = r0 / r1
                    float r7 = r7 + r0
                    r4.right = r7
                    int r1 = r13.top
                    int r0 = r5.top
                    int r1 = r1 - r0
                    float r5 = (float) r1
                    int r0 = r12.topMargin
                    float r0 = (float) r0
                    float r5 = r5 + r0
                    float r1 = (float) r6
                    float r5 = r5 / r1
                    r4.top = r5
                    int r0 = r12.height
                    float r0 = (float) r0
                    float r0 = r0 / r1
                    float r5 = r5 + r0
                    r4.bottom = r5
                    com.ss.ttlivestreamer.core.mixer.VideoMixer$VideoMixerDescription r1 = new com.ss.ttlivestreamer.core.mixer.VideoMixer$VideoMixerDescription
                    r1.<init>()
                    float r0 = r4.left
                    r1.setLeft(r0)
                    float r0 = r4.right
                    r1.setRight(r0)
                    float r0 = r4.top
                    r1.setTop(r0)
                    float r0 = r4.bottom
                    r1.setBottom(r0)
                    r0 = 1
                    r1.setVisibility(r0)
                    r0 = 2
                    r1.setMode(r0)
                    if (r9 != 0) goto L9b
                    boolean r0 = r8.LJI()
                    if (r0 == 0) goto L92
                    r0 = 100
                L72:
                    r1.setzOrder(r0)
                    r8.LJFF(r1, r11, r10)
                    kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r1 = r8.LIZIZ
                    java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
                    r0.append(r2)
                    r0.append(r9)
                    r0.append(r3)
                    r0.append(r10)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
                    r1.invoke(r0)
                    return
                L92:
                    boolean r0 = r8.LJI()
                    if (r0 != 0) goto L9b
                    r0 = 200(0xc8, float:2.8E-43)
                    goto L72
                L9b:
                    r0 = 150(0x96, float:2.1E-43)
                    goto L72
                L9e:
                    r5 = r13
                    goto L8
                La1:
                    kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r4 = r8.LIZIZ
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    r1.append(r2)
                    r1.append(r9)
                    r1.append(r3)
                    r1.append(r10)
                    java.lang.String r0 = ", player rect is 0"
                    r1.append(r0)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                    r4.invoke(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1AXL.LJ(int, int, X.1AX3, android.widget.FrameLayout$LayoutParams, android.graphics.Rect, int):void");
            }
        };
    }
}
