package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.text.a0;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: renamed from: X.14p0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20381214p0 extends AbstractC960470b6L<C1868380yii> {
    public final InterfaceC20381514p3 LL;
    public final ImageView LLILLJJLI;
    public final C20376014oA LLILLL;
    public final C20376014oA LLILZ;
    public final View LLILZIL;

    public final void L5(final C1868380yii c1868380yii) throws Throwable {
        int i;
        String str;
        String str2;
        String str3 = null;
        C0VSJ c0vsj = null;
        if (!TextUtils.isEmpty(c1868380yii.LIZIZ)) {
            C0JBN c0jbnLIZ = C1819620xS4.LIZ();
            String str4 = c1868380yii.LIZIZ;
            if (str4 != null) {
                c0vsj = new C0VSJ(str4);
            }
            C1324610kZf c1324610kZfLJIIJ = c0jbnLIZ.LJIIJ(c0vsj);
            c1324610kZfLJIIJ.LJIJI(Float.valueOf(C418440Gaw.LIZIZ(12)));
            String str5 = C20399914s1.LLJJIII;
            c1324610kZfLJIIJ.LJIIIZ = R.drawable.fht;
            c1324610kZfLJIIJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
            c1324610kZfLJIIJ.LJJI(this.LLILLJJLI);
        } else {
            C0JBN c0jbnLIZ2 = C1819620xS4.LIZ();
            PlaybookContent playbookContent = c1868380yii.LIZ.content;
            if (playbookContent != null) {
                str3 = playbookContent.coverUrl;
            }
            C1324610kZf c1324610kZfLJIIIZ = c0jbnLIZ2.LJIIIZ(ImageModel.genBy(str3));
            c1324610kZfLJIIIZ.LJIJI(Float.valueOf(C418440Gaw.LIZIZ(12)));
            String str6 = C20399914s1.LLJJIII;
            c1324610kZfLJIIIZ.LJIIIZ = R.drawable.fht;
            c1324610kZfLJIIIZ.LJJI(this.LLILLJJLI);
        }
        C500260Jjc.LJLIIIL(500L, this.LLILLJJLI, new AwS397S0200000_31(this, c1868380yii, 105));
        C20376014oA c20376014oA = this.LLILLL;
        if (C758560TpG.LIZ) {
            i = 200;
        } else {
            i = 40;
        }
        c20376014oA.LIZJ(i);
        c20376014oA.LLJIJIL = true;
        LiveEditText liveEditText = c20376014oA.LLILLL;
        if (liveEditText != null) {
            liveEditText.setMinHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70)));
        }
        LiveEditText liveEditText2 = c20376014oA.LLILLL;
        if (liveEditText2 != null) {
            liveEditText2.setMaxHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70)));
        }
        LiveEditText liveEditText3 = c20376014oA.LLILLL;
        if (liveEditText3 != null) {
            liveEditText3.setMaxLines(3);
        }
        c20376014oA.LIZIZ(C497740JfY.LJIJI(2131854038));
        PlaybookContent playbookContent2 = c1868380yii.LIZ.content;
        String str7 = "";
        if (playbookContent2 == null || (str = playbookContent2.title) == null) {
            str = "";
        }
        c20376014oA.LIZLLL(str);
        LiveEditText liveEditText4 = c20376014oA.LLILLL;
        if (liveEditText4 != null) {
            liveEditText4.LLJI.LJI(R.style.a8x);
        }
        c20376014oA.LLJILJIL = new InterfaceC20376314oD() { // from class: X.14p2
            @Override // X.InterfaceC20376314oD
            public final void LIZ(int i2) {
            }

            @Override // X.InterfaceC20376314oD
            public final void LIZIZ(String str8, boolean z) {
                if (!z) {
                    InterfaceC20381514p3 interfaceC20381514p3 = this.LIZ.LL;
                    Playbook playbook = c1868380yii.LIZ;
                    if (str8 == null) {
                        str8 = "";
                    }
                    interfaceC20381514p3.LIZIZ(playbook, str8);
                }
            }
        };
        C20376014oA c20376014oA2 = this.LLILZ;
        c20376014oA2.LIZJ(200);
        c20376014oA2.LIZIZ(C497740JfY.LJIJI(2131854042));
        PlaybookContent playbookContent3 = c1868380yii.LIZ.content;
        if (playbookContent3 != null && (str2 = playbookContent3.description) != null) {
            str7 = str2;
        }
        c20376014oA2.LIZLLL(str7);
        c20376014oA2.LLJILJIL = new InterfaceC20376314oD() { // from class: X.14p1
            @Override // X.InterfaceC20376314oD
            public final void LIZ(int i2) {
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
            @Override // X.InterfaceC20376314oD
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(java.lang.String r5, boolean r6) {
                /*
                    r4 = this;
                    r3 = 0
                    if (r6 != 0) goto L2c
                    X.14p0 r2 = r4.LIZ
                    r1 = 1
                    if (r5 == 0) goto L26
                    r2.getClass()
                    boolean r0 = kotlin.text.a0.LJJJIL(r5)
                    if (r0 != 0) goto L26
                    android.view.View r0 = r2.LLILZIL
                    X.C500260Jjc.LJLJLJ(r0, r3)
                L16:
                    X.14p0 r0 = r4.LIZ
                    X.14p3 r1 = r0.LL
                    X.0yii r0 = r2
                    webcast.data.multi_guest_play.Playbook r0 = r0.LIZ
                    if (r5 != 0) goto L22
                    java.lang.String r5 = ""
                L22:
                    r1.LIZ(r0, r5)
                    return
                L26:
                    android.view.View r0 = r2.LLILZIL
                    X.C500260Jjc.LJLJLJ(r0, r1)
                    goto L16
                L2c:
                    X.14p0 r0 = r4.LIZ
                    android.view.View r0 = r0.LLILZIL
                    X.C500260Jjc.LJLJLJ(r0, r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C20381314p1.LIZIZ(java.lang.String, boolean):void");
            }
        };
        String editable = this.LLILZ.getEditable();
        if (editable != null && !a0.LJJJIL(editable)) {
            C500260Jjc.LJLJLJ(this.LLILZIL, false);
        } else {
            C500260Jjc.LJLJLJ(this.LLILZIL, true);
        }
    }

    public C20381214p0(View view, InterfaceC20381514p3 interfaceC20381514p3) {
        super(view);
        this.LL = interfaceC20381514p3;
        this.LLILLJJLI = (ImageView) view.findViewById(R.id.ll7);
        this.LLILLL = (C20376014oA) view.findViewById(R.id.tv_title);
        this.LLILZ = (C20376014oA) view.findViewById(R.id.zhs);
        this.LLILZIL = view.findViewById(R.id.nzu);
    }

    @Override // X.AbstractC960470b6L
    public final /* bridge */ /* synthetic */ void I5(int i, Object obj) throws Throwable {
        L5((C1868380yii) obj);
    }
}
