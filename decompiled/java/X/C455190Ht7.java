package X;

import Y.ACListenerS41S0201000_6;
import Y.AObserverS210S0100000_6;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerImage;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS133S0201000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ht7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C455190Ht7 extends ConstraintLayout {
    public final int LL;
    public final List<List<C455230HtB>> LLILLJJLI;
    public final MutableLiveData<Boolean> LLILLL;
    public InterfaceC455210Ht9 LLILZ;
    public View LLILZIL;
    public boolean LLILZLL;
    public final C455230HtB LLIZ;

    public final void e0() {
        Iterator<List<C455230HtB>> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            Iterator<C455230HtB> it3 = it2.next().iterator();
            while (it3.hasNext()) {
                it3.next().setBackground(null);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Iterator<List<C455230HtB>> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            for (C455230HtB c455230HtB : it2.next()) {
                int i = this.LL;
                C1383370m6R.LJIILJJIL(i, i, c455230HtB);
            }
        }
    }

    public final int getDefaultStickerSize() {
        return this.LL;
    }

    public final boolean getNeedPlayAnimation() {
        return this.LLILZLL;
    }

    public final void setEmojiDataList(List<StickerItem> list) {
        StickerImage stickerImage;
        UrlModel urlModel = null;
        this.LLILZIL = null;
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            int i3 = 0;
            do {
                C455230HtB c455230HtB = (C455230HtB) ListProtector.get((List) ListProtector.get(this.LLILLJJLI, i2), i3);
                final int i4 = (i2 * 3) + i3;
                if (i4 >= list.size()) {
                    int visibility = c455230HtB.getVisibility();
                    c455230HtB.setVisibility(4);
                    C1602160rnK.LIZIZ(visibility, 4, c455230HtB);
                } else {
                    int visibility2 = c455230HtB.getVisibility();
                    c455230HtB.setVisibility(i);
                    C1602160rnK.LIZIZ(visibility2, i, c455230HtB);
                    final StickerItem stickerItem = (StickerItem) ListProtector.get(list, i4);
                    StickerBase stickerBase = stickerItem.stickerBase;
                    if (stickerBase != null && (stickerImage = stickerBase.image) != null) {
                        urlModel = new UrlModel();
                        String str = stickerImage.uri;
                        if (str != null) {
                            urlModel.setUri(str);
                        }
                        List<String> list2 = stickerImage.urlList;
                        if (list2 != null) {
                            urlModel.setUrlList(list2);
                        }
                        Integer num = stickerImage.width;
                        if (num != null) {
                            urlModel.setWidth(num.intValue());
                        }
                        Integer num2 = stickerImage.height;
                        if (num2 != null) {
                            urlModel.setHeight(num2.intValue());
                        }
                    }
                    C01GW c01gw = C278850AwN.LIZ;
                    if (((Number) c01gw.getValue()).intValue() != 1 && ((Number) c01gw.getValue()).intValue() != 2) {
                        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
                        c1331670kl3LJIIIIZZ.LIZLLL = true;
                        c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
                        c1331670kl3LJIIIIZZ.LJJ(c455230HtB);
                        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                    } else {
                        Drawable drawableLJJJI = IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJJJI(getContext());
                        if (drawableLJJJI != null) {
                            c455230HtB.getHierarchy().LJIJ(drawableLJJJI, 1);
                        }
                        String callerId = EnumC454500Hs0.STICKER_RECOMMENDATION.getCallerId();
                        int i5 = this.LL;
                        C0I98.LIZJ(c455230HtB, urlModel, "story_reply_sa_quick_tab_aimoji", callerId, i5, i5, 0, 1, null, Bitmap.Config.ARGB_8888, C06TB.STABLE_STICKER.getSpace(), false, false, null, null, null, false, null, 1042112);
                    }
                    this.LLILLL.observe(c455230HtB, new AObserverS210S0100000_6(c455230HtB, 39));
                    if (!this.LLILZLL) {
                        C786410Ut5.V9(c455230HtB, new ACListenerS41S0201000_6(this, stickerItem, i4, 1));
                    } else {
                        c455230HtB.setOnTouchListener(new View.OnTouchListener() { // from class: X.0Ht8
                            @Override // android.view.View.OnTouchListener
                            public final boolean onTouch(View view, MotionEvent motionEvent) {
                                C455230HtB c455230HtB2;
                                int action = motionEvent.getAction();
                                if (action != 0) {
                                    if (action != 1) {
                                        if (action == 3) {
                                            this.LL.LLILZIL = null;
                                        }
                                        return true;
                                    }
                                    if (!Intrinsics.LJFF(this.LL.LLILZIL, view)) {
                                        return true;
                                    }
                                    if ((view instanceof C455230HtB) && (c455230HtB2 = (C455230HtB) view) != null) {
                                        c455230HtB2.setSelect(true);
                                    }
                                    this.LL.LLILLL.postValue(Boolean.TRUE);
                                    int[] iArr = new int[2];
                                    this.LL.LLIZ.getLocationOnScreen(iArr);
                                    int width = iArr[0] + (this.LL.LLIZ.getWidth() / 2);
                                    int height = iArr[1] + (this.LL.LLIZ.getHeight() / 2);
                                    InterfaceC455210Ht9 interfaceC455210Ht9 = this.LL.LLILZ;
                                    if (interfaceC455210Ht9 != null) {
                                        interfaceC455210Ht9.LIZJ();
                                    }
                                    PointF pointF = new PointF(width, height);
                                    PointF pointFLJFF = C0S1K.LIZIZ.LJFF();
                                    if (pointFLJFF == null) {
                                        pointFLJFF = new PointF(0.0f, 0.0f);
                                    }
                                    C455290HtH.LIZJ(view, pointF, pointFLJFF, new AwS133S0201000_6(this.LL, stickerItem, i4, 2));
                                    this.LL.LLILZIL = null;
                                    return true;
                                }
                                C455190Ht7 c455190Ht7 = this.LL;
                                if (c455190Ht7.LLILZIL != null) {
                                    return true;
                                }
                                c455190Ht7.LLILZIL = view;
                                InterfaceC455210Ht9 interfaceC455210Ht92 = c455190Ht7.LLILZ;
                                if (interfaceC455210Ht92 != null) {
                                    interfaceC455210Ht92.LIZ();
                                }
                                C455290HtH.LIZIZ(view).start();
                                return true;
                            }
                        });
                    }
                }
                i3++;
                urlModel = null;
                i = 0;
            } while (i3 < 3);
        }
    }

    public final void setNeedPlayAnimation(boolean z) {
        this.LLILZLL = z;
    }

    public final void setOnEmojiSelected(InterfaceC455210Ht9 interfaceC455210Ht9) {
        this.LLILZ = interfaceC455210Ht9;
    }

    public C455190Ht7(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C455190Ht7(Context context, AttributeSet attributeSet, int i) {
        int iLIZIZ;
        super(context, attributeSet, i);
        Context context2 = C1383370m6R.LIZ;
        if (C497820Jfg.LIZIZ(context2) < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(375))) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        } else if (C497820Jfg.LIZIZ(context2) < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(430))) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88));
        }
        this.LL = iLIZIZ;
        ArrayList arrayList = new ArrayList();
        this.LLILLJJLI = arrayList;
        this.LLILLL = new MutableLiveData<>();
        this.LLILZLL = true;
        ViewGroup.inflate(context, R.layout.cof, this);
        View viewFindViewById = findViewById(R.id.gz2);
        View viewFindViewById2 = findViewById(R.id.gz5);
        View viewFindViewById3 = findViewById(R.id.gz8);
        View viewFindViewById4 = findViewById(R.id.gza);
        View viewFindViewById5 = findViewById(R.id.gzb);
        View viewFindViewById6 = findViewById(R.id.gzc);
        this.LLIZ = (C455230HtB) findViewById(R.id.gzj);
        arrayList.add(C1697810uHb.LJIIJJI(viewFindViewById, viewFindViewById2, viewFindViewById3));
        arrayList.add(C1697810uHb.LJIIJJI(viewFindViewById4, viewFindViewById5, viewFindViewById6));
    }
}
