package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.cell.MentionBaseVerticalCell;
import com.ss.android.ugc.aweme.business.caption.cell.TextCaptionMentionCell;
import com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell;
import com.ss.android.ugc.aweme.business.sticker.cell.MentionStickerCell;
import com.ss.android.ugc.aweme.explore.assem.ExploreRecommendTopicCell;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicStruct;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.16Hx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20750716Hx extends AbstractC2211791BhR {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final int LIZJ$0(C20750716Hx c20750716Hx) {
        return 0;
    }

    @Override // X.AbstractC2211791BhR
    public final int LIZJ() {
        return 4 - this.$t != 0 ? super.LIZJ() : LIZJ$0(this);
    }

    @Override // X.AbstractC2211791BhR
    public final Function0<String> LIZLLL() {
        switch (this.$t) {
            case 0:
                return LIZLLL$0(this);
            case 1:
                return LIZLLL$1(this);
            case 2:
                return LIZLLL$2(this);
            case 3:
                return LIZLLL$3(this);
            case 4:
                return LIZLLL$4(this);
            default:
                return super.LIZLLL();
        }
    }

    @Override // X.AbstractC2211791BhR
    public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
        switch (this.$t) {
            case 0:
                return LJFF$0(this);
            case 1:
                return LJFF$1(this);
            case 2:
                return LJFF$2(this);
            case 3:
                return LJFF$3(this);
            case 4:
                return LJFF$4(this);
            default:
                return super.LJFF();
        }
    }

    @Override // X.AbstractC2211791BhR
    public final float LJIIL() {
        return 4 - this.$t != 0 ? super.LJIIL() : LJIIL$0(this);
    }

    @Override // X.AbstractC2211791BhR
    public final void LJIILL(Function0<String> function0) {
        switch (this.$t) {
            case 0:
                this.l0 = function0;
                break;
            case 1:
                this.l0 = function0;
                break;
            case 2:
                this.l0 = function0;
                break;
            case 3:
                this.l0 = function0;
                break;
            case 4:
                this.l1 = function0;
                break;
            default:
                super.LJIILL(function0);
                break;
        }
    }

    public static final Function0 LIZLLL$0(C20750716Hx c20750716Hx) {
        return (Function0) c20750716Hx.l0;
    }

    public static final Function0 LIZLLL$1(C20750716Hx c20750716Hx) {
        return (Function0) c20750716Hx.l0;
    }

    public static final Function0 LIZLLL$2(C20750716Hx c20750716Hx) {
        return (Function0) c20750716Hx.l0;
    }

    public static final Function0 LIZLLL$3(C20750716Hx c20750716Hx) {
        return (Function0) c20750716Hx.l0;
    }

    public static final Function0 LIZLLL$4(C20750716Hx c20750716Hx) {
        return (Function0) c20750716Hx.l1;
    }

    public static final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF$0(C20750716Hx c20750716Hx) {
        return (C16HV) c20750716Hx.l1;
    }

    public static final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF$1(C20750716Hx c20750716Hx) {
        return (C16HV) c20750716Hx.l1;
    }

    public static final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF$2(C20750716Hx c20750716Hx) {
        return (C16HV) c20750716Hx.l1;
    }

    public static final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF$3(C20750716Hx c20750716Hx) {
        return (C16HV) c20750716Hx.l1;
    }

    public static final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF$4(C20750716Hx c20750716Hx) {
        return (C16HV) c20750716Hx.l0;
    }

    public static final float LJIIL$0(C20750716Hx c20750716Hx) {
        return (float) ((Number) C282030B3p.LIZ.getValue()).doubleValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20750716Hx(final MentionBaseVerticalCell mentionBaseVerticalCell, MentionBaseVerticalCell<T> mentionBaseVerticalCell2) {
        this.$t = mentionBaseVerticalCell2;
        this.l0 = new AwS575S0100000_31(mentionBaseVerticalCell, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        final int i = 0;
        this.l1 = new InterfaceC2211931Bhf(mentionBaseVerticalCell, i) { // from class: X.16HV
            public final int $t;
            public Object l0;

            @Override // X.InterfaceC2211931Bhf
            public final void LIZ(View view, String str) {
                switch (this.$t) {
                    case 0:
                        LIZ$0(this, view, str);
                        break;
                    case 1:
                        LIZ$1(this, view, str);
                        break;
                    case 2:
                        LIZ$2(this, view, str);
                        break;
                    case 3:
                        LIZ$3(this, view, str);
                        break;
                    case 4:
                        LIZ$4(this, view, str);
                        break;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$t = i;
                this.l0 = mentionBaseVerticalCell;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static final void LIZ$0(C16HV c16hv, View view, String str) {
                C20611915l7 c20611915l7;
                C316580Cb2 c316580Cb2 = (C316580Cb2) ((MentionBaseVerticalCell) c16hv.l0).getItem();
                if (c316580Cb2 != null && (c20611915l7 = c316580Cb2.LL) != null) {
                    String str2 = ((MentionBaseVerticalCell) c16hv.l0).N5().vQ2().get("enter_from");
                    if (str2 == null) {
                        str2 = "";
                    }
                    C20610815kw c20610815kw = C20610815kw.LIZ;
                    String strU5 = ((MentionBaseVerticalCell) c16hv.l0).U5();
                    c20610815kw.getClass();
                    C20610815kw.LJI(c20611915l7, str2, str2, strU5, "", null, null, null, null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static final void LIZ$1(C16HV c16hv, View view, String str) {
                C20611915l7 c20611915l7;
                Map<String, String> mapVQ2 = ((TextCaptionMentionCell) c16hv.l0).N5().vQ2();
                C20610815kw c20610815kw = C20610815kw.LIZ;
                String str2 = mapVQ2.get("enter_from");
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                String str4 = mapVQ2.get("previous_page");
                if (str4 != null) {
                    str3 = str4;
                }
                C316580Cb2 c316580Cb2 = (C316580Cb2) ((TextCaptionMentionCell) c16hv.l0).getItem();
                if (c316580Cb2 == null || (c20611915l7 = c316580Cb2.LL) == null) {
                    c20611915l7 = new C20611915l7((String) null, 0, 0, (String) null, (String) null, (UrlModel) null, (String) null, (String) null, 0, (String) null, false, (String) null, (C20611315l1) null, 16383);
                }
                String strWQ2 = ((TextCaptionMentionCell) c16hv.l0).N5().wQ2();
                String str5 = mapVQ2.get("shoot_way");
                String str6 = mapVQ2.get("content_source");
                String str7 = mapVQ2.get("content_type");
                String str8 = mapVQ2.get("is_note");
                c20610815kw.getClass();
                C20610815kw.LJI(c20611915l7, str2, str3, "sticker_mention", strWQ2, str5, str6, str7, str8);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static final void LIZ$2(X.C16HV r8, android.view.View r9, java.lang.String r10) {
                /*
                    java.lang.Object r0 = r8.l0
                    com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell r0 = (com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell) r0
                    X.0zJl r0 = r0.getItem()
                    X.0Cb2 r0 = (X.C316580Cb2) r0
                    if (r0 == 0) goto L4b
                    X.15l7 r2 = r0.LL
                    if (r2 == 0) goto L4b
                    java.lang.Object r0 = r8.l0
                    com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell r0 = (com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell) r0
                    com.ss.android.ugc.aweme.base.vm.MentionContainerViewModel r0 = r0.N5()
                    java.util.Map r1 = r0.vQ2()
                    java.lang.String r0 = "enter_from"
                    java.lang.Object r3 = r1.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L28
                    java.lang.String r3 = ""
                L28:
                    X.15kw r1 = X.C20610815kw.LIZ
                    java.lang.Object r0 = r8.l0
                    com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell r0 = (com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell) r0
                    com.ss.android.ugc.aweme.base.vm.MentionContainerViewModel r0 = r0.N5()
                    X.15lG r0 = r0.LL
                    if (r0 == 0) goto L4c
                    java.lang.String r5 = r0.LJIIL
                    int r0 = r5.length()
                    if (r0 <= 0) goto L4c
                L3e:
                    r7 = 0
                    java.lang.String r6 = ""
                    r1.getClass()
                    r4 = r3
                    r8 = r7
                    r9 = r7
                    r10 = r7
                    X.C20610815kw.LJI(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                L4b:
                    return
                L4c:
                    java.lang.String r5 = "repost_mention"
                    goto L3e
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C16HV.LIZ$2(X.16HV, android.view.View, java.lang.String):void");
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static final void LIZ$3(C16HV c16hv, View view, String str) {
                C20611915l7 c20611915l7;
                Map<String, String> mapVQ2 = ((MentionStickerCell) c16hv.l0).N5().vQ2();
                C20610815kw c20610815kw = C20610815kw.LIZ;
                String str2 = mapVQ2.get("enter_from");
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                String str4 = mapVQ2.get("previous_page");
                if (str4 != null) {
                    str3 = str4;
                }
                C316580Cb2 c316580Cb2 = (C316580Cb2) ((MentionStickerCell) c16hv.l0).getItem();
                if (c316580Cb2 == null || (c20611915l7 = c316580Cb2.LL) == null) {
                    c20611915l7 = new C20611915l7((String) null, 0, 0, (String) null, (String) null, (UrlModel) null, (String) null, (String) null, 0, (String) null, false, (String) null, (C20611315l1) null, 16383);
                }
                String strWQ2 = ((MentionStickerCell) c16hv.l0).N5().wQ2();
                String str5 = mapVQ2.get("shoot_way");
                String str6 = mapVQ2.get("content_source");
                String str7 = mapVQ2.get("content_type");
                c20610815kw.getClass();
                C20610815kw.LJI(c20611915l7, str2, str3, "sticker_mention", strWQ2, str5, str6, str7, null);
            }

            public static final void LIZ$4(C16HV c16hv, View view, String str) {
                final List list;
                final Boolean boolValueOf;
                final String str2;
                C15TA c15ta = C15TA.LIZ;
                C20525915Tl item = ((ExploreRecommendTopicCell) c16hv.l0).getItem();
                if (item == null || (list = item.LLILZ) == null) {
                    list = C13BV.INSTANCE;
                }
                final String strI5 = ((ExploreRecommendTopicCell) c16hv.l0).I5();
                final int bindingAdapterPosition = ((ExploreRecommendTopicCell) c16hv.l0).getBindingAdapterPosition();
                C20525915Tl item2 = ((ExploreRecommendTopicCell) c16hv.l0).getItem();
                if (item2 != null) {
                    boolValueOf = Boolean.valueOf(item2.LLILLL);
                } else {
                    boolValueOf = null;
                }
                C20525915Tl item3 = ((ExploreRecommendTopicCell) c16hv.l0).getItem();
                if (item3 == null || (str2 = item3.LLILLJJLI) == null) {
                    str2 = "";
                }
                c15ta.getClass();
                if (list.size() >= 4) {
                    C15TA.LJIILL(new Runnable() { // from class: X.0RTq
                        public final void LIZ() {
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJ(((ExploreCustomTopicStruct) ListProtector.get(list, 0)).topicId, "position1_topic_id");
                            c2344009Gk.LJ(((ExploreCustomTopicStruct) ListProtector.get(list, 1)).topicId, "position2_topic_id");
                            c2344009Gk.LJ(((ExploreCustomTopicStruct) ListProtector.get(list, 2)).topicId, "position3_topic_id");
                            c2344009Gk.LJ(((ExploreCustomTopicStruct) ListProtector.get(list, 3)).topicId, "position4_topic_id");
                            c2344009Gk.LJIIIIZZ("position1_topic_name", ((ExploreCustomTopicStruct) ListProtector.get(list, 0)).topicName);
                            c2344009Gk.LJIIIIZZ("position2_topic_name", ((ExploreCustomTopicStruct) ListProtector.get(list, 1)).topicName);
                            c2344009Gk.LJIIIIZZ("position3_topic_name", ((ExploreCustomTopicStruct) ListProtector.get(list, 2)).topicName);
                            c2344009Gk.LJIIIIZZ("position4_topic_name", ((ExploreCustomTopicStruct) ListProtector.get(list, 3)).topicName);
                            c2344009Gk.LJIIIIZZ("enter_from", "homepage_explore");
                            c2344009Gk.LJIIIIZZ("card_position", strI5);
                            c2344009Gk.LIZJ(bindingAdapterPosition, "card_index");
                            c2344009Gk.LIZJ(Intrinsics.LJFF(boolValueOf, Boolean.TRUE) ? 1 : 0, "is_first_screen");
                            c2344009Gk.LJIIIIZZ("request_id", str2);
                            c2344009Gk.LJIIIIZZ("is_first_refresh", C15UA.LIZIZ(str2));
                            C20684815ws.LJIILLIIL("ttexp_topic_card_show", c2344009Gk.LIZ);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("ExploreMobUtils@18af.logTopicCardShow$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("ExploreMobUtils@18af.logTopicCardShow$1");
                        }
                    });
                }
            }
        };
    }

    public C20750716Hx(final TextCaptionMentionCell textCaptionMentionCell, int i) {
        this.$t = i;
        this.l0 = new AwS575S0100000_31(textCaptionMentionCell, 309);
        final int i2 = 1;
        this.l1 = new InterfaceC2211931Bhf(textCaptionMentionCell, i2) { // from class: X.16HV
            public final int $t;
            public Object l0;

            @Override // X.InterfaceC2211931Bhf
            public final void LIZ(View view, String str) {
                switch (this.$t) {
                    case 0:
                        LIZ$0(this, view, str);
                        break;
                    case 1:
                        LIZ$1(this, view, str);
                        break;
                    case 2:
                        LIZ$2(this, view, str);
                        break;
                    case 3:
                        LIZ$3(this, view, str);
                        break;
                    case 4:
                        LIZ$4(this, view, str);
                        break;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$t = i2;
                this.l0 = textCaptionMentionCell;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static final void LIZ$0(C16HV c16hv, View view, String str) {
                C20611915l7 c20611915l7;
                C316580Cb2 c316580Cb2 = (C316580Cb2) ((MentionBaseVerticalCell) c16hv.l0).getItem();
                if (c316580Cb2 != null && (c20611915l7 = c316580Cb2.LL) != null) {
                    String str2 = ((MentionBaseVerticalCell) c16hv.l0).N5().vQ2().get("enter_from");
                    if (str2 == null) {
                        str2 = "";
                    }
                    C20610815kw c20610815kw = C20610815kw.LIZ;
                    String strU5 = ((MentionBaseVerticalCell) c16hv.l0).U5();
                    c20610815kw.getClass();
                    C20610815kw.LJI(c20611915l7, str2, str2, strU5, "", null, null, null, null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static final void LIZ$1(C16HV c16hv, View view, String str) {
                C20611915l7 c20611915l7;
                Map<String, String> mapVQ2 = ((TextCaptionMentionCell) c16hv.l0).N5().vQ2();
                C20610815kw c20610815kw = C20610815kw.LIZ;
                String str2 = mapVQ2.get("enter_from");
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                String str4 = mapVQ2.get("previous_page");
                if (str4 != null) {
                    str3 = str4;
                }
                C316580Cb2 c316580Cb2 = (C316580Cb2) ((TextCaptionMentionCell) c16hv.l0).getItem();
                if (c316580Cb2 == null || (c20611915l7 = c316580Cb2.LL) == null) {
                    c20611915l7 = new C20611915l7((String) null, 0, 0, (String) null, (String) null, (UrlModel) null, (String) null, (String) null, 0, (String) null, false, (String) null, (C20611315l1) null, 16383);
                }
                String strWQ2 = ((TextCaptionMentionCell) c16hv.l0).N5().wQ2();
                String str5 = mapVQ2.get("shoot_way");
                String str6 = mapVQ2.get("content_source");
                String str7 = mapVQ2.get("content_type");
                String str8 = mapVQ2.get("is_note");
                c20610815kw.getClass();
                C20610815kw.LJI(c20611915l7, str2, str3, "sticker_mention", strWQ2, str5, str6, str7, str8);
            }

            public static final void LIZ$2(C16HV v, View v2, String v3) {
                /*
                    java.lang.Object r0 = r8.l0
                    com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell r0 = (com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell) r0
                    X.0zJl r0 = r0.getItem()
                    X.0Cb2 r0 = (X.C316580Cb2) r0
                    if (r0 == 0) goto L4b
                    X.15l7 r2 = r0.LL
                    if (r2 == 0) goto L4b
                    java.lang.Object r0 = r8.l0
                    com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell r0 = (com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell) r0
                    com.ss.android.ugc.aweme.base.vm.MentionContainerViewModel r0 = r0.N5()
                    java.util.Map r1 = r0.vQ2()
                    java.lang.String r0 = "enter_from"
                    java.lang.Object r3 = r1.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L28
                    java.lang.String r3 = ""
                L28:
                    X.15kw r1 = X.C20610815kw.LIZ
                    java.lang.Object r0 = r8.l0
                    com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell r0 = (com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell) r0
                    com.ss.android.ugc.aweme.base.vm.MentionContainerViewModel r0 = r0.N5()
                    X.15lG r0 = r0.LL
                    if (r0 == 0) goto L4c
                    java.lang.String r5 = r0.LJIIL
                    int r0 = r5.length()
                    if (r0 <= 0) goto L4c
                L3e:
                    r7 = 0
                    java.lang.String r6 = ""
                    r1.getClass()
                    r4 = r3
                    r8 = r7
                    r9 = r7
                    r10 = r7
                    X.C20610815kw.LJI(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                L4b:
                    return
                L4c:
                    java.lang.String r5 = "repost_mention"
                    goto L3e
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C16HV.LIZ$2(X.16HV, android.view.View, java.lang.String):void");
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static final void LIZ$3(C16HV c16hv, View view, String str) {
                C20611915l7 c20611915l7;
                Map<String, String> mapVQ2 = ((MentionStickerCell) c16hv.l0).N5().vQ2();
                C20610815kw c20610815kw = C20610815kw.LIZ;
                String str2 = mapVQ2.get("enter_from");
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                String str4 = mapVQ2.get("previous_page");
                if (str4 != null) {
                    str3 = str4;
                }
                C316580Cb2 c316580Cb2 = (C316580Cb2) ((MentionStickerCell) c16hv.l0).getItem();
                if (c316580Cb2 == null || (c20611915l7 = c316580Cb2.LL) == null) {
                    c20611915l7 = new C20611915l7((String) null, 0, 0, (String) null, (String) null, (UrlModel) null, (String) null, (String) null, 0, (String) null, false, (String) null, (C20611315l1) null, 16383);
                }
                String strWQ2 = ((MentionStickerCell) c16hv.l0).N5().wQ2();
                String str5 = mapVQ2.get("shoot_way");
                String str6 = mapVQ2.get("content_source");
                String str7 = mapVQ2.get("content_type");
                c20610815kw.getClass();
                C20610815kw.LJI(c20611915l7, str2, str3, "sticker_mention", strWQ2, str5, str6, str7, null);
            }

            public static final void LIZ$4(C16HV c16hv, View view, String str) {
                final List list;
                final Boolean boolValueOf;
                final String str2;
                C15TA c15ta = C15TA.LIZ;
                C20525915Tl item = ((ExploreRecommendTopicCell) c16hv.l0).getItem();
                if (item == null || (list = item.LLILZ) == null) {
                    list = C13BV.INSTANCE;
                }
                final String strI5 = ((ExploreRecommendTopicCell) c16hv.l0).I5();
                final int bindingAdapterPosition = ((ExploreRecommendTopicCell) c16hv.l0).getBindingAdapterPosition();
                C20525915Tl item2 = ((ExploreRecommendTopicCell) c16hv.l0).getItem();
                if (item2 != null) {
                    boolValueOf = Boolean.valueOf(item2.LLILLL);
                } else {
                    boolValueOf = null;
                }
                C20525915Tl item3 = ((ExploreRecommendTopicCell) c16hv.l0).getItem();
                if (item3 == null || (str2 = item3.LLILLJJLI) == null) {
                    str2 = "";
                }
                c15ta.getClass();
                if (list.size() >= 4) {
                    C15TA.LJIILL(new Runnable() { // from class: X.0RTq
                        public final void LIZ() {
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJ(((ExploreCustomTopicStruct) ListProtector.get(list, 0)).topicId, "position1_topic_id");
                            c2344009Gk.LJ(((ExploreCustomTopicStruct) ListProtector.get(list, 1)).topicId, "position2_topic_id");
                            c2344009Gk.LJ(((ExploreCustomTopicStruct) ListProtector.get(list, 2)).topicId, "position3_topic_id");
                            c2344009Gk.LJ(((ExploreCustomTopicStruct) ListProtector.get(list, 3)).topicId, "position4_topic_id");
                            c2344009Gk.LJIIIIZZ("position1_topic_name", ((ExploreCustomTopicStruct) ListProtector.get(list, 0)).topicName);
                            c2344009Gk.LJIIIIZZ("position2_topic_name", ((ExploreCustomTopicStruct) ListProtector.get(list, 1)).topicName);
                            c2344009Gk.LJIIIIZZ("position3_topic_name", ((ExploreCustomTopicStruct) ListProtector.get(list, 2)).topicName);
                            c2344009Gk.LJIIIIZZ("position4_topic_name", ((ExploreCustomTopicStruct) ListProtector.get(list, 3)).topicName);
                            c2344009Gk.LJIIIIZZ("enter_from", "homepage_explore");
                            c2344009Gk.LJIIIIZZ("card_position", strI5);
                            c2344009Gk.LIZJ(bindingAdapterPosition, "card_index");
                            c2344009Gk.LIZJ(Intrinsics.LJFF(boolValueOf, Boolean.TRUE) ? 1 : 0, "is_first_screen");
                            c2344009Gk.LJIIIIZZ("request_id", str2);
                            c2344009Gk.LJIIIIZZ("is_first_refresh", C15UA.LIZIZ(str2));
                            C20684815ws.LJIILLIIL("ttexp_topic_card_show", c2344009Gk.LIZ);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("ExploreMobUtils@18af.logTopicCardShow$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("ExploreMobUtils@18af.logTopicCardShow$1");
                        }
                    });
                }
            }
        };
    }

    public C20750716Hx(final RepostMentionHorizontalCell repostMentionHorizontalCell, int i) {
        this.$t = i;
        this.l0 = new AwS575S0100000_31(repostMentionHorizontalCell, 314);
        final int i2 = 2;
        this.l1 = new InterfaceC2211931Bhf(repostMentionHorizontalCell, i2) { // from class: X.16HV
            public final int $t;
            public Object l0;

            @Override // X.InterfaceC2211931Bhf
            public final void LIZ(View view, String str) {
                switch (this.$t) {
                    case 0:
                        LIZ$0(this, view, str);
                        break;
                    case 1:
                        LIZ$1(this, view, str);
                        break;
                    case 2:
                        LIZ$2(this, view, str);
                        break;
                    case 3:
                        LIZ$3(this, view, str);
                        break;
                    case 4:
                        LIZ$4(this, view, str);
                        break;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$t = i2;
                this.l0 = repostMentionHorizontalCell;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static final void LIZ$0(C16HV c16hv, View view, String str) {
                C20611915l7 c20611915l7;
                C316580Cb2 c316580Cb2 = (C316580Cb2) ((MentionBaseVerticalCell) c16hv.l0).getItem();
                if (c316580Cb2 != null && (c20611915l7 = c316580Cb2.LL) != null) {
                    String str2 = ((MentionBaseVerticalCell) c16hv.l0).N5().vQ2().get("enter_from");
                    if (str2 == null) {
                        str2 = "";
                    }
                    C20610815kw c20610815kw = C20610815kw.LIZ;
                    String strU5 = ((MentionBaseVerticalCell) c16hv.l0).U5();
                    c20610815kw.getClass();
                    C20610815kw.LJI(c20611915l7, str2, str2, strU5, "", null, null, null, null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static final void LIZ$1(C16HV c16hv, View view, String str) {
                C20611915l7 c20611915l7;
                Map<String, String> mapVQ2 = ((TextCaptionMentionCell) c16hv.l0).N5().vQ2();
                C20610815kw c20610815kw = C20610815kw.LIZ;
                String str2 = mapVQ2.get("enter_from");
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                String str4 = mapVQ2.get("previous_page");
                if (str4 != null) {
                    str3 = str4;
                }
                C316580Cb2 c316580Cb2 = (C316580Cb2) ((TextCaptionMentionCell) c16hv.l0).getItem();
                if (c316580Cb2 == null || (c20611915l7 = c316580Cb2.LL) == null) {
                    c20611915l7 = new C20611915l7((String) null, 0, 0, (String) null, (String) null, (UrlModel) null, (String) null, (String) null, 0, (String) null, false, (String) null, (C20611315l1) null, 16383);
                }
                String strWQ2 = ((TextCaptionMentionCell) c16hv.l0).N5().wQ2();
                String str5 = mapVQ2.get("shoot_way");
                String str6 = mapVQ2.get("content_source");
                String str7 = mapVQ2.get("content_type");
                String str8 = mapVQ2.get("is_note");
                c20610815kw.getClass();
                C20610815kw.LJI(c20611915l7, str2, str3, "sticker_mention", strWQ2, str5, str6, str7, str8);
            }

            public static final void LIZ$2(C16HV v, View v2, String v3) {
                /*
                    java.lang.Object r0 = r8.l0
                    com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell r0 = (com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell) r0
                    X.0zJl r0 = r0.getItem()
                    X.0Cb2 r0 = (X.C316580Cb2) r0
                    if (r0 == 0) goto L4b
                    X.15l7 r2 = r0.LL
                    if (r2 == 0) goto L4b
                    java.lang.Object r0 = r8.l0
                    com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell r0 = (com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell) r0
                    com.ss.android.ugc.aweme.base.vm.MentionContainerViewModel r0 = r0.N5()
                    java.util.Map r1 = r0.vQ2()
                    java.lang.String r0 = "enter_from"
                    java.lang.Object r3 = r1.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L28
                    java.lang.String r3 = ""
                L28:
                    X.15kw r1 = X.C20610815kw.LIZ
                    java.lang.Object r0 = r8.l0
                    com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell r0 = (com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell) r0
                    com.ss.android.ugc.aweme.base.vm.MentionContainerViewModel r0 = r0.N5()
                    X.15lG r0 = r0.LL
                    if (r0 == 0) goto L4c
                    java.lang.String r5 = r0.LJIIL
                    int r0 = r5.length()
                    if (r0 <= 0) goto L4c
                L3e:
                    r7 = 0
                    java.lang.String r6 = ""
                    r1.getClass()
                    r4 = r3
                    r8 = r7
                    r9 = r7
                    r10 = r7
                    X.C20610815kw.LJI(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                L4b:
                    return
                L4c:
                    java.lang.String r5 = "repost_mention"
                    goto L3e
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C16HV.LIZ$2(X.16HV, android.view.View, java.lang.String):void");
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static final void LIZ$3(C16HV c16hv, View view, String str) {
                C20611915l7 c20611915l7;
                Map<String, String> mapVQ2 = ((MentionStickerCell) c16hv.l0).N5().vQ2();
                C20610815kw c20610815kw = C20610815kw.LIZ;
                String str2 = mapVQ2.get("enter_from");
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                String str4 = mapVQ2.get("previous_page");
                if (str4 != null) {
                    str3 = str4;
                }
                C316580Cb2 c316580Cb2 = (C316580Cb2) ((MentionStickerCell) c16hv.l0).getItem();
                if (c316580Cb2 == null || (c20611915l7 = c316580Cb2.LL) == null) {
                    c20611915l7 = new C20611915l7((String) null, 0, 0, (String) null, (String) null, (UrlModel) null, (String) null, (String) null, 0, (String) null, false, (String) null, (C20611315l1) null, 16383);
                }
                String strWQ2 = ((MentionStickerCell) c16hv.l0).N5().wQ2();
                String str5 = mapVQ2.get("shoot_way");
                String str6 = mapVQ2.get("content_source");
                String str7 = mapVQ2.get("content_type");
                c20610815kw.getClass();
                C20610815kw.LJI(c20611915l7, str2, str3, "sticker_mention", strWQ2, str5, str6, str7, null);
            }

            public static final void LIZ$4(C16HV c16hv, View view, String str) {
                final List list;
                final Boolean boolValueOf;
                final String str2;
                C15TA c15ta = C15TA.LIZ;
                C20525915Tl item = ((ExploreRecommendTopicCell) c16hv.l0).getItem();
                if (item == null || (list = item.LLILZ) == null) {
                    list = C13BV.INSTANCE;
                }
                final String strI5 = ((ExploreRecommendTopicCell) c16hv.l0).I5();
                final int bindingAdapterPosition = ((ExploreRecommendTopicCell) c16hv.l0).getBindingAdapterPosition();
                C20525915Tl item2 = ((ExploreRecommendTopicCell) c16hv.l0).getItem();
                if (item2 != null) {
                    boolValueOf = Boolean.valueOf(item2.LLILLL);
                } else {
                    boolValueOf = null;
                }
                C20525915Tl item3 = ((ExploreRecommendTopicCell) c16hv.l0).getItem();
                if (item3 == null || (str2 = item3.LLILLJJLI) == null) {
                    str2 = "";
                }
                c15ta.getClass();
                if (list.size() >= 4) {
                    C15TA.LJIILL(new Runnable() { // from class: X.0RTq
                        public final void LIZ() {
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJ(((ExploreCustomTopicStruct) ListProtector.get(list, 0)).topicId, "position1_topic_id");
                            c2344009Gk.LJ(((ExploreCustomTopicStruct) ListProtector.get(list, 1)).topicId, "position2_topic_id");
                            c2344009Gk.LJ(((ExploreCustomTopicStruct) ListProtector.get(list, 2)).topicId, "position3_topic_id");
                            c2344009Gk.LJ(((ExploreCustomTopicStruct) ListProtector.get(list, 3)).topicId, "position4_topic_id");
                            c2344009Gk.LJIIIIZZ("position1_topic_name", ((ExploreCustomTopicStruct) ListProtector.get(list, 0)).topicName);
                            c2344009Gk.LJIIIIZZ("position2_topic_name", ((ExploreCustomTopicStruct) ListProtector.get(list, 1)).topicName);
                            c2344009Gk.LJIIIIZZ("position3_topic_name", ((ExploreCustomTopicStruct) ListProtector.get(list, 2)).topicName);
                            c2344009Gk.LJIIIIZZ("position4_topic_name", ((ExploreCustomTopicStruct) ListProtector.get(list, 3)).topicName);
                            c2344009Gk.LJIIIIZZ("enter_from", "homepage_explore");
                            c2344009Gk.LJIIIIZZ("card_position", strI5);
                            c2344009Gk.LIZJ(bindingAdapterPosition, "card_index");
                            c2344009Gk.LIZJ(Intrinsics.LJFF(boolValueOf, Boolean.TRUE) ? 1 : 0, "is_first_screen");
                            c2344009Gk.LJIIIIZZ("request_id", str2);
                            c2344009Gk.LJIIIIZZ("is_first_refresh", C15UA.LIZIZ(str2));
                            C20684815ws.LJIILLIIL("ttexp_topic_card_show", c2344009Gk.LIZ);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("ExploreMobUtils@18af.logTopicCardShow$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("ExploreMobUtils@18af.logTopicCardShow$1");
                        }
                    });
                }
            }
        };
    }

    public C20750716Hx(final MentionStickerCell mentionStickerCell, int i) {
        this.$t = i;
        this.l0 = new AwS575S0100000_31(mentionStickerCell, 321);
        final int i2 = 3;
        this.l1 = new InterfaceC2211931Bhf(mentionStickerCell, i2) { // from class: X.16HV
            public final int $t;
            public Object l0;

            @Override // X.InterfaceC2211931Bhf
            public final void LIZ(View view, String str) {
                switch (this.$t) {
                    case 0:
                        LIZ$0(this, view, str);
                        break;
                    case 1:
                        LIZ$1(this, view, str);
                        break;
                    case 2:
                        LIZ$2(this, view, str);
                        break;
                    case 3:
                        LIZ$3(this, view, str);
                        break;
                    case 4:
                        LIZ$4(this, view, str);
                        break;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$t = i2;
                this.l0 = mentionStickerCell;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static final void LIZ$0(C16HV c16hv, View view, String str) {
                C20611915l7 c20611915l7;
                C316580Cb2 c316580Cb2 = (C316580Cb2) ((MentionBaseVerticalCell) c16hv.l0).getItem();
                if (c316580Cb2 != null && (c20611915l7 = c316580Cb2.LL) != null) {
                    String str2 = ((MentionBaseVerticalCell) c16hv.l0).N5().vQ2().get("enter_from");
                    if (str2 == null) {
                        str2 = "";
                    }
                    C20610815kw c20610815kw = C20610815kw.LIZ;
                    String strU5 = ((MentionBaseVerticalCell) c16hv.l0).U5();
                    c20610815kw.getClass();
                    C20610815kw.LJI(c20611915l7, str2, str2, strU5, "", null, null, null, null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static final void LIZ$1(C16HV c16hv, View view, String str) {
                C20611915l7 c20611915l7;
                Map<String, String> mapVQ2 = ((TextCaptionMentionCell) c16hv.l0).N5().vQ2();
                C20610815kw c20610815kw = C20610815kw.LIZ;
                String str2 = mapVQ2.get("enter_from");
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                String str4 = mapVQ2.get("previous_page");
                if (str4 != null) {
                    str3 = str4;
                }
                C316580Cb2 c316580Cb2 = (C316580Cb2) ((TextCaptionMentionCell) c16hv.l0).getItem();
                if (c316580Cb2 == null || (c20611915l7 = c316580Cb2.LL) == null) {
                    c20611915l7 = new C20611915l7((String) null, 0, 0, (String) null, (String) null, (UrlModel) null, (String) null, (String) null, 0, (String) null, false, (String) null, (C20611315l1) null, 16383);
                }
                String strWQ2 = ((TextCaptionMentionCell) c16hv.l0).N5().wQ2();
                String str5 = mapVQ2.get("shoot_way");
                String str6 = mapVQ2.get("content_source");
                String str7 = mapVQ2.get("content_type");
                String str8 = mapVQ2.get("is_note");
                c20610815kw.getClass();
                C20610815kw.LJI(c20611915l7, str2, str3, "sticker_mention", strWQ2, str5, str6, str7, str8);
            }

            public static final void LIZ$2(C16HV v, View v2, String v3) {
                /*
                    java.lang.Object r0 = r8.l0
                    com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell r0 = (com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell) r0
                    X.0zJl r0 = r0.getItem()
                    X.0Cb2 r0 = (X.C316580Cb2) r0
                    if (r0 == 0) goto L4b
                    X.15l7 r2 = r0.LL
                    if (r2 == 0) goto L4b
                    java.lang.Object r0 = r8.l0
                    com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell r0 = (com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell) r0
                    com.ss.android.ugc.aweme.base.vm.MentionContainerViewModel r0 = r0.N5()
                    java.util.Map r1 = r0.vQ2()
                    java.lang.String r0 = "enter_from"
                    java.lang.Object r3 = r1.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L28
                    java.lang.String r3 = ""
                L28:
                    X.15kw r1 = X.C20610815kw.LIZ
                    java.lang.Object r0 = r8.l0
                    com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell r0 = (com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell) r0
                    com.ss.android.ugc.aweme.base.vm.MentionContainerViewModel r0 = r0.N5()
                    X.15lG r0 = r0.LL
                    if (r0 == 0) goto L4c
                    java.lang.String r5 = r0.LJIIL
                    int r0 = r5.length()
                    if (r0 <= 0) goto L4c
                L3e:
                    r7 = 0
                    java.lang.String r6 = ""
                    r1.getClass()
                    r4 = r3
                    r8 = r7
                    r9 = r7
                    r10 = r7
                    X.C20610815kw.LJI(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                L4b:
                    return
                L4c:
                    java.lang.String r5 = "repost_mention"
                    goto L3e
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C16HV.LIZ$2(X.16HV, android.view.View, java.lang.String):void");
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static final void LIZ$3(C16HV c16hv, View view, String str) {
                C20611915l7 c20611915l7;
                Map<String, String> mapVQ2 = ((MentionStickerCell) c16hv.l0).N5().vQ2();
                C20610815kw c20610815kw = C20610815kw.LIZ;
                String str2 = mapVQ2.get("enter_from");
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                String str4 = mapVQ2.get("previous_page");
                if (str4 != null) {
                    str3 = str4;
                }
                C316580Cb2 c316580Cb2 = (C316580Cb2) ((MentionStickerCell) c16hv.l0).getItem();
                if (c316580Cb2 == null || (c20611915l7 = c316580Cb2.LL) == null) {
                    c20611915l7 = new C20611915l7((String) null, 0, 0, (String) null, (String) null, (UrlModel) null, (String) null, (String) null, 0, (String) null, false, (String) null, (C20611315l1) null, 16383);
                }
                String strWQ2 = ((MentionStickerCell) c16hv.l0).N5().wQ2();
                String str5 = mapVQ2.get("shoot_way");
                String str6 = mapVQ2.get("content_source");
                String str7 = mapVQ2.get("content_type");
                c20610815kw.getClass();
                C20610815kw.LJI(c20611915l7, str2, str3, "sticker_mention", strWQ2, str5, str6, str7, null);
            }

            public static final void LIZ$4(C16HV c16hv, View view, String str) {
                final List list;
                final Boolean boolValueOf;
                final String str2;
                C15TA c15ta = C15TA.LIZ;
                C20525915Tl item = ((ExploreRecommendTopicCell) c16hv.l0).getItem();
                if (item == null || (list = item.LLILZ) == null) {
                    list = C13BV.INSTANCE;
                }
                final String strI5 = ((ExploreRecommendTopicCell) c16hv.l0).I5();
                final int bindingAdapterPosition = ((ExploreRecommendTopicCell) c16hv.l0).getBindingAdapterPosition();
                C20525915Tl item2 = ((ExploreRecommendTopicCell) c16hv.l0).getItem();
                if (item2 != null) {
                    boolValueOf = Boolean.valueOf(item2.LLILLL);
                } else {
                    boolValueOf = null;
                }
                C20525915Tl item3 = ((ExploreRecommendTopicCell) c16hv.l0).getItem();
                if (item3 == null || (str2 = item3.LLILLJJLI) == null) {
                    str2 = "";
                }
                c15ta.getClass();
                if (list.size() >= 4) {
                    C15TA.LJIILL(new Runnable() { // from class: X.0RTq
                        public final void LIZ() {
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJ(((ExploreCustomTopicStruct) ListProtector.get(list, 0)).topicId, "position1_topic_id");
                            c2344009Gk.LJ(((ExploreCustomTopicStruct) ListProtector.get(list, 1)).topicId, "position2_topic_id");
                            c2344009Gk.LJ(((ExploreCustomTopicStruct) ListProtector.get(list, 2)).topicId, "position3_topic_id");
                            c2344009Gk.LJ(((ExploreCustomTopicStruct) ListProtector.get(list, 3)).topicId, "position4_topic_id");
                            c2344009Gk.LJIIIIZZ("position1_topic_name", ((ExploreCustomTopicStruct) ListProtector.get(list, 0)).topicName);
                            c2344009Gk.LJIIIIZZ("position2_topic_name", ((ExploreCustomTopicStruct) ListProtector.get(list, 1)).topicName);
                            c2344009Gk.LJIIIIZZ("position3_topic_name", ((ExploreCustomTopicStruct) ListProtector.get(list, 2)).topicName);
                            c2344009Gk.LJIIIIZZ("position4_topic_name", ((ExploreCustomTopicStruct) ListProtector.get(list, 3)).topicName);
                            c2344009Gk.LJIIIIZZ("enter_from", "homepage_explore");
                            c2344009Gk.LJIIIIZZ("card_position", strI5);
                            c2344009Gk.LIZJ(bindingAdapterPosition, "card_index");
                            c2344009Gk.LIZJ(Intrinsics.LJFF(boolValueOf, Boolean.TRUE) ? 1 : 0, "is_first_screen");
                            c2344009Gk.LJIIIIZZ("request_id", str2);
                            c2344009Gk.LJIIIIZZ("is_first_refresh", C15UA.LIZIZ(str2));
                            C20684815ws.LJIILLIIL("ttexp_topic_card_show", c2344009Gk.LIZ);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("ExploreMobUtils@18af.logTopicCardShow$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("ExploreMobUtils@18af.logTopicCardShow$1");
                        }
                    });
                }
            }
        };
    }

    public C20750716Hx(final ExploreRecommendTopicCell exploreRecommendTopicCell, int i) {
        this.$t = i;
        final int i2 = 4;
        this.l0 = new InterfaceC2211931Bhf(exploreRecommendTopicCell, i2) { // from class: X.16HV
            public final int $t;
            public Object l0;

            @Override // X.InterfaceC2211931Bhf
            public final void LIZ(View view, String str) {
                switch (this.$t) {
                    case 0:
                        LIZ$0(this, view, str);
                        break;
                    case 1:
                        LIZ$1(this, view, str);
                        break;
                    case 2:
                        LIZ$2(this, view, str);
                        break;
                    case 3:
                        LIZ$3(this, view, str);
                        break;
                    case 4:
                        LIZ$4(this, view, str);
                        break;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$t = i2;
                this.l0 = exploreRecommendTopicCell;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static final void LIZ$0(C16HV c16hv, View view, String str) {
                C20611915l7 c20611915l7;
                C316580Cb2 c316580Cb2 = (C316580Cb2) ((MentionBaseVerticalCell) c16hv.l0).getItem();
                if (c316580Cb2 != null && (c20611915l7 = c316580Cb2.LL) != null) {
                    String str2 = ((MentionBaseVerticalCell) c16hv.l0).N5().vQ2().get("enter_from");
                    if (str2 == null) {
                        str2 = "";
                    }
                    C20610815kw c20610815kw = C20610815kw.LIZ;
                    String strU5 = ((MentionBaseVerticalCell) c16hv.l0).U5();
                    c20610815kw.getClass();
                    C20610815kw.LJI(c20611915l7, str2, str2, strU5, "", null, null, null, null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static final void LIZ$1(C16HV c16hv, View view, String str) {
                C20611915l7 c20611915l7;
                Map<String, String> mapVQ2 = ((TextCaptionMentionCell) c16hv.l0).N5().vQ2();
                C20610815kw c20610815kw = C20610815kw.LIZ;
                String str2 = mapVQ2.get("enter_from");
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                String str4 = mapVQ2.get("previous_page");
                if (str4 != null) {
                    str3 = str4;
                }
                C316580Cb2 c316580Cb2 = (C316580Cb2) ((TextCaptionMentionCell) c16hv.l0).getItem();
                if (c316580Cb2 == null || (c20611915l7 = c316580Cb2.LL) == null) {
                    c20611915l7 = new C20611915l7((String) null, 0, 0, (String) null, (String) null, (UrlModel) null, (String) null, (String) null, 0, (String) null, false, (String) null, (C20611315l1) null, 16383);
                }
                String strWQ2 = ((TextCaptionMentionCell) c16hv.l0).N5().wQ2();
                String str5 = mapVQ2.get("shoot_way");
                String str6 = mapVQ2.get("content_source");
                String str7 = mapVQ2.get("content_type");
                String str8 = mapVQ2.get("is_note");
                c20610815kw.getClass();
                C20610815kw.LJI(c20611915l7, str2, str3, "sticker_mention", strWQ2, str5, str6, str7, str8);
            }

            public static final void LIZ$2(C16HV v, View v2, String v3) {
                /*
                    java.lang.Object r0 = r8.l0
                    com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell r0 = (com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell) r0
                    X.0zJl r0 = r0.getItem()
                    X.0Cb2 r0 = (X.C316580Cb2) r0
                    if (r0 == 0) goto L4b
                    X.15l7 r2 = r0.LL
                    if (r2 == 0) goto L4b
                    java.lang.Object r0 = r8.l0
                    com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell r0 = (com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell) r0
                    com.ss.android.ugc.aweme.base.vm.MentionContainerViewModel r0 = r0.N5()
                    java.util.Map r1 = r0.vQ2()
                    java.lang.String r0 = "enter_from"
                    java.lang.Object r3 = r1.get(r0)
                    java.lang.String r3 = (java.lang.String) r3
                    if (r3 != 0) goto L28
                    java.lang.String r3 = ""
                L28:
                    X.15kw r1 = X.C20610815kw.LIZ
                    java.lang.Object r0 = r8.l0
                    com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell r0 = (com.ss.android.ugc.aweme.business.repost.cell.RepostMentionHorizontalCell) r0
                    com.ss.android.ugc.aweme.base.vm.MentionContainerViewModel r0 = r0.N5()
                    X.15lG r0 = r0.LL
                    if (r0 == 0) goto L4c
                    java.lang.String r5 = r0.LJIIL
                    int r0 = r5.length()
                    if (r0 <= 0) goto L4c
                L3e:
                    r7 = 0
                    java.lang.String r6 = ""
                    r1.getClass()
                    r4 = r3
                    r8 = r7
                    r9 = r7
                    r10 = r7
                    X.C20610815kw.LJI(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                L4b:
                    return
                L4c:
                    java.lang.String r5 = "repost_mention"
                    goto L3e
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C16HV.LIZ$2(X.16HV, android.view.View, java.lang.String):void");
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static final void LIZ$3(C16HV c16hv, View view, String str) {
                C20611915l7 c20611915l7;
                Map<String, String> mapVQ2 = ((MentionStickerCell) c16hv.l0).N5().vQ2();
                C20610815kw c20610815kw = C20610815kw.LIZ;
                String str2 = mapVQ2.get("enter_from");
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                String str4 = mapVQ2.get("previous_page");
                if (str4 != null) {
                    str3 = str4;
                }
                C316580Cb2 c316580Cb2 = (C316580Cb2) ((MentionStickerCell) c16hv.l0).getItem();
                if (c316580Cb2 == null || (c20611915l7 = c316580Cb2.LL) == null) {
                    c20611915l7 = new C20611915l7((String) null, 0, 0, (String) null, (String) null, (UrlModel) null, (String) null, (String) null, 0, (String) null, false, (String) null, (C20611315l1) null, 16383);
                }
                String strWQ2 = ((MentionStickerCell) c16hv.l0).N5().wQ2();
                String str5 = mapVQ2.get("shoot_way");
                String str6 = mapVQ2.get("content_source");
                String str7 = mapVQ2.get("content_type");
                c20610815kw.getClass();
                C20610815kw.LJI(c20611915l7, str2, str3, "sticker_mention", strWQ2, str5, str6, str7, null);
            }

            public static final void LIZ$4(C16HV c16hv, View view, String str) {
                final List list;
                final Boolean boolValueOf;
                final String str2;
                C15TA c15ta = C15TA.LIZ;
                C20525915Tl item = ((ExploreRecommendTopicCell) c16hv.l0).getItem();
                if (item == null || (list = item.LLILZ) == null) {
                    list = C13BV.INSTANCE;
                }
                final String strI5 = ((ExploreRecommendTopicCell) c16hv.l0).I5();
                final int bindingAdapterPosition = ((ExploreRecommendTopicCell) c16hv.l0).getBindingAdapterPosition();
                C20525915Tl item2 = ((ExploreRecommendTopicCell) c16hv.l0).getItem();
                if (item2 != null) {
                    boolValueOf = Boolean.valueOf(item2.LLILLL);
                } else {
                    boolValueOf = null;
                }
                C20525915Tl item3 = ((ExploreRecommendTopicCell) c16hv.l0).getItem();
                if (item3 == null || (str2 = item3.LLILLJJLI) == null) {
                    str2 = "";
                }
                c15ta.getClass();
                if (list.size() >= 4) {
                    C15TA.LJIILL(new Runnable() { // from class: X.0RTq
                        public final void LIZ() {
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJ(((ExploreCustomTopicStruct) ListProtector.get(list, 0)).topicId, "position1_topic_id");
                            c2344009Gk.LJ(((ExploreCustomTopicStruct) ListProtector.get(list, 1)).topicId, "position2_topic_id");
                            c2344009Gk.LJ(((ExploreCustomTopicStruct) ListProtector.get(list, 2)).topicId, "position3_topic_id");
                            c2344009Gk.LJ(((ExploreCustomTopicStruct) ListProtector.get(list, 3)).topicId, "position4_topic_id");
                            c2344009Gk.LJIIIIZZ("position1_topic_name", ((ExploreCustomTopicStruct) ListProtector.get(list, 0)).topicName);
                            c2344009Gk.LJIIIIZZ("position2_topic_name", ((ExploreCustomTopicStruct) ListProtector.get(list, 1)).topicName);
                            c2344009Gk.LJIIIIZZ("position3_topic_name", ((ExploreCustomTopicStruct) ListProtector.get(list, 2)).topicName);
                            c2344009Gk.LJIIIIZZ("position4_topic_name", ((ExploreCustomTopicStruct) ListProtector.get(list, 3)).topicName);
                            c2344009Gk.LJIIIIZZ("enter_from", "homepage_explore");
                            c2344009Gk.LJIIIIZZ("card_position", strI5);
                            c2344009Gk.LIZJ(bindingAdapterPosition, "card_index");
                            c2344009Gk.LIZJ(Intrinsics.LJFF(boolValueOf, Boolean.TRUE) ? 1 : 0, "is_first_screen");
                            c2344009Gk.LJIIIIZZ("request_id", str2);
                            c2344009Gk.LJIIIIZZ("is_first_refresh", C15UA.LIZIZ(str2));
                            C20684815ws.LJIILLIIL("ttexp_topic_card_show", c2344009Gk.LIZ);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("ExploreMobUtils@18af.logTopicCardShow$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("ExploreMobUtils@18af.logTopicCardShow$1");
                        }
                    });
                }
            }
        };
        this.l1 = new AwS575S0100000_31(exploreRecommendTopicCell, 1494);
    }
}
