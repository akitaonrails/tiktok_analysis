package X;

import Y.ACListenerS135S0200000_33;
import Y.AfS166S0200000_33;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.view.StickerEditFragment;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.other.TtliveGameRewardsEnhanceSetting;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.model.RoomStickerAuditInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AJJ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AJJ extends C1AJN<RoomSticker> implements InterfaceC2177421AJo {
    public static final /* synthetic */ int LLLJIL = 0;
    public final RoomSticker LLL;
    public final boolean LLLF;
    public final InterfaceC2177361AJi LLLFF;
    public final C1AJV LLLFFI;
    public final DataChannel LLLFZ;
    public LinearLayout LLLI;
    public LiveIconView LLLII;
    public C20743416Fc LLLIIII;
    public LiveIconView LLLIIIIL;
    public C20743416Fc LLLIIIL;
    public ImageView LLLIIL;
    public View LLLIILIL;
    public C11JF LLLIL;
    public boolean LLLILZ;
    public final AlphaAnimation LLLILZJ;
    public int LLLILZLLLI;
    public long LLLIZZ;
    public final AwS612S0100000_33 LLLJ;

    @Override // X.C1AJN
    public final void j0() {
        DataChannel dataChannel = this.LLLFZ;
        C0KX8 c0kx8 = dataChannel != null ? (C0KX8) dataChannel.gg0(LiveBanCapabilityChannel.class) : null;
        if ((c0kx8 == null || !c0kx8.LIZJ) && C342701Ur.LIZ(this.LL)) {
            L0(Boolean.valueOf(this.LLLF), getContext(), this, 1, Boolean.valueOf(getVisibility() == 0), this.LLLJ, new AwS577S0100000_33(this, 3857), false);
            N0(5, null);
            this.LLLILZ = true;
            z0(true);
            if (C497740JfY.LJIL()) {
                this.LLILZ.LJIJI(true);
            }
        }
    }

    public final LiveIconView getRightArrowFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tk9);
            this.LLLII = (LiveIconView) callbackFindViewById;
        }
        return (LiveIconView) callbackFindViewById;
    }

    public final ImageView getRoomDecorationImageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tqc);
            this.LLLIIL = (ImageView) callbackFindViewById;
        }
        return (ImageView) callbackFindViewById;
    }

    public final C20743416Fc getRoomDecorationTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLIIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tqd);
            this.LLLIIIL = (C20743416Fc) callbackFindViewById;
        }
        return (C20743416Fc) callbackFindViewById;
    }

    public final LiveIconView getStickerStatusIcFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLIIIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.w7a);
            this.LLLIIIIL = (LiveIconView) callbackFindViewById;
        }
        return (LiveIconView) callbackFindViewById;
    }

    public final C20743416Fc getStickerStatusTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLIIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.w7b);
            this.LLLIIII = (C20743416Fc) callbackFindViewById;
        }
        return (C20743416Fc) callbackFindViewById;
    }

    public final LinearLayout getTextEditStatusFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xm9);
            this.LLLI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    @Override // X.C1AJN
    public final View n0() {
        if (this.LLJJIJIIJIL < 720) {
            return null;
        }
        C1AJX.LIZLLL = SystemClock.elapsedRealtime();
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.hl4, this, false);
        this.LLLIILIL = viewTd;
        return viewTd;
    }

    public final void P0() {
        C20743416Fc roomDecorationTextFromXml;
        if (getRoomDecorationTextFromXml() == null || getRoomDecorationTextFromXml().getVisibility() != 0) {
            return;
        }
        E0(getTextEditStatusFromXml());
        E0(getRoomDecorationTextFromXml());
        if ((this.LL instanceof RoomSticker) && (roomDecorationTextFromXml = getRoomDecorationTextFromXml()) != null) {
            RoomSticker roomSticker = (RoomSticker) this.LL;
            F0(roomDecorationTextFromXml, roomSticker.topLeftWidth, roomSticker.topLeftHeight, roomSticker.bottomRightWidth, roomSticker.bottomRightHeight, this.LLJJIJIIJIL == 720 ? 0.6666667f : 1.0f);
        }
        View view = this.LLLIILIL;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                int measuredWidth = getRoomDecorationTextFromXml().getMeasuredWidth();
                LinearLayout textEditStatusFromXml = getTextEditStatusFromXml();
                layoutParams.width = Math.max(measuredWidth, textEditStatusFromXml != null ? textEditStatusFromXml.getMeasuredWidth() : 0);
                layoutParams.height = getRoomDecorationTextFromXml().getMeasuredHeight() + getCheckViewHeight();
            }
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public final int getCheckViewHeight() {
        LinearLayout textEditStatusFromXml = getTextEditStatusFromXml();
        if (textEditStatusFromXml != null && textEditStatusFromXml.getVisibility() == 0 && this.LLILLJJLI) {
            return getTextEditStatusFromXml().getMeasuredHeight();
        }
        return 0;
    }

    public final int getCheckViewWidth() {
        LinearLayout textEditStatusFromXml = getTextEditStatusFromXml();
        if (textEditStatusFromXml != null && textEditStatusFromXml.getVisibility() == 0 && this.LLILLJJLI) {
            return getTextEditStatusFromXml().getMeasuredWidth();
        }
        return 0;
    }

    @Override // X.InterfaceC2177421AJo
    public String getContent() {
        CharSequence text;
        if (getType() != 4) {
            return null;
        }
        C20743416Fc roomDecorationTextFromXml = getRoomDecorationTextFromXml();
        if (roomDecorationTextFromXml != null && (text = roomDecorationTextFromXml.getText()) != null && !(text instanceof String)) {
            return null;
        }
        C20743416Fc roomDecorationTextFromXml2 = getRoomDecorationTextFromXml();
        return (String) (roomDecorationTextFromXml2 != null ? roomDecorationTextFromXml2.getText() : null);
    }

    public final C20743416Fc getDecorationText() {
        return getRoomDecorationTextFromXml();
    }

    @Override // X.InterfaceC2177421AJo
    public int getDecorationTextHeight() {
        C20743416Fc roomDecorationTextFromXml;
        if (getRoomDecorationTextFromXml() == null || (roomDecorationTextFromXml = getRoomDecorationTextFromXml()) == null) {
            return 0;
        }
        return roomDecorationTextFromXml.getMeasuredHeight();
    }

    @Override // X.C1AJN, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C784440Upu.LIZ().LIZIZ(new C1AJC(0));
        C11JF c11jf = this.LLLIL;
        if (c11jf != null && !c11jf.isDisposed()) {
            c11jf.dispose();
        }
        this.LLLILZJ.cancel();
    }

    public final DataChannel getDataChannel() {
        return this.LLLFZ;
    }

    public final InterfaceC2177361AJi getDecorationWidgetCallback() {
        return this.LLLFF;
    }

    public final RoomSticker getRoomSticker() {
        return this.LLL;
    }

    @Override // X.InterfaceC2177421AJo
    public boolean getTextEditable() {
        return this.LLLILZ;
    }

    public static void E0(View view) {
        if (view != null && view.getVisibility() == 0) {
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    public final void C0(RoomSticker roomSticker) {
        C11JF c11jf = this.LLLIL;
        if (c11jf != null && !c11jf.isDisposed()) {
            c11jf.dispose();
        }
        this.LLLIL = (C11JF) C11NZ.LJLJJLL(30L, TimeUnit.SECONDS).LJL(C1701940uOG.LIZIZ()).LJJLJLI(new AfS166S0200000_33(this, roomSticker, 2));
    }

    @Override // X.C1AJN
    public final void p0(final View view) {
        ImageModel imageModel;
        List urls;
        T t = this.LL;
        if (!(t instanceof RoomSticker)) {
            return;
        }
        RoomSticker roomSticker = (RoomSticker) t;
        int i = roomSticker.type;
        if (i != 4) {
            if ((i == 5 || i == 6) && (imageModel = roomSticker.image) != null && (urls = imageModel.getUrls()) != null && !urls.isEmpty()) {
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.1AJm
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                    }
                }, view);
                C1AJX.LJ = SystemClock.elapsedRealtime();
                C0JSS.LJFF(getRoomDecorationImageFromXml(), ((RoomSticker) this.LL).image, 0, new C0IYA() { // from class: X.1AJW
                    public boolean LIZ;

                    @Override // X.C0IYA, X.InterfaceC1142670fqD
                    public final void LIZLLL(String str, Exception exc) {
                        C1AJX.LIZLLL(this.LIZIZ.LL.type, 0);
                        C1AJX.LIZJ(this.LIZIZ.LL.type, 0);
                    }

                    @Override // X.C0IYA, X.InterfaceC1142670fqD
                    public final void LIZJ(int i2, int i3, String str) {
                        if (this.LIZ) {
                            return;
                        }
                        this.LIZ = true;
                        C1AJX.LIZLLL(this.LIZIZ.LL.type, 1);
                        C1AJX.LIZJ(this.LIZIZ.LL.type, 1);
                        int i4 = this.LIZIZ.LLJJIJIIJIL;
                        if (i4 == 720) {
                            i2 = (int) (i2 * 0.6666667f);
                            i3 = (int) (i3 * 0.6666667f);
                        } else if (i4 <= 720) {
                            i2 = 0;
                            i3 = 0;
                        }
                        if (i2 > 0 && i3 > 0) {
                            C1AJJ c1ajj = this.LIZIZ;
                            c1ajj.I0(view, c1ajj.LL.type, i2, i3);
                        }
                        C786410Ut5.LLJJJJLIIL(this.LIZIZ.getRoomDecorationTextFromXml(), 8);
                        C1AJJ c1ajj2 = this.LIZIZ;
                        int visibility = c1ajj2.getVisibility();
                        c1ajj2.setVisibility(0);
                        C1602160rnK.LIZIZ(visibility, 0, c1ajj2);
                    }
                });
                return;
            }
            return;
        }
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.1AJn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
            }
        }, view);
        C1AJX.LJ = SystemClock.elapsedRealtime();
        C1121670fIL.LJIIJJI(getRoomDecorationTextFromXml(), ((RoomSticker) this.LL).ninePatchImage, true, new InterfaceC1091290eVL() { // from class: X.1AJK
            public boolean LIZ;

            @Override // X.InterfaceC1091290eVL
            public final void LIZ(Exception exc) {
                C1AJV c1ajv;
                C1AJX.LIZLLL(this.LIZIZ.LL.type, 0);
                C1AJX.LIZJ(this.LIZIZ.LL.type, 0);
                C1AJJ c1ajj = this.LIZIZ;
                if (c1ajj.LLILLJJLI && (c1ajv = c1ajj.LLLFFI) != null) {
                    Long lValueOf = Long.valueOf(c1ajj.LL.id);
                    if (c1ajv.LIZ && lValueOf != null) {
                        c1ajv.LIZIZ.put(lValueOf, 5);
                    }
                }
                C20441214yg.LIZIZ("Decoration Text", exc.toString());
            }

            @Override // X.InterfaceC1091290eVL
            public final void LIZIZ(Bitmap bitmap) throws Throwable {
                boolean z;
                boolean z2;
                C1AJJ c1ajj;
                C1AJV c1ajv;
                float f;
                Room room;
                String strLIZIZ;
                float f2;
                if (this.LIZ) {
                    return;
                }
                this.LIZ = true;
                C1AJX.LIZLLL(this.LIZIZ.LL.type, 1);
                C1AJX.LIZJ(this.LIZIZ.LL.type, 1);
                boolean z3 = false;
                if (this.LIZIZ.getRoomDecorationTextFromXml().getLayoutParams() instanceof C19ME) {
                    C20743416Fc roomDecorationTextFromXml = this.LIZIZ.getRoomDecorationTextFromXml();
                    C1AJJ c1ajj2 = this.LIZIZ;
                    RoomSticker roomSticker2 = (RoomSticker) c1ajj2.LL;
                    TtliveGameRewardsEnhanceSetting ttliveGameRewardsEnhanceSetting = TtliveGameRewardsEnhanceSetting.INSTANCE;
                    String strDropsStickerId = ttliveGameRewardsEnhanceSetting.dropsStickerId();
                    boolean z4 = !ttliveGameRewardsEnhanceSetting.dropsStickerLocalTextClosed();
                    DataChannel dataChannel = c1ajj2.LLLFZ;
                    if (dataChannel != null) {
                        room = (Room) dataChannel.gg0(RoomChannel.class);
                    } else {
                        room = null;
                    }
                    if (!C01SL.LIZ(room) || !z4 || !Intrinsics.LJFF(strDropsStickerId, String.valueOf(roomSticker2.id)) || roomSticker2.starlingKey.length() == 0) {
                        strLIZIZ = roomSticker2.content;
                    } else {
                        C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
                        String str = roomSticker2.starlingKey;
                        c1124870fNVLIZJ.getClass();
                        strLIZIZ = C1124870fNV.LIZIZ(str);
                        if (strLIZIZ == null || strLIZIZ.length() == 0) {
                            strLIZIZ = roomSticker2.content;
                        }
                    }
                    roomDecorationTextFromXml.setText(strLIZIZ);
                    if (c1ajj2.LLJJIJIIJIL == 720) {
                        f2 = 0.6666667f;
                    } else {
                        f2 = 1.0f;
                    }
                    roomDecorationTextFromXml.setTextSize(0, c1ajj2.LL.textSize * f2);
                    roomDecorationTextFromXml.setBackground(C1121670fIL.LIZJ(bitmap, f2));
                    roomDecorationTextFromXml.setTextColor(ColorProtector.parseColor(c1ajj2.LL.textColor));
                    roomDecorationTextFromXml.setIncludeFontPadding(false);
                    C786410Ut5.LLJJJJLIIL(roomDecorationTextFromXml, 0);
                    C1119920fFW.LJI(500, roomDecorationTextFromXml);
                    RoomSticker roomSticker3 = (RoomSticker) c1ajj2.LL;
                    C1AJJ.F0(roomDecorationTextFromXml, roomSticker3.topLeftWidth, roomSticker3.topLeftHeight, roomSticker3.bottomRightWidth, roomSticker3.bottomRightHeight, f2);
                }
                C786410Ut5.LJZI(8, this.LIZIZ.getRoomDecorationImageFromXml());
                C1AJJ c1ajj3 = this.LIZIZ;
                int visibility = c1ajj3.getVisibility();
                c1ajj3.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c1ajj3);
                this.LIZIZ.getRoomDecorationTextFromXml().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                C1AJJ c1ajj4 = this.LIZIZ;
                if (c1ajj4.LLILLJJLI) {
                    int i2 = ((RoomSticker) c1ajj4.LL).reviewStatus;
                    if (i2 == 2) {
                        i2 = 0;
                    }
                    C1AJJ c1ajj5 = this.LIZIZ;
                    c1ajj5.N0(i2, ((RoomSticker) c1ajj5.LL).auditInfo);
                    C1AJJ c1ajj6 = this.LIZIZ;
                    c1ajj6.M0(((RoomSticker) c1ajj6.LL).reviewStatus, false);
                    C1AJJ.E0(this.LIZIZ.getTextEditStatusFromXml());
                }
                C20743416Fc roomDecorationTextFromXml2 = this.LIZIZ.getRoomDecorationTextFromXml();
                if (roomDecorationTextFromXml2 != null) {
                    C1AJJ c1ajj7 = this.LIZIZ;
                    RoomSticker roomSticker4 = (RoomSticker) c1ajj7.LL;
                    int i3 = roomSticker4.topLeftWidth;
                    int i4 = roomSticker4.topLeftHeight;
                    int i5 = roomSticker4.bottomRightWidth;
                    int i6 = roomSticker4.bottomRightHeight;
                    if (c1ajj7.LLJJIJIIJIL == 720) {
                        f = 0.6666667f;
                    } else {
                        f = 1.0f;
                    }
                    C1AJJ.F0(roomDecorationTextFromXml2, i3, i4, i5, i6, f);
                }
                this.LIZIZ.I0(view, 4, Math.max(this.LIZIZ.getRoomDecorationTextFromXml().getMeasuredWidth(), this.LIZIZ.getCheckViewWidth()), Math.max(this.LIZIZ.getRoomDecorationTextFromXml().getMeasuredHeight(), bitmap.getHeight()) + this.LIZIZ.getCheckViewHeight());
                C1AJJ c1ajj8 = this.LIZIZ;
                if (c1ajj8.LLILLJJLI) {
                    Long lValueOf = Long.valueOf(c1ajj8.LL.id);
                    C1AJV c1ajv2 = c1ajj8.LLLFFI;
                    if (c1ajv2 != null && c1ajv2.LIZ(1, lValueOf) && C0UNG.LIZ((RoomSticker) this.LIZIZ.LL)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C1AJJ c1ajj9 = this.LIZIZ;
                    Long lValueOf2 = Long.valueOf(c1ajj9.LL.id);
                    C1AJV c1ajv3 = c1ajj9.LLLFFI;
                    if (c1ajv3 != null && c1ajv3.LIZ(2, lValueOf2) && !C342701Ur.LIZ(this.LIZIZ.LL)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z || z2) {
                        C2177381AJk c2177381AJk = C1AJL.LIZLLL;
                        DataChannel dataChannel2 = this.LIZIZ.getDataChannel();
                        C1AJJ c1ajj10 = this.LIZIZ;
                        C1AJL.LJII(dataChannel2, (RoomSticker) c1ajj10.LL, Boolean.valueOf(C342601Uq.LIZIZ(this.LIZIZ.getContent(), c1ajj10.getRoomSticker())));
                        C1AJL.LIZJ = SystemClock.elapsedRealtime();
                    }
                    C1AJJ c1ajj11 = this.LIZIZ;
                    boolean zLIZIZ = C342601Uq.LIZIZ(c1ajj11.getContent(), (RoomSticker) c1ajj11.LL);
                    C2177381AJk c2177381AJk2 = C1AJL.LIZLLL;
                    C1AJL.LIZLLL(this.LIZIZ.getDataChannel(), (RoomSticker) this.LIZIZ.LL, Boolean.valueOf(zLIZIZ), ((RoomSticker) this.LIZIZ.LL).reviewStatus, 0L);
                    if (C342701Ur.LIZ(this.LIZIZ.LL) && ((c1ajv = (c1ajj = this.LIZIZ).LLLFFI) == null || !c1ajv.LIZ(1, Long.valueOf(c1ajj.LL.id)))) {
                        C1AJJ c1ajj12 = this.LIZIZ;
                        Boolean boolValueOf = Boolean.valueOf(c1ajj12.LLILLJJLI);
                        Context context = this.LIZIZ.getContext();
                        C1AJJ c1ajj13 = this.LIZIZ;
                        if (view.getVisibility() == 0) {
                            z3 = true;
                        }
                        Boolean boolValueOf2 = Boolean.valueOf(z3);
                        C1AJJ c1ajj14 = this.LIZIZ;
                        c1ajj12.L0(boolValueOf, context, c1ajj13, 2, boolValueOf2, c1ajj14.LLLJ, new AwS577S0100000_33(c1ajj14, 3858), true);
                        this.LIZIZ.N0(5, null);
                        C1AJJ c1ajj15 = this.LIZIZ;
                        c1ajj15.LLLILZ = true;
                        c1ajj15.z0(true);
                        if (C497740JfY.LJIL()) {
                            c1ajj15.LLILZ.LJIJI(true);
                        }
                    }
                    C1AJJ c1ajj16 = this.LIZIZ;
                    C1AJV c1ajv4 = c1ajj16.LLLFFI;
                    if (c1ajv4 != null) {
                        Long lValueOf3 = Long.valueOf(c1ajj16.LL.id);
                        if (c1ajv4.LIZ && lValueOf3 != null) {
                            c1ajv4.LIZIZ.put(lValueOf3, 5);
                        }
                    }
                }
            }
        });
    }

    public final void setRightArrowFromXml(LiveIconView liveIconView) {
        this.LLLII = liveIconView;
    }

    public final void setRoomDecorationImageFromXml(ImageView imageView) {
        this.LLLIIL = imageView;
    }

    public final void setRoomDecorationTextFromXml(C20743416Fc c20743416Fc) {
        this.LLLIIIL = c20743416Fc;
    }

    public final void setStickerStatusIcFromXml(LiveIconView liveIconView) {
        this.LLLIIIIL = liveIconView;
    }

    public final void setStickerStatusTextFromXml(C20743416Fc c20743416Fc) {
        this.LLLIIII = c20743416Fc;
    }

    public final void setTextEditStatusFromXml(LinearLayout linearLayout) {
        this.LLLI = linearLayout;
    }

    public static RoomSticker B0(String str, RoomSticker roomSticker) {
        RoomSticker roomStickerLIZ = RoomSticker.LIZ(roomSticker);
        roomStickerLIZ.content = str;
        roomStickerLIZ.id = roomSticker.id;
        roomStickerLIZ.LIZ = roomSticker.LIZ;
        roomStickerLIZ.type = roomSticker.type;
        roomStickerLIZ.textColor = roomSticker.textColor;
        roomStickerLIZ.textSize = roomSticker.textSize;
        roomStickerLIZ.xPosition = roomSticker.xPosition;
        roomStickerLIZ.yPosition = roomSticker.yPosition;
        roomStickerLIZ.screenWidth = roomSticker.screenWidth;
        roomStickerLIZ.screenHeight = roomSticker.screenHeight;
        return roomStickerLIZ;
    }

    public final void M0(int i, boolean z) {
        int i2 = this.LLLILZLLLI;
        this.LLLILZLLLI = i;
        if (z) {
            if (i2 == 1) {
                if (this.LLLIZZ != -1) {
                    T t = this.LL;
                    if (t instanceof RoomSticker) {
                        C2177381AJk c2177381AJk = C1AJL.LIZLLL;
                        RoomSticker roomSticker = (RoomSticker) t;
                        C1AJL.LIZLLL(this.LLLFZ, roomSticker, Boolean.valueOf(C342601Uq.LIZIZ(getContent(), roomSticker)), this.LLLILZLLLI, SystemClock.elapsedRealtime() - this.LLLIZZ);
                        this.LLLIZZ = -1L;
                    }
                }
            } else {
                T t2 = this.LL;
                if (t2 instanceof RoomSticker) {
                    C2177381AJk c2177381AJk2 = C1AJL.LIZLLL;
                    RoomSticker roomSticker2 = (RoomSticker) t2;
                    C1AJL.LIZLLL(this.LLLFZ, roomSticker2, Boolean.valueOf(C342601Uq.LIZIZ(getContent(), roomSticker2)), this.LLLILZLLLI, 0L);
                }
            }
        }
        if (i == 1) {
            this.LLLIZZ = SystemClock.elapsedRealtime();
        }
    }

    public final void N0(int i, RoomStickerAuditInfo roomStickerAuditInfo) {
        Drawable background;
        Drawable background2;
        Drawable background3;
        if (this.LLLILZ) {
            return;
        }
        this.LLLILZJ.cancel();
        LinearLayout textEditStatusFromXml = getTextEditStatusFromXml();
        if (textEditStatusFromXml != null) {
            C786410Ut5.LJZL(8, textEditStatusFromXml);
        }
        C500260Jjc.LJIILIIL(getRightArrowFromXml());
        C20743416Fc stickerStatusTextFromXml = getStickerStatusTextFromXml();
        if (stickerStatusTextFromXml != null) {
            C786410Ut5.n8(stickerStatusTextFromXml, null);
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            LinearLayout textEditStatusFromXml2 = getTextEditStatusFromXml();
                            if (textEditStatusFromXml2 != null) {
                                C786410Ut5.LJZL(8, textEditStatusFromXml2);
                                return;
                            }
                            return;
                        }
                        C786410Ut5.m5(getRoomDecorationTextFromXml(), 1.0f);
                        LinearLayout textEditStatusFromXml3 = getTextEditStatusFromXml();
                        if (textEditStatusFromXml3 == null) {
                            return;
                        }
                        C786410Ut5.LJZL(8, textEditStatusFromXml3);
                        return;
                    }
                    C20743416Fc stickerStatusTextFromXml2 = getStickerStatusTextFromXml();
                    if (stickerStatusTextFromXml2 != null) {
                        C786410Ut5.LLJJJJLIIL(stickerStatusTextFromXml2, 8);
                    }
                    LiveIconView stickerStatusIcFromXml = getStickerStatusIcFromXml();
                    if (stickerStatusIcFromXml != null) {
                        stickerStatusIcFromXml.setIconAttr(R.attr.f551dn3);
                    }
                    LiveIconView stickerStatusIcFromXml2 = getStickerStatusIcFromXml();
                    if (stickerStatusIcFromXml2 != null) {
                        stickerStatusIcFromXml2.setIconTint(C20736316Cj.LIZJ(R.attr.etr, getStickerStatusIcFromXml()));
                    }
                    C786410Ut5.m5(getRoomDecorationTextFromXml(), 0.5f);
                    LinearLayout textEditStatusFromXml4 = getTextEditStatusFromXml();
                    if (textEditStatusFromXml4 != null) {
                        textEditStatusFromXml4.setBackground(null);
                    }
                    LinearLayout textEditStatusFromXml5 = getTextEditStatusFromXml();
                    if (textEditStatusFromXml5 == null) {
                        return;
                    }
                    C786410Ut5.LJZL(0, textEditStatusFromXml5);
                    return;
                }
                LiveIconView stickerStatusIcFromXml3 = getStickerStatusIcFromXml();
                if (stickerStatusIcFromXml3 != null) {
                    stickerStatusIcFromXml3.setIconAttr(R.attr.dn9);
                }
                LiveIconView stickerStatusIcFromXml4 = getStickerStatusIcFromXml();
                if (stickerStatusIcFromXml4 != null) {
                    stickerStatusIcFromXml4.setIconTint(C20736316Cj.LIZJ(R.attr.c9i, getStickerStatusIcFromXml()));
                }
                C786410Ut5.m5(getRoomDecorationTextFromXml(), 0.5f);
                LinearLayout textEditStatusFromXml6 = getTextEditStatusFromXml();
                if (textEditStatusFromXml6 != null) {
                    textEditStatusFromXml6.setBackground(C497740JfY.LJIIJ(R.drawable.fbc));
                }
                LinearLayout textEditStatusFromXml7 = getTextEditStatusFromXml();
                if (textEditStatusFromXml7 != null && (background3 = textEditStatusFromXml7.getBackground()) != null) {
                    background3.setAlpha(128);
                }
                C20743416Fc stickerStatusTextFromXml3 = getStickerStatusTextFromXml();
                if (stickerStatusTextFromXml3 != null) {
                    C786410Ut5.LLJJJJLIIL(stickerStatusTextFromXml3, 0);
                }
                LinearLayout textEditStatusFromXml8 = getTextEditStatusFromXml();
                if (textEditStatusFromXml8 != null) {
                    C786410Ut5.LJZL(0, textEditStatusFromXml8);
                }
                if (roomStickerAuditInfo != null && roomStickerAuditInfo.violationId != 0) {
                    if (roomStickerAuditInfo.taskType == 1) {
                        C20743416Fc stickerStatusTextFromXml4 = getStickerStatusTextFromXml();
                        if (stickerStatusTextFromXml4 != null) {
                            stickerStatusTextFromXml4.setText(C497740JfY.LJIJI(2131844161));
                        }
                    } else {
                        C20743416Fc stickerStatusTextFromXml5 = getStickerStatusTextFromXml();
                        if (stickerStatusTextFromXml5 != null) {
                            stickerStatusTextFromXml5.setText(C497740JfY.LJIJI(2131841485));
                        }
                    }
                    C20743416Fc stickerStatusTextFromXml6 = getStickerStatusTextFromXml();
                    if (stickerStatusTextFromXml6 != null) {
                        C786410Ut5.n8(stickerStatusTextFromXml6, new ACListenerS135S0200000_33(roomStickerAuditInfo, this, 7));
                    }
                    C500260Jjc.LLFFF(getRightArrowFromXml());
                    return;
                }
                C20743416Fc stickerStatusTextFromXml7 = getStickerStatusTextFromXml();
                if (stickerStatusTextFromXml7 != null) {
                    stickerStatusTextFromXml7.setText(C497740JfY.LJIJI(2131841485));
                }
                C500260Jjc.LJIILIIL(getRightArrowFromXml());
                return;
            }
            C786410Ut5.m5(getRoomDecorationTextFromXml(), 1.0f);
            LinearLayout textEditStatusFromXml9 = getTextEditStatusFromXml();
            if (textEditStatusFromXml9 != null && (background2 = textEditStatusFromXml9.getBackground()) != null) {
                background2.setAlpha(255);
            }
            LinearLayout textEditStatusFromXml10 = getTextEditStatusFromXml();
            if (textEditStatusFromXml10 != null) {
                C786410Ut5.LJZL(0, textEditStatusFromXml10);
            }
            C20743416Fc stickerStatusTextFromXml8 = getStickerStatusTextFromXml();
            if (stickerStatusTextFromXml8 != null) {
                C786410Ut5.LLJJJJLIIL(stickerStatusTextFromXml8, 0);
            }
            if (roomStickerAuditInfo != null && roomStickerAuditInfo.taskType == 1 && roomStickerAuditInfo.violationId != 0) {
                LinearLayout textEditStatusFromXml11 = getTextEditStatusFromXml();
                if (textEditStatusFromXml11 != null) {
                    textEditStatusFromXml11.setBackground(C497740JfY.LJIIJ(R.drawable.fba));
                }
                LiveIconView stickerStatusIcFromXml5 = getStickerStatusIcFromXml();
                if (stickerStatusIcFromXml5 != null) {
                    stickerStatusIcFromXml5.setIconAttr(R.attr.ejo);
                }
                LiveIconView stickerStatusIcFromXml6 = getStickerStatusIcFromXml();
                if (stickerStatusIcFromXml6 != null) {
                    stickerStatusIcFromXml6.setIconTint(C20736316Cj.LIZJ(R.attr.c9i, getStickerStatusIcFromXml()));
                }
                C20743416Fc stickerStatusTextFromXml9 = getStickerStatusTextFromXml();
                if (stickerStatusTextFromXml9 != null) {
                    stickerStatusTextFromXml9.setText(C497740JfY.LJIJI(2131844164));
                }
                C20743416Fc stickerStatusTextFromXml10 = getStickerStatusTextFromXml();
                if (stickerStatusTextFromXml10 != null) {
                    C786410Ut5.n8(stickerStatusTextFromXml10, new ACListenerS135S0200000_33(roomStickerAuditInfo, this, 6));
                }
                this.LLLILZJ.setStartOffset(60000L);
                C500260Jjc.LLFFF(getRightArrowFromXml());
            } else {
                LinearLayout textEditStatusFromXml12 = getTextEditStatusFromXml();
                if (textEditStatusFromXml12 != null) {
                    textEditStatusFromXml12.setBackground(C497740JfY.LJIIJ(R.drawable.fbb));
                }
                LiveIconView stickerStatusIcFromXml7 = getStickerStatusIcFromXml();
                if (stickerStatusIcFromXml7 != null) {
                    stickerStatusIcFromXml7.setIconAttr(R.attr.ejp);
                }
                LiveIconView stickerStatusIcFromXml8 = getStickerStatusIcFromXml();
                if (stickerStatusIcFromXml8 != null) {
                    stickerStatusIcFromXml8.setIconTint(C20736316Cj.LIZJ(R.attr.eu1, getStickerStatusIcFromXml()));
                }
                C20743416Fc stickerStatusTextFromXml11 = getStickerStatusTextFromXml();
                if (stickerStatusTextFromXml11 != null) {
                    stickerStatusTextFromXml11.setText(C497740JfY.LJIJI(2131841484));
                }
                this.LLLILZJ.setStartOffset(3000L);
                C500260Jjc.LJIILIIL(getRightArrowFromXml());
            }
            if (getTextEditStatusFromXml() != null) {
                AlphaAnimation alphaAnimation = this.LLLILZJ;
                final LinearLayout textEditStatusFromXml13 = getTextEditStatusFromXml();
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: X.1AJF
                    public final /* synthetic */ int LIZIZ = 8;

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        C786410Ut5.LJLLLLLL(this.LIZIZ, textEditStatusFromXml13);
                        this.P0();
                    }
                });
            }
            LinearLayout textEditStatusFromXml14 = getTextEditStatusFromXml();
            if (textEditStatusFromXml14 == null) {
                return;
            }
            textEditStatusFromXml14.startAnimation(this.LLLILZJ);
            return;
        }
        LiveIconView stickerStatusIcFromXml9 = getStickerStatusIcFromXml();
        if (stickerStatusIcFromXml9 != null) {
            stickerStatusIcFromXml9.setIconAttr(R.attr.dr1);
        }
        LiveIconView stickerStatusIcFromXml10 = getStickerStatusIcFromXml();
        if (stickerStatusIcFromXml10 != null) {
            stickerStatusIcFromXml10.setIconTint(C20736316Cj.LIZJ(R.attr.c9i, getStickerStatusIcFromXml()));
        }
        C20743416Fc stickerStatusTextFromXml12 = getStickerStatusTextFromXml();
        if (stickerStatusTextFromXml12 != null) {
            stickerStatusTextFromXml12.setText(C497740JfY.LJIJI(2131841486));
        }
        C786410Ut5.m5(getRoomDecorationTextFromXml(), 0.5f);
        LinearLayout textEditStatusFromXml15 = getTextEditStatusFromXml();
        if (textEditStatusFromXml15 != null) {
            textEditStatusFromXml15.setBackground(C497740JfY.LJIIJ(R.drawable.fbb));
        }
        LinearLayout textEditStatusFromXml16 = getTextEditStatusFromXml();
        if (textEditStatusFromXml16 != null && (background = textEditStatusFromXml16.getBackground()) != null) {
            background.setAlpha(128);
        }
        LinearLayout textEditStatusFromXml17 = getTextEditStatusFromXml();
        if (textEditStatusFromXml17 != null) {
            C786410Ut5.LJZL(0, textEditStatusFromXml17);
        }
        C20743416Fc stickerStatusTextFromXml13 = getStickerStatusTextFromXml();
        if (stickerStatusTextFromXml13 == null) {
            return;
        }
        C786410Ut5.LLJJJJLIIL(stickerStatusTextFromXml13, 0);
    }

    public final void O0(int i, RoomStickerAuditInfo roomStickerAuditInfo) {
        if (i == 0 || i == 1 || i == 2 || i == 3) {
            DataChannel dataChannel = this.LLLFZ;
            if (dataChannel != null) {
                RoomSticker roomSticker = this.LLL;
                String content = getContent();
                if (content == null) {
                    content = "";
                }
                dataChannel.SX0(C0UN7.class, B0(content, roomSticker));
            }
            C2177381AJk c2177381AJk = C1AJL.LIZLLL;
            C1AJL.LIZ = SystemClock.elapsedRealtime();
        }
        N0(i, roomStickerAuditInfo);
        M0(i, true);
        if (i == 0 || i == 1 || i == 2 || i == 3) {
            C0(this.LLL);
        }
        P0();
    }

    public final void I0(View view, int i, int i2, int i3) {
        float f;
        int i4;
        int dimensionPixelSize;
        int i5 = i2 / 2;
        int i6 = i3 / 2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i3;
        C786410Ut5.W5(view, layoutParams);
        if (i == 5 || i == 6) {
            ViewGroup.LayoutParams layoutParams2 = getRoomDecorationImageFromXml().getLayoutParams();
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            C786410Ut5.c6(getRoomDecorationImageFromXml(), layoutParams2);
        }
        T t = this.LL;
        int i7 = t.xPosition;
        if (i7 == -1 && t.yPosition == -1) {
            int[] iArr = this.LLJILJILJ;
            i4 = ((iArr[2] + iArr[3]) / 2) - i5;
            dimensionPixelSize = (getResources().getDimensionPixelSize(R.dimen.ayt) + this.LLJILJILJ[1]) / 2;
        } else {
            int i8 = t.screenWidth;
            float f2 = 1.0f;
            if (i8 > 0) {
                f = this.LLJJIJIIJIL / i8;
            } else {
                f = 1.0f;
            }
            int i9 = t.screenHeight;
            if (i9 > 0) {
                f2 = this.LLJJIJIL / i9;
            }
            i4 = ((int) (i7 * f)) - i5;
            dimensionPixelSize = (int) (t.yPosition * f2);
        }
        int i10 = dimensionPixelSize - i6;
        int[] iArr2 = this.LLJILJILJ;
        int i11 = iArr2[2];
        if (i4 < i11) {
            i4 = i11;
        } else {
            int i12 = layoutParams.width;
            int i13 = i4 + i12;
            int i14 = iArr2[3];
            if (i13 > i14) {
                i4 = i14 - i12;
            }
        }
        int i15 = iArr2[0];
        if (i10 < i15) {
            i10 = i15;
        } else {
            int i16 = layoutParams.height;
            int i17 = i10 + i16;
            int i18 = iArr2[1];
            if (i17 > i18) {
                i10 = i18 - i16;
            }
        }
        C786410Ut5.Fd(view, i4);
        C786410Ut5.Ld(view, i10);
        T t2 = this.LL;
        t2.xPosition = i4 + i5;
        t2.yPosition = i10 + i6;
        if (this.LLILLJJLI && (t2 instanceof RoomSticker)) {
            C1AJV c1ajv = this.LLLFFI;
            if ((c1ajv != null && c1ajv.LIZ(1, Long.valueOf(t2.id))) || C342701Ur.LIZ(this.LL)) {
                return;
            }
            this.LLILZ.Q(getContent(), (RoomSticker) this.LL);
        }
    }

    public static void F0(C20743416Fc c20743416Fc, int i, int i2, int i3, int i4, float f) {
        c20743416Fc.setPaddingRelative((int) (i * f), (int) (i2 * f), (int) (i3 * f), (int) (i4 * f));
    }

    public C1AJJ(Context context, RoomSticker roomSticker, boolean z, int[] iArr, InterfaceC2177361AJi interfaceC2177361AJi, boolean z2, C1AJV c1ajv, DataChannel dataChannel) {
        super(context, roomSticker, z, iArr, interfaceC2177361AJi, z2);
        this.LLL = roomSticker;
        this.LLLF = z;
        this.LLLFF = interfaceC2177361AJi;
        this.LLLFFI = c1ajv;
        this.LLLFZ = dataChannel;
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setStartOffset(2800L);
        alphaAnimation.setDuration(200L);
        this.LLLILZJ = alphaAnimation;
        this.LLLIZZ = -1L;
        this.LLLJ = new AwS612S0100000_33(this, 138);
    }

    public final void L0(Boolean bool, Context context, C1AJJ c1ajj, int i, Boolean bool2, Function1<? super Boolean, Unit> function1, Function0<Unit> function0, boolean z) {
        RoomSticker roomSticker;
        if (!Intrinsics.LJFF(bool, Boolean.FALSE) && c1ajj.getType() == 4 && Intrinsics.LJFF(bool2, Boolean.TRUE) && !this.LLLILZ) {
            DataChannel dataChannel = this.LLLFZ;
            if (dataChannel != null) {
                RoomSticker roomSticker2 = this.LLL;
                String content = getContent();
                if (content == null) {
                    content = "";
                }
                dataChannel.SX0(C0UN7.class, B0(content, roomSticker2));
            }
            C2177381AJk c2177381AJk = C1AJL.LIZLLL;
            C1AJL.LIZ = SystemClock.elapsedRealtime();
            if (z) {
                C0(this.LLL);
            }
            FragmentManager fragmentManagerLJIL = C520010KaN.LJIL(context, false);
            if (fragmentManagerLJIL != null) {
                StickerEditFragment stickerEditFragment = new StickerEditFragment();
                Bundle bundle = new Bundle();
                bundle.putInt("build_dialog", i);
                stickerEditFragment.setArguments(bundle);
                stickerEditFragment.LLILZLL = c1ajj;
                T t = c1ajj.LL;
                if (t instanceof RoomSticker) {
                    roomSticker = (RoomSticker) t;
                } else {
                    roomSticker = null;
                }
                stickerEditFragment.LLJI = roomSticker;
                stickerEditFragment.LLJILJIL = function1;
                stickerEditFragment.LLJILJILJ = function0;
                stickerEditFragment.show(fragmentManagerLJIL, StickerEditFragment.class.getCanonicalName());
            }
        }
    }
}
