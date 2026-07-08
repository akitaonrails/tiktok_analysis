package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ve, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C745602ve extends Message<C745602ve, C745702vf> {
    public static final ProtoAdapter<C745602ve> ADAPTER = new ProtoAdapter<C745602ve>() { // from class: X.02vd
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C745602ve decode(ProtoReader protoReader) {
            C745602ve c745602ve = new C745602ve();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        if (iNextTag != 50) {
                                            if (iNextTag != 200) {
                                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                            } else {
                                                c745602ve.da_info = ProtoAdapter.STRING.decode(protoReader);
                                            }
                                        } else {
                                            c745602ve.dialog_exit = C5293024l.ADAPTER.decode(protoReader);
                                        }
                                    } else {
                                        c745602ve.click_to_popup_privacy = ProtoAdapter.BOOL.decode(protoReader);
                                    }
                                } else {
                                    c745602ve.learn_more_text = C5431029t.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c745602ve.learn_more_title = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c745602ve.hint_texts.add(C5431029t.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c745602ve.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c745602ve;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C745602ve c745602ve) {
            C745602ve c745602ve2 = c745602ve;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c745602ve2.title);
            ProtoAdapter<C5431029t> protoAdapter2 = C5431029t.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.asRepeated().encodedSizeWithTag(2, c745602ve2.hint_texts) + protoAdapter.encodedSizeWithTag(3, c745602ve2.learn_more_title) + protoAdapter2.encodedSizeWithTag(4, c745602ve2.learn_more_text) + ProtoAdapter.BOOL.encodedSizeWithTag(5, c745602ve2.click_to_popup_privacy) + C5293024l.ADAPTER.encodedSizeWithTag(50, c745602ve2.dialog_exit) + protoAdapter.encodedSizeWithTag(200, c745602ve2.da_info) + c745602ve2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C745602ve c745602ve) {
        }
    };
    public Boolean click_to_popup_privacy;
    public String da_info;
    public C5293024l dialog_exit;
    public List<C5431029t> hint_texts;
    public C5431029t learn_more_text;
    public String learn_more_title;
    public String title;

    public C745602ve() {
        super(ADAPTER, ByteString.EMPTY);
        this.hint_texts = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C745702vf newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
