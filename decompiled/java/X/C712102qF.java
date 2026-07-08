package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02qF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C712102qF extends Message<C712102qF, C712202qG> {
    public static final ProtoAdapter<C712102qF> ADAPTER = new ProtoAdapter<C712102qF>() { // from class: X.02qE
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C712102qF decode(ProtoReader protoReader) {
            C712102qF c712102qF = new C712102qF();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 14) {
                                    if (iNextTag != 15) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c712102qF.save_text = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c712102qF.threshold_gap_text = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c712102qF.add_on_ratio = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c712102qF.sub_title = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c712102qF.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c712102qF;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C712102qF c712102qF) {
            C712102qF c712102qF2 = c712102qF;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c712102qF2.title) + protoAdapter.encodedSizeWithTag(2, c712102qF2.sub_title) + ProtoAdapter.INT32.encodedSizeWithTag(3, c712102qF2.add_on_ratio) + protoAdapter.encodedSizeWithTag(14, c712102qF2.threshold_gap_text) + protoAdapter.encodedSizeWithTag(15, c712102qF2.save_text) + c712102qF2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C712102qF c712102qF) {
        }
    };
    public Integer add_on_ratio;
    public String save_text;
    public String sub_title;
    public String threshold_gap_text;
    public String title;

    public C712102qF() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C712202qG newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
