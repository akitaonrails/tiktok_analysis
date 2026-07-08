package X;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.UserEmote;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.edit.vm.EmotePollEditVM;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0JRd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C491990JRd extends C491980JRc {
    public final View LL;
    public final EmotePollEditVM LLILLJJLI;
    public final C19R6 LLILLL;
    public final C1324720kZq LLILZ;
    public final TextView LLILZIL;
    public final TextView LLILZLL;
    public final C0KVZ LLIZ;
    public final C20744116Fj LLIZLLLIL;

    public C491990JRd(View view, EmotePollEditVM emotePollEditVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = emotePollEditVM;
        this.LLILLL = (C19R6) view.findViewById(R.id.h16);
        this.LLILZ = (C1324720kZq) view.findViewById(R.id.bh2);
        this.LLILZIL = (TextView) view.findViewById(R.id.zz2);
        this.LLILZLL = (TextView) view.findViewById(R.id.zjv);
        this.LLIZ = (C0KVZ) view.findViewById(R.id.bqd);
        this.LLIZLLLIL = (C20744116Fj) view.findViewById(R.id.h0y);
    }

    @Override // X.C491980JRc
    public final void I5(AbstractC492010JRf abstractC492010JRf, final InterfaceC2753014t interfaceC2753014t) {
        final C491960JRa c491960JRa;
        String nickName;
        if ((abstractC492010JRf instanceof C491960JRa) && (c491960JRa = (C491960JRa) abstractC492010JRf) != null && (interfaceC2753014t instanceof C0JQJ) && interfaceC2753014t != null) {
            C786410Ut5.z7(this.LLIZLLLIL, new CompoundButton.OnCheckedChangeListener() { // from class: X.0JQc
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    ArrayList<Long> arrayList;
                    ArrayList<Long> arrayList2;
                    int size;
                    Long l;
                    ArrayList<AbstractC492010JRf> arrayList3;
                    C0JRU c0jru;
                    ArrayList<Long> arrayList4;
                    ArrayList<Long> arrayList5;
                    ArrayList<Long> arrayList6;
                    if (z) {
                        if (((C0JQJ) interfaceC2753014t).LLILZ.contains(Long.valueOf(c491960JRa.LIZ.emoteId))) {
                            return;
                        }
                        EmotePollEditVM emotePollEditVM = this.LLILLJJLI;
                        long j = c491960JRa.LIZ.emoteId;
                        C0JQJ c0jqjVQ2 = emotePollEditVM.vQ2();
                        int i = 0;
                        if (c0jqjVQ2 != null && (arrayList2 = c0jqjVQ2.LLILZ) != null && (size = arrayList2.size()) >= 3) {
                            C0JQJ c0jqjVQ22 = emotePollEditVM.vQ2();
                            if (c0jqjVQ22 != null && (arrayList6 = c0jqjVQ22.LLILZ) != null) {
                                l = (Long) ListProtector.get(arrayList6, size - 1);
                            } else {
                                l = null;
                            }
                            C0JQJ c0jqjVQ23 = emotePollEditVM.vQ2();
                            if (c0jqjVQ23 != null && (arrayList5 = c0jqjVQ23.LLILZ) != null) {
                                ListProtector.remove(arrayList5, size - 1);
                            }
                            C0JQJ c0jqjVQ24 = emotePollEditVM.vQ2();
                            if (c0jqjVQ24 != null && (arrayList4 = c0jqjVQ24.LLILZ) != null) {
                                arrayList4.add(Long.valueOf(j));
                            }
                            C0JRU c0jru2 = emotePollEditVM.LL;
                            if (c0jru2 != null && (arrayList3 = c0jru2.LL) != null) {
                                for (AbstractC492010JRf abstractC492010JRf2 : arrayList3) {
                                    int i2 = i + 1;
                                    if (i >= 0) {
                                        AbstractC492010JRf abstractC492010JRf3 = abstractC492010JRf2;
                                        if (abstractC492010JRf3 instanceof C491960JRa) {
                                            long j2 = ((C491960JRa) abstractC492010JRf3).LIZ.emoteId;
                                            if (l != null && j2 == l.longValue() && (c0jru = emotePollEditVM.LL) != null) {
                                                c0jru.notifyItemChanged(i);
                                            }
                                        }
                                        i = i2;
                                    } else {
                                        C1697810uHb.LJIJI();
                                        throw null;
                                    }
                                }
                            }
                        } else {
                            C0JQJ c0jqjVQ25 = emotePollEditVM.vQ2();
                            if (c0jqjVQ25 != null && (arrayList = c0jqjVQ25.LLILZ) != null) {
                                arrayList.add(Long.valueOf(j));
                            }
                        }
                    } else if (!((C0JQJ) interfaceC2753014t).LLILZ.contains(Long.valueOf(c491960JRa.LIZ.emoteId))) {
                        return;
                    } else {
                        ((C0JQJ) interfaceC2753014t).LLILZ.remove(Long.valueOf(c491960JRa.LIZ.emoteId));
                    }
                    EmotePollEditVM emotePollEditVM2 = this.LLILLJJLI;
                    emotePollEditVM2.getClass();
                    emotePollEditVM2.setState(new C491750JQf());
                }
            });
            this.LLIZLLLIL.setChecked(C176600m4.LIZIZ(Boolean.valueOf(((C0JQJ) interfaceC2753014t).LLILZ.contains(Long.valueOf(c491960JRa.LIZ.emoteId)))));
            TextView textView = this.LLILZIL;
            User user = c491960JRa.LIZ.userInfo;
            if (user == null || (nickName = user.getNickName()) == null) {
                nickName = "";
            }
            textView.setText(nickName);
            int iFloor = (int) Math.floor((c491960JRa.LIZ.validExpireTime - (new Date().getTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT))) / TimeUnit.DAYS.toSeconds(1L));
            boolean z = false;
            if (iFloor < 0) {
                iFloor = 0;
            }
            this.LLILZLL.setText(C497740JfY.LJIIL(2131755827, iFloor, Integer.valueOf(iFloor)));
            C491980JRc.L5(c491960JRa.LIZ, this.LLILLL);
            C474270Iin.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), c491960JRa.LIZ.userInfo, this.LLILZ);
            C0KVZ c0kvz = this.LLIZ;
            UserEmote userEmote = c491960JRa.LIZ;
            List<BadgeStruct> list = userEmote.badgeList;
            User user2 = userEmote.userInfo;
            if (list != null && !list.isEmpty()) {
                C786410Ut5.LLJZ(c0kvz, 0);
                if (user2 != null) {
                    if (Boolean.FALSE == null) {
                        z = true;
                    }
                    c0kvz.LLILZLL = z;
                    c0kvz.LIZLLL();
                    c0kvz.LJ(false, list, user2, 10, new C492020JRg(c0kvz), null, false);
                    return;
                }
                return;
            }
            C786410Ut5.LLJZ(c0kvz, 8);
        }
    }
}
