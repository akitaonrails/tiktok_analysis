package X;

import com.ss.android.ugc.aweme.im.message.template.component.ImageStreamBlockComponent;
import com.ss.android.ugc.aweme.im.message.template.component.MarkdownStreamBlockComponent;
import com.ss.android.ugc.aweme.im.message.template.component.MediaStatusComponent;
import com.ss.android.ugc.aweme.im.message.template.component.MetadataComponent;
import com.ss.android.ugc.aweme.im.message.template.component.MetadataEntryComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StreamBlockActionComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StreamBlockComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StreamBlockContentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StreamBlockTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StreamReplyTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextStreamBlockComponent;
import com.ss.android.ugc.aweme.im.streaming.api.RetryInfoComponent;
import com.ss.android.ugc.aweme.im.streaming.api.RetryStrategyComponent;
import com.ss.android.ugc.aweme.im.streaming.api.StreamingResponseData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Zh3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906350Zh3 {
    public static final StreamBlockComponent LIZ(C906290Zgx c906290Zgx) {
        StreamReplyTypeComponent streamReplyTypeComponent;
        StreamBlockTypeComponent streamBlockTypeComponent;
        StreamBlockContentComponent markdown;
        MediaStatusComponent mediaStatusComponent;
        int iIntValue;
        int iIntValue2;
        StreamBlockActionComponent streamBlockActionComponent;
        MetadataComponent metadataComponent;
        String str = c906290Zgx.block_id;
        if (str == null) {
            str = "";
        }
        EnumC906630ZhV enumC906630ZhV = c906290Zgx.reply_type;
        if (enumC906630ZhV == null) {
            streamReplyTypeComponent = StreamReplyTypeComponent.UNKNOWN;
        } else {
            StreamReplyTypeComponent[] streamReplyTypeComponentArrValues = StreamReplyTypeComponent.values();
            int length = streamReplyTypeComponentArrValues.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    streamReplyTypeComponent = streamReplyTypeComponentArrValues[i];
                    if (streamReplyTypeComponent.getValue() == enumC906630ZhV.getValue()) {
                        break;
                    }
                    i++;
                } else {
                    streamReplyTypeComponent = StreamReplyTypeComponent.UNKNOWN;
                    break;
                }
            }
        }
        EnumC906560ZhO enumC906560ZhO = c906290Zgx.type;
        if (enumC906560ZhO == null) {
            streamBlockTypeComponent = StreamBlockTypeComponent.UNKNOWN;
        } else {
            StreamBlockTypeComponent[] streamBlockTypeComponentArrValues = StreamBlockTypeComponent.values();
            int length2 = streamBlockTypeComponentArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 < length2) {
                    streamBlockTypeComponent = streamBlockTypeComponentArrValues[i2];
                    if (streamBlockTypeComponent.getValue() == enumC906560ZhO.getValue()) {
                        break;
                    }
                    i2++;
                } else {
                    streamBlockTypeComponent = StreamBlockTypeComponent.UNKNOWN;
                    break;
                }
            }
        }
        C906380Zh6 c906380Zh6 = c906290Zgx.content;
        if (c906380Zh6 == null) {
            markdown = StreamBlockContentComponent.Unknown.INSTANCE;
        } else if (c906380Zh6.text_stream_block != null) {
            String str2 = c906380Zh6.text_stream_block.text;
            if (str2 == null) {
                str2 = "";
            }
            markdown = new StreamBlockContentComponent.Text(new TextStreamBlockComponent(str2));
        } else if (c906380Zh6.image_stream_block != null) {
            C906370Zh5 c906370Zh5 = c906380Zh6.image_stream_block;
            EnumC906550ZhN enumC906550ZhN = c906370Zh5.status;
            if (enumC906550ZhN == null) {
                mediaStatusComponent = MediaStatusComponent.UNKNOWN;
            } else {
                MediaStatusComponent[] mediaStatusComponentArrValues = MediaStatusComponent.values();
                int length3 = mediaStatusComponentArrValues.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length3) {
                        mediaStatusComponent = mediaStatusComponentArrValues[i3];
                        if (mediaStatusComponent.getValue() == enumC906550ZhN.getValue()) {
                            break;
                        }
                        i3++;
                    } else {
                        mediaStatusComponent = MediaStatusComponent.UNKNOWN;
                        break;
                    }
                }
            }
            Integer num = c906370Zh5.width;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            Integer num2 = c906370Zh5.height;
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = 0;
            }
            String str3 = c906370Zh5.uri;
            if (str3 == null) {
                str3 = "";
            }
            List<String> list = c906370Zh5.url;
            String str4 = c906370Zh5.display_name;
            if (str4 == null) {
                str4 = "";
            }
            markdown = new StreamBlockContentComponent.Image(new ImageStreamBlockComponent(mediaStatusComponent, iIntValue, iIntValue2, str3, list, str4));
        } else if (c906380Zh6.markdown_stream_block != null) {
            String str5 = c906380Zh6.markdown_stream_block.text;
            if (str5 == null) {
                str5 = "";
            }
            markdown = new StreamBlockContentComponent.Markdown(new MarkdownStreamBlockComponent(str5));
        } else {
            markdown = StreamBlockContentComponent.Unknown.INSTANCE;
        }
        EnumC906310Zgz enumC906310Zgz = c906290Zgx.action;
        if (enumC906310Zgz == null) {
            streamBlockActionComponent = StreamBlockActionComponent.UNKNOWN;
        } else {
            StreamBlockActionComponent[] streamBlockActionComponentArrValues = StreamBlockActionComponent.values();
            int length4 = streamBlockActionComponentArrValues.length;
            int i4 = 0;
            while (true) {
                if (i4 < length4) {
                    streamBlockActionComponent = streamBlockActionComponentArrValues[i4];
                    if (streamBlockActionComponent.getValue() == enumC906310Zgz.getValue()) {
                        break;
                    }
                    i4++;
                } else {
                    streamBlockActionComponent = StreamBlockActionComponent.UNKNOWN;
                    break;
                }
            }
        }
        C906450ZhD c906450ZhD = c906290Zgx.metadata;
        if (c906450ZhD == null) {
            MetadataComponent.Companion.getClass();
            metadataComponent = MetadataComponent.EMPTY$delegate.getValue();
        } else {
            List<C906460ZhE> list2 = c906450ZhD.kv;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (C906460ZhE c906460ZhE : list2) {
                String str6 = c906460ZhE.key;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = c906460ZhE.value;
                if (str7 == null) {
                    str7 = "";
                }
                arrayList.add(new MetadataEntryComponent(str6, str7));
            }
            metadataComponent = new MetadataComponent(arrayList);
        }
        return new StreamBlockComponent(str, streamReplyTypeComponent, streamBlockTypeComponent, markdown, streamBlockActionComponent, metadataComponent);
    }

    public static final Map<String, String> LIZIZ(C906200Zgo c906200Zgo) {
        C13DA c13da = new C13DA();
        c13da.put("business_type", c906200Zgo.LIZ);
        c13da.put("reply_client_message_id", c906200Zgo.LIZIZ);
        c13da.put("conversation_short_id", String.valueOf(c906200Zgo.LIZJ));
        Long l = c906200Zgo.LJ;
        if (l != null) {
            c13da.put("reply_server_message_id", String.valueOf(l.longValue()));
        }
        c13da.put("interrupted_seq_id", String.valueOf(c906200Zgo.LIZLLL));
        String str = c906200Zgo.LJFF;
        if (str != null) {
            c13da.put("send_client_message_id", str);
        }
        Long l2 = c906200Zgo.LJI;
        if (l2 != null) {
            c13da.put("send_server_message_id", String.valueOf(l2.longValue()));
        }
        String str2 = c906200Zgo.LJII;
        if (str2 != null) {
            c13da.put("business_scene", str2);
        }
        return c13da.build();
    }

    public static final C906450ZhD LIZJ(MetadataComponent metadataComponent) {
        C906500ZhI c906500ZhI = new C906500ZhI();
        List<MetadataEntryComponent> list = metadataComponent.entries;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (MetadataEntryComponent metadataEntryComponent : list) {
            C906510ZhJ c906510ZhJ = new C906510ZhJ();
            c906510ZhJ.LIZLLL = metadataEntryComponent.key;
            c906510ZhJ.LJ = metadataEntryComponent.value;
            arrayList.add(c906510ZhJ.build());
        }
        C1516540pZE.LIZ(arrayList);
        c906500ZhI.LIZLLL = arrayList;
        return c906500ZhI.build();
    }

    public static final C906380Zh6 LIZLLL(StreamBlockContentComponent streamBlockContentComponent) {
        if (streamBlockContentComponent instanceof StreamBlockContentComponent.Text) {
            C906520ZhK c906520ZhK = new C906520ZhK();
            TextStreamBlockComponent textStreamBlockComponent = ((StreamBlockContentComponent.Text) streamBlockContentComponent).textStreamBlock;
            C906540ZhM c906540ZhM = new C906540ZhM();
            c906540ZhM.LIZLLL = textStreamBlockComponent.text;
            c906520ZhK.LIZLLL = c906540ZhM.build();
            return c906520ZhK.build();
        }
        if (streamBlockContentComponent instanceof StreamBlockContentComponent.Image) {
            C906520ZhK c906520ZhK2 = new C906520ZhK();
            ImageStreamBlockComponent imageStreamBlockComponent = ((StreamBlockContentComponent.Image) streamBlockContentComponent).imageStreamBlock;
            C906480ZhG c906480ZhG = new C906480ZhG();
            c906480ZhG.LIZLLL = EnumC906550ZhN.fromValue(imageStreamBlockComponent.status.getValue());
            c906480ZhG.LJ = Integer.valueOf(imageStreamBlockComponent.width);
            c906480ZhG.LJFF = Integer.valueOf(imageStreamBlockComponent.height);
            c906480ZhG.LJI = imageStreamBlockComponent.uri;
            List<String> list = imageStreamBlockComponent.url;
            C1516540pZE.LIZ(list);
            c906480ZhG.LJII = list;
            c906480ZhG.LJIIIIZZ = imageStreamBlockComponent.displayName;
            c906520ZhK2.LJ = c906480ZhG.build();
            return c906520ZhK2.build();
        }
        if (streamBlockContentComponent instanceof StreamBlockContentComponent.Markdown) {
            C906520ZhK c906520ZhK3 = new C906520ZhK();
            MarkdownStreamBlockComponent markdownStreamBlockComponent = ((StreamBlockContentComponent.Markdown) streamBlockContentComponent).markdownStreamBlock;
            C906530ZhL c906530ZhL = new C906530ZhL();
            c906530ZhL.LIZLLL = markdownStreamBlockComponent.text;
            c906520ZhK3.LJFF = c906530ZhL.build();
            return c906520ZhK3.build();
        }
        if (streamBlockContentComponent instanceof StreamBlockContentComponent.Unknown) {
            return new C906520ZhK().build();
        }
        throw new C1954807lC();
    }

    public static final StreamingResponseData LJ(C906250Zgt c906250Zgt, String str) {
        String string;
        String string2;
        int iIntValue;
        boolean zBooleanValue;
        int iIntValue2;
        int iIntValue3;
        boolean zBooleanValue2;
        RetryInfoComponent retryInfoComponent;
        int iIntValue4;
        boolean zBooleanValue3;
        RetryStrategyComponent retryStrategyComponent;
        long jLongValue;
        int iIntValue5;
        String str2 = c906250Zgt.reply_client_message_id;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        Long l = c906250Zgt.reply_server_message_id;
        if (l != null) {
            string = l.toString();
        } else {
            string = null;
        }
        Long l2 = c906250Zgt.send_server_message_id;
        if (l2 != null) {
            string2 = l2.toString();
        } else {
            string2 = null;
        }
        String str4 = c906250Zgt.send_client_message_id;
        Integer num = c906250Zgt.message_type;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        String str5 = c906250Zgt.scene;
        if (str5 == null) {
            str5 = "";
        }
        List<C906290Zgx> list = c906250Zgt.blocks;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C906290Zgx> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(LIZ(it2.next()));
        }
        Boolean bool = c906250Zgt.is_finish;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        Integer num2 = c906250Zgt.seq_id;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 0;
        }
        Integer num3 = c906250Zgt.first_seq_id;
        if (num3 != null) {
            iIntValue3 = num3.intValue();
        } else {
            iIntValue3 = 0;
        }
        Boolean bool2 = c906250Zgt.reset_content;
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        C906230Zgr c906230Zgr = c906250Zgt.retry_info;
        if (c906230Zgr != null) {
            Boolean bool3 = c906230Zgr.retryable;
            if (bool3 != null) {
                zBooleanValue3 = bool3.booleanValue();
            } else {
                zBooleanValue3 = false;
            }
            EnumC906330Zh1 enumC906330Zh1 = c906230Zgr.strategy;
            if (enumC906330Zh1 == null) {
                retryStrategyComponent = RetryStrategyComponent.NONE;
            } else {
                RetryStrategyComponent[] retryStrategyComponentArrValues = RetryStrategyComponent.values();
                int length = retryStrategyComponentArrValues.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        retryStrategyComponent = retryStrategyComponentArrValues[i];
                        if (retryStrategyComponent.getValue() == enumC906330Zh1.getValue()) {
                            break;
                        }
                        i++;
                    } else {
                        retryStrategyComponent = RetryStrategyComponent.NONE;
                        break;
                    }
                }
            }
            Long l3 = c906230Zgr.retry_delay_ms;
            if (l3 != null) {
                jLongValue = l3.longValue();
            } else {
                jLongValue = 0;
            }
            Integer num4 = c906230Zgr.max_retries;
            if (num4 != null) {
                iIntValue5 = num4.intValue();
            } else {
                iIntValue5 = 0;
            }
            retryInfoComponent = new RetryInfoComponent(zBooleanValue3, retryStrategyComponent, jLongValue, iIntValue5);
        } else {
            retryInfoComponent = null;
        }
        Integer num5 = c906250Zgt.error_code;
        if (num5 != null) {
            iIntValue4 = num5.intValue();
        } else {
            iIntValue4 = 0;
        }
        String str6 = c906250Zgt.error_message;
        if (str6 != null) {
            str3 = str6;
        }
        return new StreamingResponseData(str2, string, string2, str4, iIntValue, str5, arrayList, zBooleanValue, iIntValue2, iIntValue3, zBooleanValue2, retryInfoComponent, iIntValue4, str3, str);
    }
}
