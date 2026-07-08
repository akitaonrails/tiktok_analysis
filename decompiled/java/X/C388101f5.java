package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multiguestv3.PlaybookQueueEntityStatusChannel;
import com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.QueueInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.api.sub.SubQueueActionRequest;

/* JADX INFO: renamed from: X.01f5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C388101f5 {
    public long LIZ;
    public String LIZIZ;
    public int LIZJ;
    public final DataChannel LIZLLL;
    public final C054G LJ;
    public AnonymousClass0956 LJFF;
    public final C11NJ LJI;

    public final void LIZIZ() {
        InterfaceC390601fU effectBoardService = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEffectBoardService("anchor", "");
        if (effectBoardService != null) {
            effectBoardService.LIZIZ(this.LIZ, false);
        }
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel != null) {
            dataChannel.zW(PlaybookQueueEntityStatusChannel.class, Boolean.FALSE);
        }
    }

    public static void LIZJ(boolean z) throws JSONException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_success", z);
        C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, new C1323820kYO(jSONObject), "anchor_subscribe_queue_start_result"));
    }

    public final C388801fC LIZLLL(long j) {
        InterfaceC395901gL interfaceC395901gLLJIIJJI;
        InterfaceC390601fU effectBoardService = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEffectBoardService("anchor", "");
        if (effectBoardService != null && (interfaceC395901gLLJIIJJI = effectBoardService.LJIIJJI(j)) != null && (interfaceC395901gLLJIIJJI instanceof C388801fC)) {
            return (C388801fC) interfaceC395901gLLJIIJJI;
        }
        return new C388801fC(this.LIZJ, j, this.LIZLLL);
    }

    public final void LIZ(long j, Context context) {
        String str;
        C11KS c11ksLJIIJ;
        char c;
        if (this.LIZ <= 0) {
            return;
        }
        InterfaceC390601fU effectBoardService = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEffectBoardService("anchor", "");
        if (effectBoardService != null) {
            effectBoardService.LJ();
        }
        InterfaceC1814530xJr boardsDisplayStateManager = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getBoardsDisplayStateManager();
        if (boardsDisplayStateManager != null) {
            boardsDisplayStateManager.LJIIJJI();
        }
        C388801fC c388801fCLIZLLL = LIZLLL(this.LIZ);
        C388501f9 c388501f9 = new C388501f9();
        CharSequence charSequence = this.LIZIZ;
        View viewLIZIZ = C397101gX.LIZIZ(c388801fCLIZLLL, context);
        viewLIZIZ.setLayoutDirection(C497740JfY.LJJ() ? 1 : 0);
        c388801fCLIZLLL.LLILLJJLI = viewLIZIZ;
        TextView textView = (TextView) viewLIZIZ.findViewById(R.id.c6h);
        if (textView != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (C497740JfY.LJJ()) {
                c = 8207;
            } else {
                c = 8206;
            }
            spannableStringBuilder2.append(c);
            spannableStringBuilder2.append((char) 65532);
            Drawable drawableLJIIJ = C497740JfY.LJIIJ(R.drawable.d1a);
            if (drawableLJIIJ != null) {
                drawableLJIIJ.setBounds(0, 0, (int) C497740JfY.LIZIZ(16.0f), (int) C497740JfY.LIZIZ(16.0f));
            }
            C416770GVv c416770GVv = new C416770GVv(drawableLJIIJ);
            c416770GVv.LLILLL = (int) C497740JfY.LIZIZ(4.0f);
            C786410Ut5.q2(spannableStringBuilder2, c416770GVv, spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
            spannableStringBuilder.append(charSequence);
            textView.setText(spannableStringBuilder);
        }
        TextView textView2 = (TextView) viewLIZIZ.findViewById(R.id.c6g);
        c388801fCLIZLLL.LLILLL = textView2;
        if (textView2 != null) {
            textView2.setText(C497740JfY.LJIJJ(2131855470, Long.valueOf(j)));
        }
        viewLIZIZ.requestLayout();
        C397301gZ c397301gZ = c388801fCLIZLLL.LLILZLL;
        int i = c388801fCLIZLLL.LL;
        if (i != 0) {
            if (i != 1) {
                str = "";
            } else {
                str = "subscribers";
            }
        } else {
            str = "followers";
        }
        c397301gZ.LJII = str;
        c397301gZ.LJI = "queue";
        c397301gZ.LJIIIIZZ = CardStruct.IStatusCode.DEFAULT;
        InterfaceC390601fU effectBoardService2 = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEffectBoardService("anchor", "");
        if (effectBoardService2 != null && (c11ksLJIIJ = effectBoardService2.LJIIJ(context, c388801fCLIZLLL, c388501f9)) != null) {
            c11ksLJIIJ.LJJIIZ(new C09JN() { // from class: X.01f1
                @Override // X.C09JN
                public final void accept(Object obj) {
                    String str2;
                    long j2;
                    QueueInfo queueInfo;
                    C1C7U.LIZ("QueueBoardPresent@5aad.addQueueBoard$1");
                    if (((Boolean) obj).booleanValue()) {
                        C388101f5 c388101f5 = this.LL;
                        c388101f5.getClass();
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_queue_board_show");
                        c474500IjALIZ.LJJII("anchor", "user_type");
                        c474500IjALIZ.LJJII(Long.valueOf(c388101f5.LIZ), "queue_id");
                        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                        c474500IjALIZ.LJJII(Long.valueOf(C500260Jjc.LJJLIIIJ(c388101f5.LIZLLL)), "room_id");
                        int i2 = c388101f5.LIZJ;
                        if (i2 != 0) {
                            if (i2 != 1) {
                                str2 = "";
                            } else {
                                str2 = "subscribers";
                            }
                        } else {
                            str2 = "followers";
                        }
                        c474500IjALIZ.LJJII(str2, "queue_user_type");
                        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(c388101f5.LIZLLL);
                        if (roomLJJLIIIIJ != null && (queueInfo = roomLJJLIIIIJ.queueInfo) != null) {
                            j2 = queueInfo.memberCount;
                        } else {
                            j2 = 0;
                        }
                        c474500IjALIZ.LJJII(Long.valueOf(j2), "queue_viewers_cnt");
                        c474500IjALIZ.LIZ();
                        final C388101f5 c388101f52 = this.LL;
                        long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(c388101f52.LIZLLL);
                        C480460Ism.LIZ().getClass();
                        PcsApi pcsApi = (PcsApi) C480460Ism.LIZLLL(PcsApi.class);
                        SubQueueActionRequest subQueueActionRequest = new SubQueueActionRequest();
                        subQueueActionRequest.queueId = String.valueOf(c388101f52.LIZ);
                        subQueueActionRequest.roomId = String.valueOf(jLJJLIIIJ);
                        subQueueActionRequest.action = 1;
                        c388101f52.LJI.LIZ(C1808280x9m.LJFF(pcsApi.doSubQueueAction(subQueueActionRequest), null, "/sub/queue/action", null, 13).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.01f2
                            @Override // X.C09JN
                            public final void accept(Object obj2) throws JSONException {
                                C1C7U.LIZ("QueueBoardPresent@5aad.requestStartQueueApi$2");
                                c388101f52.getClass();
                                C388101f5.LIZJ(true);
                                C1C7U.LIZIZ("QueueBoardPresent@5aad.requestStartQueueApi$2");
                            }
                        }, new C09JN() { // from class: X.01f3
                            @Override // X.C09JN
                            public final void accept(Object obj2) throws JSONException {
                                C1C7U.LIZ("QueueBoardPresent@5aad.requestStartQueueApi$3");
                                c388101f52.LIZIZ();
                                c388101f52.getClass();
                                C388101f5.LIZJ(false);
                                C1C7U.LIZIZ("QueueBoardPresent@5aad.requestStartQueueApi$3");
                            }
                        }));
                    }
                    C1C7U.LIZIZ("QueueBoardPresent@5aad.addQueueBoard$1");
                }
            }, new C09JN() { // from class: X.00KA
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("QueueBoardPresent@5aad.addQueueBoard$2");
                    C766270U4b.LJIIJJI(((Throwable) obj).getMessage());
                    C1C7U.LIZIZ("QueueBoardPresent@5aad.addQueueBoard$2");
                }
            });
        }
    }

    public final void LJ(long j, Context context) {
        C11KS c11ksLJIIJ;
        C388801fC c388801fCLIZLLL = LIZLLL(this.LIZ);
        C388501f9 c388501f9 = new C388501f9();
        String strLJIJJ = C497740JfY.LJIJJ(2131855470, Long.valueOf(j));
        TextView textView = c388801fCLIZLLL.LLILLL;
        if (textView != null) {
            textView.setText(strLJIJJ);
        }
        c388501f9.LIZ = EnumC395001gC.FADE;
        InterfaceC390601fU effectBoardService = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEffectBoardService("anchor", "");
        if (effectBoardService != null && (c11ksLJIIJ = effectBoardService.LJIIJ(context, c388801fCLIZLLL, c388501f9)) != null) {
            c11ksLJIIJ.LJJIIZ(new C09JN() { // from class: X.00M1
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("QueueBoardPresent@5aad.updateQueueCountNumber$1");
                    C1C7U.LIZIZ("QueueBoardPresent@5aad.updateQueueCountNumber$1");
                }
            }, new C09JN() { // from class: X.00KC
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("QueueBoardPresent@5aad.updateQueueCountNumber$2");
                    C766270U4b.LJIIJJI(((Throwable) obj).getMessage());
                    C1C7U.LIZIZ("QueueBoardPresent@5aad.updateQueueCountNumber$2");
                }
            });
        }
    }

    public C388101f5(int i, long j, DataChannel dataChannel, String str) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = dataChannel;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LJ = C2296808zG.LIZ(C2107308Nj.LIZ.plus(C23118094a.LIZ()));
        this.LJI = new C11NJ();
    }
}
