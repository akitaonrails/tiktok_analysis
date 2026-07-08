package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.feed.LiveDrawerNewCardUiSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0IY3, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public class C0IY3 extends C0IY2 {
    public TextView LLJLIL;
    public C1324720kZq LLJLILLLLZIIL;

    @Override // X.C0IY2
    public final void R5() {
        super.R5();
        this.LLJLIL = (TextView) this.itemView.findViewById(R.id.tv_title_upper);
        this.LLJLILLLLZIIL = (C1324720kZq) this.itemView.findViewById(R.id.mtx);
    }

    @Override // X.C0IY2, X.AbstractC468490IYt
    public /* bridge */ /* synthetic */ void I5(int i, Object obj) {
        I5(i, (FeedItem) obj);
    }

    @Override // X.C0IY2
    /* JADX INFO: renamed from: P5 */
    public void I5(int i, FeedItem feedItem) {
        C1324720kZq c1324720kZq;
        TextView textView;
        Room room;
        String strLIZ;
        User owner;
        ImageModel avatarThumb;
        super.I5(i, feedItem);
        TextView textView2 = this.LLJLIL;
        if (textView2 == null || (c1324720kZq = this.LLJLILLLLZIIL) == null || (textView = this.LLIZLLLIL) == null || (room = this.LLJJJ) == null) {
            return;
        }
        if (!TextUtils.isEmpty(room.getTitle())) {
            Object[] objArr = new Object[1];
            String title = room.getTitle();
            if (title == null) {
                title = "";
            }
            objArr[0] = title;
            strLIZ = C341701Uh.LIZ("%s", objArr);
        } else if (room.getOwner() != null && !TextUtils.isEmpty(C0KVU.LIZ(room.getOwner()))) {
            strLIZ = C0KVU.LIZ(room.getOwner());
        } else {
            strLIZ = null;
        }
        LiveDrawerNewCardUiSetting liveDrawerNewCardUiSetting = LiveDrawerNewCardUiSetting.INSTANCE;
        if (liveDrawerNewCardUiSetting.getValue()) {
            textView2.setText(strLIZ);
            C786410Ut5.LLIL(textView2, 0);
            textView.setText(C0KVU.LIZ(room.getOwner()));
            Room room2 = this.LLJJJ;
            if (room2 != null && (owner = room2.getOwner()) != null && (avatarThumb = owner.getAvatarThumb()) != null) {
                C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(avatarThumb.getUrls());
                int iLIZIZ = (int) C497740JfY.LIZIZ(13.0f);
                int iLIZIZ2 = (int) C497740JfY.LIZIZ(13.0f);
                c1324610kZfLIZJ.LJI = iLIZIZ;
                c1324610kZfLIZJ.LJII = iLIZIZ2;
                Boolean bool = Boolean.TRUE;
                c1324610kZfLIZJ.LJJ = bool;
                c1324610kZfLIZJ.LJIILIIL = bool;
                c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
                c1324610kZfLIZJ.LJJI(c1324720kZq);
            }
            C786410Ut5.LLJJIII(c1324720kZq, 0);
        } else {
            textView2.setText((CharSequence) null);
            C786410Ut5.LLIL(textView2, 8);
            textView.setText(strLIZ);
            C786410Ut5.LLJJIII(c1324720kZq, 8);
        }
        if (C497740JfY.LJJ()) {
            textView2.setGravity(5);
        } else {
            textView2.setGravity(3);
        }
        if (liveDrawerNewCardUiSetting.getValue()) {
            View view = this.LLJILJIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            View view2 = this.LLJILJIL;
            if (view2 != null) {
                C500260Jjc.LJJZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90)), view2);
            }
            View view3 = this.LLJILJIL;
            if (view3 != null) {
                view3.setBackgroundResource(R.drawable.dxo);
                return;
            }
            return;
        }
        View view4 = this.LLJILJIL;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(8, view4);
        }
        View view5 = this.LLJILJIL;
        if (view5 == null) {
            return;
        }
        view5.setBackgroundResource(0);
    }

    public C0IY3(View view, String str, C11RK<FeedItem> c11rk, C11RK<Boolean> c11rk2, ViewGroup viewGroup, C469770IbX c469770IbX) {
        super(view, str, c11rk, c11rk2, viewGroup, c469770IbX);
    }
}
