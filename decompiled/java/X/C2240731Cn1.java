package X;

import com.ss.android.ugc.aweme.im.message.template.card.StreamingCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageStreamBlockComponent;
import com.ss.android.ugc.aweme.im.message.template.component.MarkdownStreamBlockComponent;
import com.ss.android.ugc.aweme.im.message.template.component.MediaStatusComponent;
import com.ss.android.ugc.aweme.im.message.template.component.MetadataComponent;
import com.ss.android.ugc.aweme.im.message.template.component.MetadataEntryComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StreamBlockActionComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StreamBlockComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StreamBlockContentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StreamBlockTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StreamReplyTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StreamStatusComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextStreamBlockComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1Cn1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2240731Cn1 {
    public static final StreamingCardTemplate LIZ(C2240841CnC c2240841CnC, C2242321Cpa c2242321Cpa, C2242801CqM c2242801CqM, C2242771CqJ c2242771CqJ) {
        String str;
        StreamStatusComponent streamStatusComponent;
        FallbackInfoComponent fallbackInfoComponent;
        PreviewHintComponent previewHintComponentLIZ;
        BaseRequestComponent baseRequestComponent;
        BaseResponseComponent baseResponseComponent;
        AttachmentComponent attachmentComponentLIZ;
        BaseHeaderComponent baseHeaderComponentLIZIZ;
        BaseFooterComponent baseFooterComponentLIZ;
        StreamReplyTypeComponent streamReplyTypeComponent;
        StreamBlockTypeComponent streamBlockTypeComponent;
        StreamBlockContentComponent markdown;
        MediaStatusComponent mediaStatusComponent;
        int iIntValue;
        int iIntValue2;
        StreamBlockActionComponent streamBlockActionComponent;
        MetadataComponent value;
        List<C2240741Cn2> list = c2240841CnC.blocks;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C2240741Cn2> it2 = list.iterator();
        while (true) {
            str = "";
            if (!it2.hasNext()) {
                break;
            }
            C2240741Cn2 next = it2.next();
            String str2 = next.block_id;
            if (str2 == null) {
                str2 = "";
            }
            EnumC906790Zhl enumC906790Zhl = next.reply_type;
            if (enumC906790Zhl == null) {
                streamReplyTypeComponent = StreamReplyTypeComponent.UNKNOWN;
            } else {
                StreamReplyTypeComponent[] streamReplyTypeComponentArrValues = StreamReplyTypeComponent.values();
                int length = streamReplyTypeComponentArrValues.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        streamReplyTypeComponent = streamReplyTypeComponentArrValues[i];
                        if (streamReplyTypeComponent.getValue() == enumC906790Zhl.getValue()) {
                            break;
                        }
                        i++;
                    } else {
                        streamReplyTypeComponent = StreamReplyTypeComponent.UNKNOWN;
                        break;
                    }
                }
            }
            EnumC2240771Cn5 enumC2240771Cn5 = next.type;
            if (enumC2240771Cn5 == null) {
                streamBlockTypeComponent = StreamBlockTypeComponent.UNKNOWN;
            } else {
                StreamBlockTypeComponent[] streamBlockTypeComponentArrValues = StreamBlockTypeComponent.values();
                int length2 = streamBlockTypeComponentArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length2) {
                        streamBlockTypeComponent = streamBlockTypeComponentArrValues[i2];
                        if (streamBlockTypeComponent.getValue() == enumC2240771Cn5.getValue()) {
                            break;
                        }
                        i2++;
                    } else {
                        streamBlockTypeComponent = StreamBlockTypeComponent.UNKNOWN;
                        break;
                    }
                }
            }
            C2240171Cm7 c2240171Cm7 = next.content;
            if (c2240171Cm7 == null) {
                markdown = StreamBlockContentComponent.Unknown.INSTANCE;
            } else if (c2240171Cm7.text_stream_block != null) {
                String str3 = c2240171Cm7.text_stream_block.text;
                if (str3 == null) {
                    str3 = "";
                }
                markdown = new StreamBlockContentComponent.Text(new TextStreamBlockComponent(str3));
            } else if (c2240171Cm7.image_stream_block != null) {
                C2240251CmF c2240251CmF = c2240171Cm7.image_stream_block;
                EnumC2240311CmL enumC2240311CmL = c2240251CmF.status;
                if (enumC2240311CmL == null) {
                    mediaStatusComponent = MediaStatusComponent.UNKNOWN;
                } else {
                    MediaStatusComponent[] mediaStatusComponentArrValues = MediaStatusComponent.values();
                    int length3 = mediaStatusComponentArrValues.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length3) {
                            mediaStatusComponent = mediaStatusComponentArrValues[i3];
                            if (mediaStatusComponent.getValue() == enumC2240311CmL.getValue()) {
                                break;
                            }
                            i3++;
                        } else {
                            mediaStatusComponent = MediaStatusComponent.UNKNOWN;
                            break;
                        }
                    }
                }
                Integer num = c2240251CmF.width;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                Integer num2 = c2240251CmF.height;
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                String str4 = c2240251CmF.uri;
                if (str4 == null) {
                    str4 = "";
                }
                List<String> list2 = c2240251CmF.url;
                String str5 = c2240251CmF.display_name;
                if (str5 == null) {
                    str5 = "";
                }
                markdown = new StreamBlockContentComponent.Image(new ImageStreamBlockComponent(mediaStatusComponent, iIntValue, iIntValue2, str4, list2, str5));
            } else if (c2240171Cm7.markdown_stream_block != null) {
                String str6 = c2240171Cm7.markdown_stream_block.text;
                if (str6 == null) {
                    str6 = "";
                }
                markdown = new StreamBlockContentComponent.Markdown(new MarkdownStreamBlockComponent(str6));
            } else {
                markdown = StreamBlockContentComponent.Unknown.INSTANCE;
            }
            EnumC906750Zhh enumC906750Zhh = next.action;
            if (enumC906750Zhh == null) {
                streamBlockActionComponent = StreamBlockActionComponent.UNKNOWN;
            } else {
                StreamBlockActionComponent[] streamBlockActionComponentArrValues = StreamBlockActionComponent.values();
                int length4 = streamBlockActionComponentArrValues.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length4) {
                        streamBlockActionComponent = streamBlockActionComponentArrValues[i4];
                        if (streamBlockActionComponent.getValue() == enumC906750Zhh.getValue()) {
                            break;
                        }
                        i4++;
                    } else {
                        streamBlockActionComponent = StreamBlockActionComponent.UNKNOWN;
                        break;
                    }
                }
            }
            C1C3L c1c3l = next.metadata;
            if (c1c3l != null) {
                List<C1C3O> list3 = c1c3l.kv;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                for (C1C3O c1c3o : list3) {
                    String str7 = c1c3o.key;
                    if (str7 == null) {
                        str7 = "";
                    }
                    String str8 = c1c3o.value;
                    if (str8 == null) {
                        str8 = "";
                    }
                    arrayList2.add(new MetadataEntryComponent(str7, str8));
                }
                value = new MetadataComponent(arrayList2);
            } else {
                MetadataComponent.Companion.getClass();
                value = MetadataComponent.EMPTY$delegate.getValue();
            }
            arrayList.add(new StreamBlockComponent(str2, streamReplyTypeComponent, streamBlockTypeComponent, markdown, streamBlockActionComponent, value));
        }
        EnumC2240801Cn8 enumC2240801Cn8 = c2240841CnC.stream_status;
        if (enumC2240801Cn8 == null) {
            streamStatusComponent = StreamStatusComponent.UNKNOWN;
        } else {
            StreamStatusComponent[] streamStatusComponentArrValues = StreamStatusComponent.values();
            int length5 = streamStatusComponentArrValues.length;
            int i5 = 0;
            while (true) {
                if (i5 < length5) {
                    streamStatusComponent = streamStatusComponentArrValues[i5];
                    if (streamStatusComponent.getValue() == enumC2240801Cn8.getValue()) {
                        break;
                    }
                    i5++;
                } else {
                    streamStatusComponent = StreamStatusComponent.UNKNOWN;
                    break;
                }
            }
        }
        String str9 = c2240841CnC.send_server_message_id;
        if (str9 != null) {
            str = str9;
        }
        C2242211CpP c2242211CpP = c2240841CnC.fallback_info;
        if (c2242211CpP != null) {
            fallbackInfoComponent = C2242131CpH.LIZ(c2242211CpP);
        } else {
            fallbackInfoComponent = new FallbackInfoComponent(7);
        }
        C2243941CsC c2243941CsC = c2240841CnC.preview_hint;
        if (c2243941CsC != null) {
            previewHintComponentLIZ = C2243921CsA.LIZ(c2243941CsC);
        } else {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        C1CH0 c1ch0 = c2240841CnC.req_base;
        if (c1ch0 != null) {
            baseRequestComponent = C1CH2.LIZ(c1ch0);
        } else {
            baseRequestComponent = new BaseRequestComponent(0);
        }
        C2241571CoN c2241571CoN = c2240841CnC.resp_base;
        if (c2241571CoN != null) {
            baseResponseComponent = C2241581CoO.LIZIZ(c2241571CoN);
        } else {
            baseResponseComponent = new BaseResponseComponent(0L, 15);
        }
        if (c2242771CqJ != null) {
            attachmentComponentLIZ = C2242791CqL.LIZ(c2242771CqJ);
        } else {
            attachmentComponentLIZ = null;
        }
        if (c2242321Cpa != null) {
            baseHeaderComponentLIZIZ = C2242351Cpd.LIZIZ(c2242321Cpa);
        } else {
            baseHeaderComponentLIZIZ = null;
        }
        if (c2242801CqM != null) {
            baseFooterComponentLIZ = C2242841CqQ.LIZ(c2242801CqM);
        } else {
            baseFooterComponentLIZ = null;
        }
        return new StreamingCardTemplate(arrayList, streamStatusComponent, str, fallbackInfoComponent, previewHintComponentLIZ, baseRequestComponent, baseResponseComponent, attachmentComponentLIZ, baseHeaderComponentLIZIZ, baseFooterComponentLIZ);
    }
}
