package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.attributionlink.model.AttributionLinkShareFormat;
import com.ss.android.ugc.aweme.attributionlink.model.AttributionLinkStickerStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.attributionlink.AttributionLinkScenario;
import com.ss.android.ugc.aweme.tools.sticker.core.attributionlink.AttributionLinkStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.11l4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19592411l4 extends AbstractC19589811ke<AttributionLinkStickerModel> {
    public Aweme LJFF;
    public C705930RmZ LJI;

    @Override // X.AbstractC19589811ke
    public final InterfaceC19592111l1<?> LIZJ() {
        return new C19592611l6(LJ().LIZLLL, LJ(), this.LJFF, this.LJI, 6);
    }

    @Override // X.AbstractC19589811ke
    public final void LIZ(View view) {
        final C19592611l6 c19592611l6;
        String title;
        Integer numValueOf;
        Pair pair;
        InteractStickerStruct interactStickerStruct;
        final ViewGroup viewGroup;
        List<InteractStickerStruct> interactStickerStructs;
        InteractStickerStruct next;
        Integer numValueOf2 = null;
        if ((view instanceof C19592611l6) && (c19592611l6 = (C19592611l6) view) != null) {
            final NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
            float fLongValue = 0.0f;
            normalTrackTimeStamp.setStartTime(0.0f);
            Function0<Long> function0 = LJ().LJII;
            if (function0 != null) {
                fLongValue = function0.invoke().longValue();
            }
            normalTrackTimeStamp.setEndTime(fLongValue);
            normalTrackTimeStamp.setScale(Float.valueOf(1.0f));
            AttributionLinkStickerStruct attributionLinkStickerStruct = LJFF().getAttributionLinkStickerStruct();
            if (attributionLinkStickerStruct == null || (title = attributionLinkStickerStruct.getTitle()) == null) {
                title = "";
            }
            View viewSd = C786410Ut5.Sd(R.layout.d1w, C786410Ut5.ne(c19592611l6.getContext()), null);
            ((TextView) viewSd.findViewById(R.id.title)).setText(title);
            viewSd.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            Pair pair2 = new Pair(Integer.valueOf(viewSd.getMeasuredWidth()), Integer.valueOf(viewSd.getMeasuredHeight()));
            final int iIntValue = ((Number) pair2.getFirst()).intValue();
            final int iIntValue2 = ((Number) pair2.getSecond()).intValue();
            C19593311lD c19593311lD = AttributionLinkShareFormat.Companion;
            AttributionLinkStickerStruct attributionLinkStickerStruct2 = LJFF().getAttributionLinkStickerStruct();
            if (attributionLinkStickerStruct2 != null) {
                numValueOf = Integer.valueOf(attributionLinkStickerStruct2.getShareFormat());
            } else {
                numValueOf = null;
            }
            c19593311lD.getClass();
            int i = C19592911l9.LIZIZ[C19593311lD.LIZ(numValueOf).ordinal()];
            if (i != 1) {
                if (i == 2) {
                    Aweme aweme = this.LJFF;
                    if (aweme != null && (interactStickerStructs = aweme.getInteractStickerStructs()) != null) {
                        Iterator<InteractStickerStruct> it2 = interactStickerStructs.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (next.getType() == 19) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        interactStickerStruct = next;
                    } else {
                        interactStickerStruct = null;
                    }
                    C19591311kt.LIZ.getClass();
                    final NormalTrackTimeStamp normalTrackTimeStampLJ = C19591311kt.LJ(interactStickerStruct);
                    if (normalTrackTimeStampLJ != null) {
                        final int i2 = LJ().LIZJ.LIZ;
                        final int i3 = LJ().LIZJ.LIZIZ;
                        ViewParent parent = LJ().LIZIZ.getParent();
                        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                            HandlerHook.viewPost(viewGroup, new Runnable() { // from class: X.11l0
                                public final void LIZ() {
                                    Float fValueOf;
                                    Float fValueOf2;
                                    int height = viewGroup.getHeight() > 0 ? viewGroup.getHeight() : i3;
                                    int width = viewGroup.getWidth() > 0 ? viewGroup.getWidth() : i2;
                                    float f = 2;
                                    float width2 = (((normalTrackTimeStampLJ.getWidth() * width) - iIntValue) / f) + C19592611l6.LLJILJIL;
                                    float height2 = ((normalTrackTimeStampLJ.getHeight() / f) * height) + C19592611l6.LLJIJIL + (iIntValue2 / 2);
                                    double radians = Math.toRadians(normalTrackTimeStampLJ.getRotation());
                                    double d = height2;
                                    double d2 = width2;
                                    double x = ((double) normalTrackTimeStampLJ.getX()) + (((Math.sin(radians) * d) - (Math.cos(radians) * d2)) / ((double) width));
                                    double y = ((double) normalTrackTimeStampLJ.getY()) - (((Math.sin(radians) * d2) + (Math.cos(radians) * d)) / ((double) height));
                                    NormalTrackTimeStamp normalTrackTimeStamp2 = normalTrackTimeStamp;
                                    float f2 = (float) x;
                                    this.getClass();
                                    if (Math.abs(f2) > Float.MAX_VALUE || 1 == 0 || (fValueOf = Float.valueOf(f2)) == null) {
                                        return;
                                    }
                                    normalTrackTimeStamp2.setX(fValueOf.floatValue());
                                    NormalTrackTimeStamp normalTrackTimeStamp3 = normalTrackTimeStamp;
                                    float f3 = (float) y;
                                    this.getClass();
                                    if (Math.abs(f3) > Float.MAX_VALUE || (fValueOf2 = Float.valueOf(f3)) == null) {
                                        return;
                                    }
                                    normalTrackTimeStamp3.setY(fValueOf2.floatValue());
                                    normalTrackTimeStamp.setRotation(normalTrackTimeStampLJ.getRotation());
                                    C19591311kt c19591311kt = C19591311kt.LIZ;
                                    InteractStickerStruct interactStickerStructLJFF = this.LJFF();
                                    List listSingletonList = Collections.singletonList(normalTrackTimeStamp);
                                    c19591311kt.getClass();
                                    C19591311kt.LJIIIZ(interactStickerStructLJFF, listSingletonList);
                                    C19592211l2 c19592211l2LIZIZ = C19591311kt.LIZIZ(this.LJ(), this.LJFF());
                                    C19592611l6 c19592611l62 = c19592611l6;
                                    C19592411l4 c19592411l4 = this;
                                    float f4 = c19592211l2LIZIZ.LIZ;
                                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19592611l62);
                                    c19592611l62.setTranslationX(f4);
                                    float f5 = c19592211l2LIZIZ.LIZIZ;
                                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19592611l62);
                                    c19592611l62.setTranslationY(f5);
                                    float f6 = c19592211l2LIZIZ.LIZLLL * c19592411l4.LJ().LIZJ.LIZJ;
                                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19592611l62);
                                    c19592611l62.setScaleY(f6);
                                    float f7 = c19592211l2LIZIZ.LIZLLL * c19592411l4.LJ().LIZJ.LIZJ;
                                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19592611l62);
                                    c19592611l62.setScaleX(f7);
                                    float f8 = c19592211l2LIZIZ.LIZJ;
                                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19592611l62);
                                    c19592611l62.setRotation(f8);
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("AttributionLinkStickerConsumeComponent@3038.updateLocation$1$1");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("AttributionLinkStickerConsumeComponent@3038.updateLocation$1$1");
                                }
                            });
                        }
                    }
                }
            } else {
                int i4 = LJ().LIZJ.LIZ;
                int i5 = LJ().LIZJ.LIZIZ;
                C19593411lE c19593411lE = EnumC19593011lA.Companion;
                AttributionLinkStickerStruct attributionLinkStickerStruct3 = LJFF().getAttributionLinkStickerStruct();
                if (attributionLinkStickerStruct3 != null) {
                    numValueOf2 = Integer.valueOf(attributionLinkStickerStruct3.getMediaSize());
                }
                c19593411lE.getClass();
                int i6 = C19592911l9.LIZ[C19593411lE.LIZ(numValueOf2).ordinal()];
                if (i6 != 1) {
                    if (i6 == 2) {
                        pair = new Pair(Double.valueOf(((double) i4) * 0.72d), Double.valueOf(((double) i5) * 0.19d));
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    pair = new Pair(Double.valueOf(((double) i4) * 0.56d), Double.valueOf(((double) i5) * 0.25d));
                }
                double dDoubleValue = ((Number) pair.getFirst()).doubleValue();
                double d = i4;
                double dDoubleValue2 = (((Number) pair.getSecond()).doubleValue() - ((double) C19592611l6.LLJIJIL)) - ((double) (iIntValue2 / 2));
                normalTrackTimeStamp.setX((float) ((((d - dDoubleValue) + ((double) iIntValue)) / ((double) 2)) / d));
                normalTrackTimeStamp.setY((float) (dDoubleValue2 / ((double) i5)));
                C19591311kt c19591311kt = C19591311kt.LIZ;
                InteractStickerStruct interactStickerStructLJFF = LJFF();
                List listSingletonList = Collections.singletonList(normalTrackTimeStamp);
                c19591311kt.getClass();
                C19591311kt.LJIIIZ(interactStickerStructLJFF, listSingletonList);
            }
        }
        C19591911kz.LIZ(view, LJ(), LJFF(), LJI());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC19589811ke
    public final StickerModel LJII(InteractStickerStruct interactStickerStruct) {
        AttributionLinkScenario attributionLinkScenario;
        AttributionLinkStickerStruct attributionLinkStickerStruct = interactStickerStruct.getAttributionLinkStickerStruct();
        if (attributionLinkStickerStruct != null) {
            boolean z = false;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            DefaultConstructorMarker defaultConstructorMarker = null;
            BaseStickerModel baseStickerModel = new BaseStickerModel(0, 0, EnumC1466150oFx.ATTRIBUTION_LINK, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null);
            C19592511l5 c19592511l5 = AttributionLinkScenario.Companion;
            int scenario = attributionLinkStickerStruct.getScenario();
            c19592511l5.getClass();
            AttributionLinkScenario[] attributionLinkScenarioArrValues = AttributionLinkScenario.values();
            int length = attributionLinkScenarioArrValues.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    attributionLinkScenario = attributionLinkScenarioArrValues[i];
                    if (attributionLinkScenario.getValue() == scenario) {
                        break;
                    }
                    i++;
                } else {
                    attributionLinkScenario = AttributionLinkScenario.ATTRIBUTION_LINK_SCENARIO_UNKNOWN;
                    break;
                }
            }
            String title = attributionLinkStickerStruct.getTitle();
            String url = attributionLinkStickerStruct.getUrl();
            C19593311lD c19593311lD = AttributionLinkShareFormat.Companion;
            Integer numValueOf = Integer.valueOf(attributionLinkStickerStruct.getShareFormat());
            c19593311lD.getClass();
            return new AttributionLinkStickerModel(baseStickerModel, z, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, attributionLinkScenario, title, url, C19593311lD.LIZ(numValueOf), objArr == true ? 1 : 0, 270, defaultConstructorMarker);
        }
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        return new AttributionLinkStickerModel(null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr4, objArr5, objArr6, objArr7, 0 == true ? 1 : 0, 511, objArr8);
    }
}
